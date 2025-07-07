class Solution {
    public int fib(int n) { 
        int dp[]= new int[n+1];
        return Fib(n,dp);
    }

    public int Fib(int n, int dp[]){
        if(n==0||n==1){
            return n;
        }
        if(dp[n]!=0){
            return dp[n];
        }
        dp[n]=Fib(n-1,dp)+Fib(n-2,dp);
        return dp[n];
    }
}