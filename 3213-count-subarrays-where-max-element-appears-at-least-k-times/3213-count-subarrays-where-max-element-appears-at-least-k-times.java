class Solution {
    public long countSubarrays(int[] nums, int k) {
        int n = nums.length;
        long count = 0;
        
        // Find the largest element
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            largest = Math.max(largest, nums[i]);
        }
        
        int left = 0;
        int largestCount = 0;
        
        for (int right = 0; right < n; right++) {
            if (nums[right] == largest) {
                largestCount++;
            } 
            
            while (largestCount >= k) {
                count += (n - right);
                if (nums[left] == largest) {
                    largestCount--;
                }
                left++;
            }
        }
               
        return count;
    }
}
