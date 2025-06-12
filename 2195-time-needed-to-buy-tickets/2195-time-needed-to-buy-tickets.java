class Solution {
       static class pair{
        int val;
        int idx;
        public pair(int val,int idx){
            this.val=val;
            this.idx=idx;
        }
    }
    public int timeRequiredToBuy(int[] tickets, int k) {
         Queue<pair> q = new LinkedList<>();
         for(int i=0;i<tickets.length;i++){
            q.add(new pair(tickets[i],i));
         }
    int time=0;
    while(!q.isEmpty()){   
        pair curr= q.remove();
        curr.val-=1;
        time++;
        if(curr.val==0){
            if(curr.idx==k){
                return time;
            }
        }else{  // only add those curr into the queue whose val is greater than 0, as the one with 0 leaves the queue
            q.add(curr);
        }
    }

    return time;
    }

 
}