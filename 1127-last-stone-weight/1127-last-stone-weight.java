class Solution {
    public int lastStoneWeight(int[] stones) {
        int n=stones.length;
        // we always want two heaviest stones... so we can use a max heap
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int num:stones){
            pq.add(num);
        }

        while(pq.size()>1){ 
                int y=pq.remove();
                int x= pq.remove();
                if(y==x){
                    continue;
                }else{
                    y=y-x;
                    pq.add(y); // dont add x that means it got destroyed
                }
        }
        if(pq.size()==0){
            return 0;
        }

        return pq.peek();
        
    }
}