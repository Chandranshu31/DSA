class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        if(n==0){
            return 0;
        }
        Arrays.sort(nums);
        int maxLen=1;
        int count=1; // cause we also  consider the curr num as a part of sequence 
        for(int i=1;i<n;i++){
            if(nums[i]==nums[i-1]){
                continue;
            }
            else if(nums[i]==nums[i-1]+1){
                count++;
            }
            else{
                count=1; // the sequnce breaks so simply reset the count to 1
            }
            maxLen=Math.max(maxLen,count);
        }

        return maxLen;
    
    }
}