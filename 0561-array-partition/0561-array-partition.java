class Solution {
    public int arrayPairSum(int[] nums) {
        int n=nums.length;
        int hlf= n/2; // the numb of pairs we need 
        Arrays.sort(nums);

        int maxSum=0;
        // now we need to get min of every pair and sum it up as array is sorted it would be the 1st indexed element 
        // in evry pair.
        //1,2,2,5,6,6  the mins would be 1,2,6
        int i=0;
        while(i<n){
            maxSum+=nums[i];
            i+=2;
        }
        return maxSum;
        
    }
}