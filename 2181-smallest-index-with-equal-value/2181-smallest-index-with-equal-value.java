class Solution {
    public int smallestEqual(int[] nums) {
       // int smallest=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            int curr=i%10;
            if(curr==nums[i]){ // the moment u find such an index return it as it would be smallest indx, no need to check ahead 
                return i;
            }
        }
       
        return -1; // no such
    }
}