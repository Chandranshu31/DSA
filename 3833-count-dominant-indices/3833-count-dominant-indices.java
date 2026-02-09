class Solution {
    public int dominantIndices(int[] nums) {
     int mainCount=0;
     for(int i=0;i<nums.length;i++){
        int curr=nums[i];
        int sum=0;
        int count=0;
        for(int j=i+1;j<nums.length;j++){
            count++;
            sum+=nums[j];
        }
        double avg=(double)sum/count;
        if(curr>avg) mainCount++;
     }
         return mainCount;
        
    }

    
}