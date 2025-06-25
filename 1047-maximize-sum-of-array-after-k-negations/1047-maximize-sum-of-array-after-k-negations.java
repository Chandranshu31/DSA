class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        // we just need to keep flipping the sign of  the smallest number after each flip
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int num:nums){
            pq.add(num);
        }

        // flip the smallest for k times
        for(int i=0;i<k;i++){
            int curr=pq.remove();
            pq.add(-curr);
        }
        int sum=0;
        while(!pq.isEmpty()){
            sum+=pq.remove();
        }

        return sum;
        
    }
}