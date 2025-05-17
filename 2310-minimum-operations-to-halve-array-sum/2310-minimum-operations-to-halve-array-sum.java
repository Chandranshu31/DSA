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
/**
If we want to calc min operations to halve the array sum then we need to pick up the greatest integer present and apply 
the given operation of reducing it to the half on it only and simultaneously keep calculating the currsum or totalsum and keep checking it with the condition
. Used a PQ to always get the max of the available */