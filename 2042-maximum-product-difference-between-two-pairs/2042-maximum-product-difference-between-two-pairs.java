class Solution {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int a=nums[0];
        int b=nums[1];
        int c=nums[nums.length-1];
        int d=nums[nums.length-2];

        return (c*d)-(a*b);
        
    }
}