class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        // we will always consider to pick the child with maximum happiness, to maximize our sum
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int h: happiness){
            pq.add(h);
        }
        long maxHappiness=0;
        

        for(int i=0;i<k;i++){
            if(pq.isEmpty()) break;

            int currMax=pq.remove()-i; // to get the maximum of the ith turn, in first turn i==0 so max is same as  given in array
            // in i==1 the max happiness would have already been decremented by 1
            if(currMax<=0){  // all others would go below the zero
                break;
            }
            maxHappiness+=currMax;
             
            
        }
        return maxHappiness;

      
}
}