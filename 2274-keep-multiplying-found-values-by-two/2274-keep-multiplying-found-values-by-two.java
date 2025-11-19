class Solution {
    public int findFinalValue(int[] nums, int original) {
        int n=nums.length;
        while(isFound(nums,original)){
            original=2*original;

        }
        return original;
    }
    public boolean isFound(int nums[], int original){
        for(int i=0;i<nums.length;i++){
            if(nums[i]==original) return true;
        }
        return false;
    }
}