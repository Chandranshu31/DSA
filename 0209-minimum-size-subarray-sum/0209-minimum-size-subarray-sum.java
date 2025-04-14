class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n=nums.length;
        int minLen =Integer.MAX_VALUE;
        int start=0;
    
        int sum=0;
        for(int end=0;end<n ;end++){
            sum+=nums[end];

            while(sum>=target){  // as asked in ques
               int length=end-start+1; // length of current subarray
               minLen=Math.min(minLen,length);
               sum-=nums[start];
               start++; // we need min len so shrink the size of window and chekc for it again
            }
         
        }

    if(minLen==Integer.MAX_VALUE){  // f no such subarray whose sum>=target then minlen wont change it would stick to infi
        return 0;
    }
    return minLen;
    }
}