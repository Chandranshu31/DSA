class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int maxIc=0;
        for(int i=0;i<costs.length;i++){
            if(costs[i]>coins){
                break;
            }
            maxIc++;
            coins-=costs[i];
        }
        return maxIc;
    }

    // sort the costs so that we can buy as much  ice creams on cheaper price with our range in coins.
    
}