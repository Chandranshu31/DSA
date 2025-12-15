class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxLen=Integer.MIN_VALUE;
        for(String sentence: sentences){
            int count=0;
            for(char c: sentence.toCharArray()){
                if(c==' ') count++;
            }
            count+=1;
            maxLen=Math.max(maxLen,count);
        }
        return maxLen;
    }
}