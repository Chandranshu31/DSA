class Solution {
    public int[] findIndices(int[] nums, int indexDifference, int valueDifference) {
         int n=nums.length;
         int minIdx=0;
         int maxIdx=0;

         for(int j=indexDifference;j<n;j++){
            int i=j-indexDifference;
            if(nums[i]<nums[minIdx]){
                minIdx=i;
            }
            if(nums[i]>nums[maxIdx]){
                maxIdx=i;
            }

            if(Math.abs(nums[j]-nums[minIdx])>=valueDifference){
                return new int[]{j,minIdx};
            }
            if(Math.abs(nums[j]-nums[maxIdx])>=valueDifference){
                  return new int[]{j,maxIdx};
            }

         }
         return new int[]{-1,-1};
        
    }
}