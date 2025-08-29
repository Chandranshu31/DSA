class Solution {
    public int arraySign(int[] nums) {
        if(nums.length==1){  // edge case when only one element
            int a=nums[0];
            if(a==0) return 0;
            return a>0?1:-1;
        }

        int neg=0; // count the number of negative ones... if odd tehen prod is obv neg and for even its pos so 1
        for(int n:nums){
            if(n==0) return 0; // if any elemnt is zero then prod is zero also
            if(n<0) neg++;
        }
        if(neg==0){
            return 0;
        }
        return neg%2==0 ? 1: -1;
        
    }
}