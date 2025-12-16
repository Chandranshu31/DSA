class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        HashSet<Integer> set = new HashSet<>(); // to mantain the uniqueness of the subarray
        int maxSum=0;
        int currSum=0;
        int left=0;
        for(int right=0;right<nums.length;right++){
            while(set.contains(nums[right])){
                set.remove(nums[left]);
                currSum-=nums[left];
                left++;
            }
            set.add(nums[right]);
            currSum+=nums[right];
            maxSum=Math.max(currSum,maxSum);
        }
        return maxSum;
        
    }
}