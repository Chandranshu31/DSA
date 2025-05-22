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

/**
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

            int currMax=pq.remove();
            maxHappiness+=currMax;
              // now we need to decrement the other happinesses by 1 and we cant directly modify yhe pq
              // so make a temp pq in which add only those values which are >0 after decreasing by1
            PriorityQueue<Integer> temp = new PriorityQueue<>(Collections.reverseOrder());
            while(!pq.isEmpty()){  // 
                int val=pq.remove()-1;
                if(val>0){
                    temp.add(val);
                }
            }
            pq=temp;  // this is how we copy or assign all the values of a pq into the other pq
        }
        return maxHappiness;

  ANOTHER LOGIC BUT TLE     
}
} */