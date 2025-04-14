class Solution {
    public int unequalTriplets(int[] nums) {
        int n = nums.length;
        int count = 0;
        if (n < 3) { // we atleast need 3 elements to have triplets
            return 0;
        }
        for (int i = 0; i <= n - 3; i++) {
            for (int j = i + 1; j <= n - 2; j++) {
                if (nums[i]!=nums[j]) {
                    for (int k = j + 1; k <= n - 1; k++) {
                        if (nums[j]!=nums[k]  && nums[k]!=nums[i]) {
                            count++;
                        }
                    }
                }
            }
        }

        return count;

    }
}