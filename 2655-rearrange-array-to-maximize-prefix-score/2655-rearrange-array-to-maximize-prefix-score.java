class Solution {
    public int maxScore(int[] nums) {
        // we want more numbers in prefix array to be positive 
        // so it would be best for us if we could club the all of the positive numbers together and in front of the array
        /// cause of  the prefix.
        Arrays.sort(nums);  // sort in asc
        int a=0;
        int b=nums.length-1;
        while(a<b){
            int temp=nums[a];
            nums[a]=nums[b];
            nums[b]=temp;
            a++;
            b--;
        }   // now array is sorted in descending order

        int maxLength=0;
        long prefixSum=0;
        for(int i=0;i<nums.length;i++){
            prefixSum+=nums[i];
            if(prefixSum>0){
                maxLength++;
            }else{
                break;
            }
        }

        return maxLength;  // we were supposed to return the max length or length of array till the first prefix elemnt went equal to 0

        
    }
}