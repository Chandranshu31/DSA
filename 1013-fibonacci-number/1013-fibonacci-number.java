class Solution {
    public int fib(int n) {
        int dp[]=new int[n+1];
        return calc(n,dp);
    }
    public int calc(int n, int dp[]){
        if(n==0||n==1){
            return n;
        }
        if(dp[n]!=0){
            return dp[n];
        }

        dp[n]=calc(n-1,dp)+calc(n-2,dp);
        return dp[n];
    }
}