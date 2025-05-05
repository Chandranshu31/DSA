class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        int i=0;
        for(int j=0;j<n;j++){
            if(i<2 || nums[j]!=nums[i-2]){
                nums[i++]=nums[j];
            }
        }
        return i;        
    }
}