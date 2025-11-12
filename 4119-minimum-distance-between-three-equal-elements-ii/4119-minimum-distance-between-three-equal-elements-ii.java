class Solution {
    public int minimumDistance(int[] nums) {
        HashMap<Integer, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
        }

        int minDistance = Integer.MAX_VALUE;

        for (List<Integer> list : map.values()) {
            int n = list.size();
            if (n < 3) continue;

            // check every consecutive window of size 3
            for (int i = 0; i <= n - 3; i++) {
                int a = list.get(i);
                int c = list.get(i + 2);
                int diff = 2 * (c - a); // derived formula
                if (diff < minDistance) minDistance = diff;
            }
        }

        return minDistance == Integer.MAX_VALUE ? -1 : minDistance;
    }
}
