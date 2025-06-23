class Solution {
    public int sumOfSquares(int[] nums) {
       // int i=0;
        int sum=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            int a=i+1;
            if(n%a==0){
                sum+=nums[i]*nums[i];
            }
        }

        return sum;
      
    }
}