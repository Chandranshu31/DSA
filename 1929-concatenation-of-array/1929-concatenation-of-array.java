class Solution {
    public int[] getConcatenation(int[] nums) {
        if(nums.length==0) return new int[0];
        int res[]= new int[2*nums.length];
        int count=2;
        int i=0;
        while(count>0){
            for(int j=0;j<nums.length;j++){
                res[i++]=nums[j];
            }
            count--;
        }
        return res;
    }
}