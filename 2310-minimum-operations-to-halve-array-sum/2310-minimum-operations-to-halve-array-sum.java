class Solution {
    public int halveArray(int[] nums) {
       double currSum=0;
       int count=0;
       PriorityQueue<Double> pq = new PriorityQueue<>(Collections.reverseOrder());
       for(int num:nums){
        pq.add((double)num);
        currSum+=(double)num;
       }
       double halfSum=currSum/2.0;
       while(currSum>halfSum){
        double curr=pq.remove();
        currSum-=curr;
        double half=curr/2.0;
        currSum+=half;
        pq.add(half);
        count++;
       }
       return count; 

    }
}