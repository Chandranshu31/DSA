class Solution {
    public int[] divisibilityArray(String word, int m) {
        int div[]= new int[word.length()];
        long curr=0; // to store the curr numb , long to handle large digit numbers 

        for(int i=0;i<word.length();i++){
            curr =(curr*10 + (word.charAt(i) - '0')) % m;
            if(curr==0){ // no neeed for curr%m==0 as it is already done at prev step only
                div[i]=1;
            }
        }
        return div;
        
    }
}