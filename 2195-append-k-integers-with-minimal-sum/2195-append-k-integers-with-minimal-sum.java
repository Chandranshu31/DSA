class Solution {
    public long minimalKSum(int[] nums, int k) {
        Arrays.sort(nums);

        long sum = 0;
        long curr = 1;

        for (int num : nums) {
            if (num < curr) continue;

            if (num > curr) {
                long cnt = Math.min(k, num - curr);
                sum += (curr + (curr + cnt - 1)) * cnt / 2;
                k -= cnt;
                curr += cnt;
            }

            if (k == 0) break;
            curr = num + 1;
        }

        // if still need numbers after last element
        if (k > 0) {
            sum += (curr + (curr + k - 1)) * k / 2;
        }

        return sum;
    }
}
//(b - a + 1) * (a + b) / 2 sum of numberes from a to b

/**Another approach but TLE
 */
