class Solution {
    public int[] divisibilityArray(String word, int m) {
        int div[]= new int[word.length()];
        long curr=0L;
        long M = (long) m;  
        for(int i=0;i<word.length();i++){
            curr =(curr*10 + (word.charAt(i) - '0')) % M;
            if(curr%m==0){
                div[i]=1;
            }else{
                div[i]=0;
            }
        }
        return div;
        
    }
}