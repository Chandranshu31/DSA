class Solution {
    public int climbStairs(int n) { // the start pos is 0 and to reach 0 from zero there are 1 unique ways and same goes for n==1
    // its like if we want to reach n then we will either jump from n-1 or n-2 then the numb of unique ways to reach n is equal to sum of number of unique ways to reach n-1 and n-2
      int dp[]= new int[n+1];
      return calc(n,dp);
    }
    public int calc(int n, int dp[]){
        if(n==0 || n==1){
            return 1;
        }
        if(dp[n]!=0){
            return dp[n];
        }
        dp[n]=calc(n-1,dp)+calc(n-2,dp);
        return dp[n];
    }
}

/**
Tabulation 
class Solution {
    public int climbStairs(int n) {
        int dp[]=new int[n+1];
        return tab(n,dp);
    }
    public int tab(int n, int dp[]){
        if(n==0||n==1){
            return 1;
        }
        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<dp.length;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
} */