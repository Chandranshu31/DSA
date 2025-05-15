class Solution {
    public int[] findIndices(int[] nums, int indexDifference, int valueDifference) {
        int n=nums.length;
        int res[]=new int[2];
        res[0]=-1;  // initially initialise it with -1,-1 so that if we could not find any such pair then simply return -1,-1
        res[1]=-1;
        for(int i=0;i<n;i++){
            int j=i+indexDifference;
            while(j<n){
                int diff=Math.abs(nums[i]-nums[j]);
                if(diff>=valueDifference){
                   res[0]=i;
                   res[1]=j;
                   break; // take an exit the moment you got the req pair of indices
            }
            j++;
        }
      
    }
    return res;
}
}