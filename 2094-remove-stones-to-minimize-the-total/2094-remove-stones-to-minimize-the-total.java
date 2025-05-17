class Solution {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
         int smallestSum=0;
        for(int pile: piles){
            pq.add(pile);
            smallestSum+=pile;
        }
       
        for(int i=0;i<k;i++){
            int curr=pq.remove();
            smallestSum-=curr;
            double half=curr/2;
            int floor=(int)Math.floor(half);
            pq.add(curr-floor);
            smallestSum+=(curr-floor);
        }

      
        return smallestSum;

        
    }
}

/**The description is okay but the output does not atches with it, we need to figure out floor val of half then evaluate */