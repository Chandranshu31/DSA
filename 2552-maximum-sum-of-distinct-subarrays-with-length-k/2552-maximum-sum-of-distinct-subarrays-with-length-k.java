class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int n=nums.length;
        long sum=0;
        long maxSum=0;
        int left=0;
        HashSet<Integer> set = new HashSet<>();

        for(int right=0;right<n;right++){
            sum+=nums[right];
            while(set.contains(nums[right])){
                sum-=nums[left];
                set.remove(nums[left]);
                left++;
            }
            set.add(nums[right]);

            if(right-left+1==k){
                maxSum=Math.max(sum,maxSum);
                sum-=nums[left];
                set.remove(nums[left]);
                left++;
            }
        }

        return maxSum;
        
    }
}