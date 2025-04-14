class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length;
        if(k>n){
            return 0.0;
        }
        if(n==1){
            return nums[0];
        }
        int maxSum=0;
        int windowSum=0;

        for(int i=0;i<k;i++){
            windowSum+=nums[i];
        }  // for first window of sze k
      
        maxSum=windowSum;
        // to get the max avg we need max sum window of size k
        for(int i=k;i<n;i++){
            windowSum+=nums[i]-nums[i-k]; // slide window 1 step ahead and keep removing a element from back, one at a time
            maxSum=Math.max(maxSum,windowSum);
        }

        return (double)maxSum/k;

        
    }
}