class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int i=0;
        int j=0;
        int count=0;
        int prod=1;
        while(j<nums.length){
            prod*=nums[j];  // add current pointer el to prod

            while(prod>=k && i<=j){  // keep shrinking the window till we are getting the prod >=k by removing el at i pointer
                prod/=nums[i];
                i++;
            }

            count+=(j-i+1);
            j++;
        }

        return count;

    }
}