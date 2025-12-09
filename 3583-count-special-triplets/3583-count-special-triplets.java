
class Solution {
    private static final long MOD = 1_000_000_007L;

    public int specialTriplets(int[] nums) {
        int n = nums.length;
        if (n < 3) return 0;

        Map<Integer, Integer> freqPrev = new HashMap<>();
        Map<Integer, Integer> freqNext = new HashMap<>();

        for (int v : nums) {
            freqNext.put(v, freqNext.getOrDefault(v, 0) + 1);
        }

        long ans = 0L;

        for (int j = 0; j < n; j++) {
            int mid = nums[j];

            // move mid
            freqNext.put(mid, freqNext.get(mid) - 1);
            if (freqNext.get(mid) == 0) freqNext.remove(mid);

            if (j > 0 && j < n - 1) {
                int target = mid * 2; 
                long leftCount  = freqPrev.getOrDefault(target, 0);
                long rightCount = freqNext.getOrDefault(target, 0);

                long add = (leftCount * rightCount) % MOD;
                ans = (ans + add) % MOD;
            }

            // add mid to left
            freqPrev.put(mid, freqPrev.getOrDefault(mid, 0) + 1);
        }

        return (int) ans;
    }
}
