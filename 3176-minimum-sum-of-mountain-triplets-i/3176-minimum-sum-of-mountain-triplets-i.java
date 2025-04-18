class Solution {
    public int minimumSum(int[] nums) {
        int n=nums.length;
        int minSum=Integer.MAX_VALUE;

        for(int i=0;i<=n-3;i++){
            for(int j=i+1;j<=n-2;j++){
                if(nums[i]<nums[j]){
                    for(int k=j+1;k<n;k++){
                        if(nums[k]<nums[j]){
                            int sum=nums[i]+nums[j]+nums[k];
                            minSum=Math.min(minSum,sum);
                        }
                    }
                }
            }
        }
        if(minSum==Integer.MAX_VALUE){
            return -1; // no mountain triplet found 
        }
        return minSum;
        
    }
}