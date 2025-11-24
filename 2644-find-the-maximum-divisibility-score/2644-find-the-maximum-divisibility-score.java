class Solution {
    public int maxDivScore(int[] nums, int[] divisors) {
        int maxDscore=Integer.MIN_VALUE;
        int elementWithMaxDscore=Integer.MAX_VALUE;;
        for(int div:divisors){
            int dScore=0;
            for(int num:nums){
                if(num%div==0) dScore++;
            }
             if(dScore > maxDscore) {
                maxDscore = dScore;
                elementWithMaxDscore = div;
            } else if (dScore == maxDscore) {
                elementWithMaxDscore = Math.min(elementWithMaxDscore, div);
            }
        }
        return elementWithMaxDscore;
    }
}