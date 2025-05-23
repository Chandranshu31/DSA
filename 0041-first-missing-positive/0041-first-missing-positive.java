class Solution {
    public int firstMissingPositive(int[] nums) {
        int n=nums.length;

        for(int i=0;i<n;i++){
            while(nums[i]>0 && nums[i]<=n  && nums[nums[i] -1] != nums[i]){
                int temp=nums[i];
                nums[i]=nums[temp-1];
                nums[temp-1]=temp;
            }
        }

        for(int i=0;i<n;i++){
            if(nums[i]!=i+1){
                return i+1; // first missing positive
            }
        }

        return n+1;// all values r in place and return the very next number which is not present in arr, that would be smallest one
        
    }
}