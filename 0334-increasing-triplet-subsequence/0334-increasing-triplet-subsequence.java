class Solution {
    public boolean increasingTriplet(int[] nums) {
        int first=Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        int n= nums.length;

        for(int i=0;i<n;i++){
            if(nums[i]<=first){
                first=nums[i];
            }
            else if(nums[i]<=second){
                second=nums[i];
            }
            else{
                return true;
            }
        }
        return false;
        
    }
}