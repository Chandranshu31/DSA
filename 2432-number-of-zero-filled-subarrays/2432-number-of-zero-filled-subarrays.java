class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long count=0;
        long currCount=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                currCount++;
                count+=currCount;
            }else{
                currCount=0;
            }
        }
        return count;
        
    }
}