class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int n=nums.length;
        long sum=0;
        long maxSum=0;
        int left=0;
        HashSet<Integer> set = new HashSet<>();

        for(int right=0;right<n;right++){
            sum+=nums[right]; // expand the window and keep adding the elemnt into sum
            while(set.contains(nums[right])){  // if the curr elment exists in set then start shrinking the window by removing left and try to make the window of distinct
                sum-=nums[left];
                set.remove(nums[left]);
                left++;
            }
            set.add(nums[right]); // add the curr into set

            if(right-left+1==k){  // if window size reached then update and the maxsum and shrink the window(right will expand it) and look for next subarray of same condition with k length and calc its sum
                maxSum=Math.max(sum,maxSum);
                sum-=nums[left];
                set.remove(nums[left]);
                left++;
            }
        }

        return maxSum;
        
    }
}