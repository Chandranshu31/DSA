class Solution {
    public int minimumOperations(int[] nums) {
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }

        Arrays.sort(nums); // Sort to get smallest positive easily
        int count = 0;

        while (totalSum > 0) {
            int bit = -1;

            // Find the first non-zero number to subtract
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] > 0) {
                    bit = nums[i];
                    break;
                }
            }

            // Subtract 'bit' from all elements
            for (int j = 0; j < nums.length; j++) {
                if(nums[j]==0){
                    continue;
                }
                nums[j] = nums[j] - bit;
            }

            // Recalculate total sum
            totalSum = 0;
            for (int k = 0; k < nums.length; k++) {
                totalSum += nums[k];
            }

            count++;
        }

        return count;
    }
}
