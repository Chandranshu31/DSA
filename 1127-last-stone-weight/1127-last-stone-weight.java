class Solution {
    public int lastStoneWeight(int[] stones) {
        int n=stones.length;
        // we always want two heaviest stones... so we can use a max heap
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int num:stones){
            pq.add(num);
        }

        while(pq.size()>1){ 
                int y=pq.remove(); // get the current heaviest
                int x= pq.remove(); // get the current 2nd heaviest
                if(y==x){  // if weights equal do nohting
                    continue;
                }else{  // otherwise do as said in ques
                    y=y-x;
                    pq.add(y); // dont add x that means it got destroyed
                }
        }
        if(pq.size()==0){  // if pq got empty, no stone left
            return 0;
        }

        return pq.peek(); // otherwise always a single elemnt left in other case
        
    }
}