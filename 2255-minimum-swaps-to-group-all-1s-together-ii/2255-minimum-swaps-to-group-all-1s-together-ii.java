class Solution {
    public int minSwaps(int[] nums) { 
        int k=0;
        for(int num: nums){
            if(num==1){
                k++;
            }
        }
        
        int count=0;
        for(int i=0;i<k;i++){
            if(nums[i]==0){
                count++;
            }
        }
        int n=nums.length;
        int minSwaps=count;
        for(int i=1 ;i<nums.length; i++){
            if(nums[(i-1)%n]==0){
                count--;
            }
            if(nums[(i+k-1)%n]==0){
                count++;
            }

            minSwaps=Math.min(count,minSwaps);
        }

        return minSwaps;

    }
}