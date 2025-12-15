class Solution {
    public long getDescentPeriods(int[] prices) {
        long ans = 1;      // first element
        long streak = 1;  // length of current descent chain

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
