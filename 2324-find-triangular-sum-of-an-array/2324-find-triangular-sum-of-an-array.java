class Solution {
    public int triangularSum(int[] nums) {
        while (nums.length > 1) {
            int[] next = new int[nums.length - 1];
            for (int i = 0; i < nums.length - 1; i++) {
                next[i] = (nums[i] + nums[i + 1]) % 10;
            }
            nums = next;
        }
        return nums[0];
    }
}
