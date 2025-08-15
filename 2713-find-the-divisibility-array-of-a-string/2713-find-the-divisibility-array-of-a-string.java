class Solution {
    public int[] divisibilityArray(String word, int m) {
        int div[]= new int[word.length()];
        long curr=0;
       // long M = (long) m;  
        for(int i=0;i<word.length();i++){
            curr =(curr*10 + (word.charAt(i) - '0')) % m;
            if(curr%m==0){
                div[i]=1;
            }
        }
        return div;
        
    }
}