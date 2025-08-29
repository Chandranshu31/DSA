class Solution {
    public int arraySign(int[] nums) {
        if(nums.length==1){
            int a=nums[0];
            if(a==0) return 0;
            return a>0?1:-1;
        }
        int neg=0;
        for(int n:nums){
            if(n==0) return 0;
            if(n<0) neg++;
        }
        if(neg==0){
            return 0;
        }
        return neg%2==0 ? 1: -1;
        
    }
}