class Solution {
    public long getDescentPeriods(int[] prices) {
        long ans = 1;      // first element
        long streak = 1;  // length of current chain upto descending

        for (int i = 1; i < prices.length; i++) {
            if (prices[i - 1] - prices[i] == 1) {
                streak++;
            } else {
                streak = 1;
            }
            ans += streak;
        }
        return ans;
    }
}

/**
Another soln but it is in O(n^2) 
class Solution {
    public long getDescentPeriods(int[] prices) {
      int n=prices.length;
      long ans=0;
      for(int i=0;i<=n-2;i++){
        int curr=prices[i];
        int j=i+1;
        long count=0;
        while(j<n && prices[j-1]-prices[j]==1){
            count++;
            j++;
        }
        ans+=count;
      } 
      return ans+n; 
    }
}*/
