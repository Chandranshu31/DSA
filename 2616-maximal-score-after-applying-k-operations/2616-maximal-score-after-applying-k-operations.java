class Solution {
    public long maxKelements(int[] nums, int k) {
       // we want to maximize our overall score so we just need to pick the maximum present value in the array for each n every time
       PriorityQueue<Integer> pq= new PriorityQueue<>(Collections.reverseOrder());
       // a max heap to get the largest possible value everytime

       for(int num: nums){
        pq.add(num);
       }
       long maxScore=0; 
       for(int i=0;i<k;i++){
        int curr=pq.remove();
        maxScore+=curr;
        double oneT=curr/3.0;
        int ceil=(int)Math.ceil(oneT);
        pq.add(ceil);
       }
       return maxScore; 
    }
}