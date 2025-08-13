class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int left=0;
        int right=n-1;
        int maxCapacity=Integer.MIN_VALUE;
        while(left<=right){
            int width=right-left;
            int ht=Math.min(height[left],height[right]);
            int capacity=width*ht;
            maxCapacity=Math.max(maxCapacity,capacity);
            if(height[left]<=height[right]){
                left++;
            }
            else{
                right--;
            }

        }
        return maxCapacity;
        
    }
}