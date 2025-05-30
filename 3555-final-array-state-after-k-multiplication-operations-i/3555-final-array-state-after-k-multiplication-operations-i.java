class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
       int n=nums.length;
       for(int j=0;j<k;j++){
        int min=Integer.MAX_VALUE;
        int minIdx=-1;
        for(int i=0;i<n;i++){
            if(nums[i]<min){  // due to this conditio if we ever found a duplicate min in future we would ignore it
                min=nums[i];
                minIdx=i;
            }
        }
        int insert=min*multiplier;
        nums[minIdx]=insert;
       } 
       return nums;
    }
}