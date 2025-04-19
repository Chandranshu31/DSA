class Solution {
    public double minimumAverage(int[] nums) {
        // as we always need max and min, we can sort the array then find the avg of min and max then 
        // ++ the start pointer and -- the back means a kind of removed the elements as we r not consdering them
        // and we r considering new min max

        int n=nums.length;
        Arrays.sort(nums);
        int start=0;
        int end=n-1;
        PriorityQueue<Double> pq = new PriorityQueue<>();  // to keep the min avg at front,so easily accesible at the end

        while(start<end){
            int min=nums[start];
            int max=nums[end];
            double avg=(double)(min+max)/2;
            pq.add(avg);
            start++;
            end--;
        }

        return pq.peek();
        
    }
}