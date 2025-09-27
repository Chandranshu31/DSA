class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int largestPerimeter=0;
        for(int i=0;i<nums.length-2;i++){
            int a=nums[i];
            int b=nums[i+1];
            int c=nums[i+2];
            if(canTriangleBeFormed(a,b,c)){
                largestPerimeter=Math.max(largestPerimeter,a+b+c);
            }
        }
        return largestPerimeter;
        
    }
    public boolean canTriangleBeFormed(int a, int b, int c){
        if(a+b>c) return true;
        return false;
    }
}