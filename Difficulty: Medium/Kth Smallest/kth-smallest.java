class Solution {
    public int kthSmallest(int[] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int num:arr){
            pq.add(num);
            if(pq.size()>k) pq.poll();
        }
        return pq.peek();
        
    }
}
