class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int cs=0;
        int ms=Integer.MIN_VALUE;

        for(int num: nums){
            cs+=num;
            ms=Math.max(cs,ms);
            if(cs<0){
                cs=0;
            }
        }

        int cs2=0;
        int minS=Integer.MAX_VALUE;
        for(int num: nums){
            cs2+=num;
            minS=Math.min(cs2,minS);
            if(cs2>0){
                cs2=0;
            }
        }

        int tSum=0;
        for(int num:nums){
            tSum+=num;
        }
        if(tSum==minS){
            return ms;
        }

        int maxCircular = tSum-minS;

        return Math.max(maxCircular,ms);
        
    }
}