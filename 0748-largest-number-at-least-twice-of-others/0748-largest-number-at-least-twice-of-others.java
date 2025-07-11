class Solution {
    public int dominantIndex(int[] nums) {
        
        int largest=Integer.MIN_VALUE;
        int idx=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>largest){
                largest=nums[i];
                idx=i;
            }
        }


        for(int i=0;i<nums.length;i++){
            if(idx!=i && 2*nums[i]>largest){
                return -1;
            }
        }

        return idx;
        
    }
}