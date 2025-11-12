class Solution {
    public int minimumDistance(int[] nums) {
        HashMap<Integer, List<Integer>> map = new HashMap<>();

        // store indices for each number
        for (int i = 0; i < nums.length; i++) {
            map.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
        }

        int minDistance = Integer.MAX_VALUE;

        // for each number’s index list
        for (int k : map.keySet()) {
            List<Integer> list = map.get(k);
            int n = list.size();

            if (n < 3) continue; // skip if less than 3 occurrences

            // check all possible triplets of indices
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    for (int l = j + 1; l < n; l++) {
                        int a = list.get(i);
                        int b = list.get(j);
                        int c = list.get(l);

                        int diff = Math.abs(a - b) + Math.abs(b - c) + Math.abs(c - a);
                        minDistance = Math.min(minDistance, diff);
                    }
                }
            }
        }

        return minDistance == Integer.MAX_VALUE ? -1 : minDistance;
    }
}
