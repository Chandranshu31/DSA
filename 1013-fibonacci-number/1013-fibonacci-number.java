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
} // this memoization (top to bottom)

/**
This is tabulation where we filled the dp table
class Solution {
    public int fib(int n) {
        if(n==0||n==1){
            return n;
        }
        int dp[]=new int[n+1];
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<dp.length;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
        
    }
}


} */