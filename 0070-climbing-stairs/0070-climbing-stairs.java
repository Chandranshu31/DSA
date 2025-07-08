class Solution {
    public int climbStairs(int n) {
        // to reach a stair number n we can either jump form n-1 or n-2 so to get the number of ways to reach 
        // nth stair, if we calculate the number of ways to reach n-1 and n-2 and simply sum them, that would be the number
        // of ways to climb the nth stair, as we can take a jump of 1 or 2 only so reach n, we would either take the jump from
        // n-1 or n-2;

        if(n==0||n==1){
            return 1;
        }
        
        int dp[]=new int[n+1];
        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<dp.length;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
        
    }
}