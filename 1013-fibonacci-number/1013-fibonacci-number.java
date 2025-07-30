class Solution {
    public int fib(int n) {
        int dp[]= new int[n+1]; // where 0th indx of this array stores the 0th fib number
         return calc(dp,n);
        
    }
    public int calc(int dp[],int n){
        if(n==0 || n==1){
            return n;
        }
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<dp.length;i++){
            dp[i]=dp[i-1]+dp[i-2];
        } 
        return dp[n];
    }
}