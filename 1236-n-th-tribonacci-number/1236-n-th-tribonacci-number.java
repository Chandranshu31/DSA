class Solution {
    public int tribonacci(int n) {
     int dp[]= new int[n+1];
     return calc(n , dp);
        
    }
    public int calc(int n, int dp[]){
     if(n==0 || n==1){
        return n;
     }
     if(n==2){
        return 1;
     }
     if(dp[n]!=0){
        return dp[n];
     }
     dp[n]=calc(n-1,dp)+calc(n-2,dp)+calc(n-3,dp);
     return dp[n];
    }
}
/**
Tabulation class Solution {
    public int tribonacci(int n) {
        int dp[]=new int[n+1];
        return calc(n,dp);
        
    }
    public int calc(int n, int dp[]){
        if(n==0||n==1){
            return n;
        }
        if(n==2){
            return 1;
        }
        dp[0]=0;
        dp[1]=1;
        dp[2]=1;
        for(int i=3;i<dp.length;i++){
            dp[i]=dp[i-1]+dp[i-2]+dp[i-3];
        }
        return dp[n];
    }
} */