class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int n=nums.length;
        if(n<3){
            return 0;  // edge cases
        }
    

        int count=0; // to track the subarrays with airthmetic condition
        int total=0;
        for(int i=2;i<n;i++){
            if(nums[i]-nums[i-1]==nums[i-1]-nums[i-2]){
                count++;
                total+=count;
            }else{
                count=0;
            }

        }

        return total;

        
    }
}