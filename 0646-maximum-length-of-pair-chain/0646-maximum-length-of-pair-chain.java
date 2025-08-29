class Solution {
    public int findLongestChain(int[][] pairs) {
        
        Arrays.sort(pairs,Comparator.comparingInt(o ->o[1]));// sort on the baiss of last digit

        int lengthOfChain=0;

        // always select the first one
        lengthOfChain=1;
        int lastEnd=pairs[0][1];

        for(int i=1;i<pairs.length;i++){
            if(pairs[i][0]>lastEnd){ // if next starting is greater than prev end then add it to the chain
            lengthOfChain++;
            lastEnd=pairs[i][1];
            }
            }

            return lengthOfChain;
        }
    
}