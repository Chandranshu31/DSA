class Solution {
    public int[] findIndices(int[] nums, int indexDifference, int valueDifference) {
        int n=nums.length;
        int res[]=new int[2];
        res[0]=-1;
        res[1]=-1;
        for(int i=0;i<n;i++){
            int j=i+indexDifference;
            while(j<n){
                int diff=Math.abs(nums[i]-nums[j]);
                if(diff>=valueDifference){
                   res[0]=i;
                   res[1]=j;
                   break;
            }
            j++;
        }
      
    }
    return res;
}
}