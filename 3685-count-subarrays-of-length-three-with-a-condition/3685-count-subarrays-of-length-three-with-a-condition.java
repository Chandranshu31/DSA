class Solution {
    public int countSubarrays(int[] nums) {
        int n=nums.length;
        int count=0;
        for(int i=0;i<=n-3;i++){
           int first=nums[i];
           int second=nums[i+1];
           int third=nums[i+2];

           int sum=first+third;
           if(2*sum==second){
            count++;
           }

        }
        return count;
    }
}