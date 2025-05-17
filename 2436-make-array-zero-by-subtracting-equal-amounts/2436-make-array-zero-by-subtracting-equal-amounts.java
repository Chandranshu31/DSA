class Solution {
    public int minimumOperations(int[] nums) {
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }

        Arrays.sort(nums);
        int count = 0;

        while (totalSum > 0) {
            int bit = -1;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] > 0) {
                    bit = nums[i];
                    break;
                }
            }
            for (int j = 0; j < nums.length; j++) {
                if(nums[j]==0){
                    continue;
                }
                nums[j] = nums[j] - bit;
            }
            totalSum = 0;
            for (int k = 0; k < nums.length; k++) {
                totalSum += nums[k];
            }

            count++;
        }

        return count;
    }
}

/**
The idea is to stop the count the moment we get the arraysum==0, so sort the array to get the smallest numb to 
subtract everytim, subtract if el is not zero and then recalculate the totalsum or arraysum */
