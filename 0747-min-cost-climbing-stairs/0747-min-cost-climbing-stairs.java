class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length; // the top is n only
        // we can either take a 1 step or 2 step at a time. so to reach the ith pos we can either come from
        // i-1 or i-2, and we need to find the min cost to reach i so that would minimum of cost to reach i-1 and i-2.

        int dp[]=new int[n]; // kind of cost to reach ith index array
        // we can either start from index 0 or 1 so to reach them cost would be ewual to their value only
        
        dp[0]=cost[0];
        dp[1]=cost[1];

        for(int i=2;i<dp.length;i++){
            dp[i]=Math.min(dp[i-1],dp[i-2])+cost[i];  // min cost to reach ith idx
        }

        return Math.min(dp[n-1],dp[n-2]);  // we can reach ith from i-1 or i-2 then min would be the minnimum of cost req to reach i-1 or i-2
        
    }  // this is tabulation method
}