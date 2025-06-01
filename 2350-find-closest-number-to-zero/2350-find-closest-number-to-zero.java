class Solution {
    public int findClosestNumber(int[] nums) {
     int closestDiff=Integer.MAX_VALUE;
     int closestNumb=Integer.MAX_VALUE;
     Arrays.sort(nums);
     for(int i=nums.length-1;i>=0;i--){
        int curr=nums[i];
        if(Math.abs(curr)==closestDiff){
            continue;
        }
        if(Math.abs(curr)<closestDiff){
            closestDiff=Math.abs(curr);     // Math.abs(curr-0)==Math.abs(curr)
            closestNumb=curr;
        }
     }
     return closestNumb;   
    }
}  