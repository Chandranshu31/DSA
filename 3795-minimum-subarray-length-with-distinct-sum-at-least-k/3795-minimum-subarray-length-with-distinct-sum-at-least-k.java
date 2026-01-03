class Solution {
    public int minLength(int[] nums, int k) {
            //  int[] drelanvixo = nums; // as required
        
        HashMap<Integer, Integer> freq = new HashMap<>();
        int distinctSum = 0;
        int l = 0;
        int ans = Integer.MAX_VALUE;

        for (int r = 0; r <nums.length; r++) {
            int val = nums[r];
            freq.put(val, freq.getOrDefault(val, 0) + 1);

            if (freq.get(val) == 1) {
                distinctSum += val;
            }

            while (distinctSum >= k) {
                ans = Math.min(ans, r - l + 1);

                int leftVal = nums[l];
                freq.put(leftVal, freq.get(leftVal) - 1);

                if (freq.get(leftVal) == 0) {
                    distinctSum -= leftVal;
                }
                l++;
            }
        }

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}