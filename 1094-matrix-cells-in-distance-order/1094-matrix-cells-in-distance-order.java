import java.util.*;

class Solution {
    public int[][] allCellsDistOrder(int R, int C, int r0, int c0) {
        TreeMap<Integer, List<int[]>> map = new TreeMap<>();

        // Step 1: calculate distance for each cell
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                int dist = Math.abs(i - r0) + Math.abs(j - c0);
                map.putIfAbsent(dist, new ArrayList<>()); 
                map.get(dist).add(new int[]{i, j});
            }
        }

        // Step 2: flatten map into result
        int[][] res = new int[R*C][2];
        int idx = 0;
        for (Map.Entry<Integer, List<int[]>> entry : map.entrySet()) {
            for (int[] cell : entry.getValue()) {
                res[idx++] = cell;
            }
        }
        return res;
    }
}
