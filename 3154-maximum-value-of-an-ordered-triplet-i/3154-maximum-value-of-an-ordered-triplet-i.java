class Solution {
    public long maximumTripletValue(int[] nums) {
        int n=nums.length;
        if(n<2){
            return 0; // no triplets can be found
        }
        long maxVal=0;
        // in order to get the max value of such triplets, we need to find maximize the equation
        // and for that we need to find,max nums[i] such that i<j<k

        for(int j=1;j<n-1;j++){  // valid range of j is this as there is always i<j and k>j
        int max_i= nums[0]; // asuume it to be the max_i and now we need to find max value at ith indx such that i<j
        for(int i=0;i<j;i++){
            max_i=Math.max(max_i,nums[i]);
        }
        for(int k=j+1;k<n;k++){
            long currVal= (long)(max_i-nums[j])*nums[k];
            maxVal=Math.max(currVal,maxVal);
        }

        }
        return maxVal;
        
    }
}