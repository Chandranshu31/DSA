class Solution {
    public int minimumRecolors(String blocks, int k) {
        int minRecolor=0;
        int numberOfBlack=0;
        for(int i=0;i<k;i++){
            if(blocks.charAt(i)=='B'){
                numberOfBlack++;
            }
        }
        minRecolor=k-numberOfBlack;
        for(int i=k;i<blocks.length();i++){
            if(blocks.charAt(i-k)=='B'){
                numberOfBlack--;
            }
            if(blocks.charAt(i)=='B'){
                numberOfBlack++;
            }
            minRecolor=Math.min(minRecolor,k-numberOfBlack);
           
        }
        return minRecolor;

        
    }
}