class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int maxSubArraySum=maxKadane(nums);
        int minSubArraySum=minKadane(nums);
        int totalSum=0;
        for(int i=0;i<nums.length;i++){
            totalSum+=nums[i];
        }
        if (maxSubArraySum < 0) {
          // All elements are negative
            return maxSubArraySum;
        }

       

        int circularSubArraySum=totalSum-minSubArraySum;

        return Math.max(maxSubArraySum,circularSubArraySum);
    }

    public int maxKadane(int nums[]){
         int n=nums.length;
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;  // maxsubarray sum
        int largest=Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            currSum+=nums[i];
            if(currSum<0){
                currSum=0;
            }
            maxSum=Math.max(maxSum,currSum);
        }
        if(maxSum==0){
            // in case of all negative
            for(int i=0;i<n;i++){
                largest=Math.max(largest,nums[i]);
            }
            maxSum=largest;
        }
        return maxSum;
    }

    public int minKadane(int nums[]){
           int n=nums.length;
        int currSum=0;
        int minSum=Integer.MAX_VALUE;  // maxsubarray sum
        int smallest=Integer.MAX_VALUE;

        for(int i=0;i<n;i++){
            currSum+=nums[i];
            if(currSum>0){
                currSum=0;
            }
            minSum=Math.min(minSum,currSum);
        }
        if(minSum==0){
            // in case of all positive elemnts our minSum would  be 0 but it shuld be the smallest positive num
            for(int i=0;i<n;i++){
                smallest=Math.min(smallest,nums[i]);
            }
            minSum=smallest;
        }
        return minSum;

    }
}