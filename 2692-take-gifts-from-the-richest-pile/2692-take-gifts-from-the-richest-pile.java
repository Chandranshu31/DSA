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