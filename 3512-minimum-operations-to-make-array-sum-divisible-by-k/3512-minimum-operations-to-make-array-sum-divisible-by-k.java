class Solution {
    public int minOperations(int[] nums, int k) {
        int sum=0;
        for(int num:nums){
            sum+=num;
        }
        if(sum%k==0) return 0;
        int nearest=nearestLessMultipleOfKthanSum(sum,k);
        return sum-nearest;

        
    }
    public int nearestLessMultipleOfKthanSum(int sum, int k){
        int curr=k;
        int nearest=0;
        while(sum>=curr){
            nearest=curr;
            curr+=k;
        }
        return nearest;
    }
}