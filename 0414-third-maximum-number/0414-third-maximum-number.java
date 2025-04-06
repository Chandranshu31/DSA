class Solution {
    public int thirdMax(int[] nums) {
        int n=nums.length;
        if(n<3){
            // third largest wont exist in this case so need to return the largest
            long largest=Long.MIN_VALUE;
            for(int i=0;i<n;i++){
                largest=Math.max(largest,nums[i]);
            }
            return (int)largest;
        }

        // other wise the third distinct number would definintely exists
        long largest=Long.MIN_VALUE;
        long secondLargest=Long.MIN_VALUE;
        long thirdLargest =Long.MIN_VALUE;

        // iterate over array
        for(int i=0;i<n;i++){
            if(nums[i]==largest || nums[i]==secondLargest || nums[i]==thirdLargest){
                // that means its a duplicate number and already stored in one of the above var, so ignore it and 
                // perform no actions
                continue;
            }

            if(nums[i]>largest){  // if greater than largest then update everything 
                thirdLargest=secondLargest;
                secondLargest=largest;
                largest=nums[i];
            }
            else if(nums[i]>secondLargest && nums[i]<largest){
                thirdLargest=secondLargest;
                secondLargest=nums[i];
            }
            else if(nums[i]>thirdLargest && nums[i]<secondLargest){
                thirdLargest=nums[i];
            }
        }

         if(thirdLargest==Long.MIN_VALUE){
            return (int) largest;
        }
        return (int )thirdLargest;

       
    }
}