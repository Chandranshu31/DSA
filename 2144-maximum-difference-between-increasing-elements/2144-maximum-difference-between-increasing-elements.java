class Solution {
    public int maximumDifference(int[] nums) {
        int a =Integer.MAX_VALUE;  // a variable to track current. same question as buy and sell stock
        int maxDiff=-1;

        for(int i=0;i<nums.length;i++){
        if(a<nums[i]){
            int diff = nums[i]-a;
            maxDiff= Math.max(diff,maxDiff);
        }
        else{
            a=nums[i];
        }
        }
        return maxDiff;
           
        
    }
}