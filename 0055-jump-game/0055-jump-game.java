class Solution {
    public boolean canJump(int[] nums) {
       int farthest=0; // how far could i go till now 
       for(int i=0;i<nums.length;i++){
        if(i>farthest) return false;   // am I standing at an index (i) that is beyond how far I could jump?
        farthest=Math.max(farthest,i+nums[i]);
       }
       return true;
    }
}