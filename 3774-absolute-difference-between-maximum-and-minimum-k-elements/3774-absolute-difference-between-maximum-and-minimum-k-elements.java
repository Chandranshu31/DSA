class Solution {
    public int absDifference(int[] nums, int k) {
        if(k==nums.length) return 0;
        Arrays.sort(nums);
        int maxKsum=0;
        for(int i=nums.length-1;i>=nums.length-k;i--){
            maxKsum+=nums[i];
        }
        int minKsum=0;
        for(int i=0;i<k;i++){
            minKsum+=nums[i];
        }
        return Math.abs(maxKsum-minKsum);
        
    }
}