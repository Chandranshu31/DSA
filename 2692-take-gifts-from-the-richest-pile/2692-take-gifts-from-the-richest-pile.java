class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        long remaining=0;

        for(int j=0;j<gifts.length;j++){
            pq.add(gifts[j]);
            remaining+=gifts[j];
        }

       for(int i=0;i<k;i++){ 
        if(!pq.isEmpty()){
       
        int mostFreq=pq.remove(); 
        double sqrtVal=Math.sqrt(mostFreq);
        int floorVal=(int)Math.floor(sqrtVal);
        pq.add(floorVal);
        remaining-=mostFreq;
        remaining+=floorVal;
        }
       }
       return remaining;
    }
}

/**
In above solution i calculated remaining hand on hand by keep updating it but we can also calculate it at the end 
of the code like this
class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int j=0;j<gifts.length;j++){
            pq.add(gifts[j]);
        }

       for(int i=0;i<k;i++){ 
        if(!pq.isEmpty()){
       
        int mostFreq=pq.remove(); 
        double sqrtVal=Math.sqrt(mostFreq);
        int floorVal=(int)Math.floor(sqrtVal);
        pq.add(floorVal);
        }
       }

       long remaining=0;
       while(!pq.isEmpty()){
        remaining+=pq.remove();
       } 
       return remaining;
    }
}
 */