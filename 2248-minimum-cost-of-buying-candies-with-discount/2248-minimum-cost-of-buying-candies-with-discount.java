class Solution {
    public int minimumCost(int[] cost) {
        int n=cost.length;
        Arrays.sort(cost);
        int minCost=0;
        if(n==2){
            return cost[0]+cost[1];
        }

        int j=1;  // to skip the candie that we can get for free
        for(int i=n-1;i>=0;i--){
            if(j==3){
                j=1;
                continue;
            }
            minCost+=cost[i];
            j++;
        }
        return minCost;

        
    }
}
/**
we need a min cost for buying all candies and we can get a candy free whose price is lee than 2 pair of candies we bought
so idea is to buy two highest priced candies and get the HIGHEST PRICE CANDIE among the left over for free and repeat the same process */