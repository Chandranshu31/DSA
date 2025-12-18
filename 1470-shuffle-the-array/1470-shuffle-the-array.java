class Solution {
    public int[] shuffle(int[] nums, int n) {
        int i=0;
        int j=n;
        int res[]=new int[2*n];
        int k=0;
        while(i<n && j<=nums.length-1 && k<res.length){
            int first=nums[i++];
            int second=nums[j++];
            res[k++]=first;
            res[k++]=second;
        }
        return res;
        
    }
}