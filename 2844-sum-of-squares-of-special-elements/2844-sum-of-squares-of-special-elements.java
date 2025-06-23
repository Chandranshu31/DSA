class Solution {
    public int sumOfSquares(int[] nums) {
       // int i=0;
        int sum=0;
        int n=nums.length;
        for(int i=1;i<=n;i++){
            int a=i;
            if(n%a==0){
                sum+=nums[i-1]*nums[i-1];
            }
        }

        return sum;
      
    }
}