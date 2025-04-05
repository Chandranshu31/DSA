class Solution {
    public int findGCD(int[] nums) {
        int n=nums.length;
        int largest=Integer.MIN_VALUE;
        int smallest= Integer.MAX_VALUE;
        int i=0;
        while(i<n){
            largest=Math.max(largest,nums[i]);
            smallest=Math.min(smallest,nums[i]);
            i++;
        }

        int j=smallest;
        while(j>=0){
            if(smallest % j ==0 && largest % j==0){
                return j;
            }
            j--;
        }
        return 1; // otherwise return 1
        
    }
}