class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) { int n=nums.length;
        int res[]= new int[nums.length];
        for(int i=0;i<n;i++){
            int curr=nums[i];
            int count=0;
            for(int j=0;j<n;j++){
                if(i!=j && nums[j]<nums[i]) count++;
            }
            res[i]=count;
        }
        return res;
    }
}