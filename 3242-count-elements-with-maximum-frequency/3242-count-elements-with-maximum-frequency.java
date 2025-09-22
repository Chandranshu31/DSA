class Solution {
    public int maxFrequencyElements(int[] nums) {
        int count[]= new int[101];
        int maxFreq=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            count[nums[i]]++;
            maxFreq=Math.max(maxFreq,count[nums[i]]);
        }
        int cnt=0;
        for(int num:count){
            if(num==maxFreq) cnt+=maxFreq;
        }
        return cnt;
        
    }
}