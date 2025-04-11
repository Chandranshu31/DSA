class Solution {
    public int differenceOfSum(int[] nums) {
        int n= nums.length;
        int elementSum=0;
        for(int num: nums){
            elementSum+=num;
        }
        int digitSum=0;
        for(int num:nums){
            int curr= num;
            while(curr>0){
                int ld= curr%10;
                digitSum+=ld;
                curr=curr/10;
            }

        }

        return Math.abs(elementSum-digitSum);
        
    }
}