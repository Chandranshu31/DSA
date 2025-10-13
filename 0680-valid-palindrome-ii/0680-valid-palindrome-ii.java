class Solution {
    public boolean validPalindrome(String s) {
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)==s.charAt(j)){ // skip the matching characters
                i++;
                j--;
            }else{ // in case of a mismatch, try skipping either of the characters once and by skipping any one of them we get true, then we can say that original string is a palindrome if we a del a single character
                return isPalindrome(s,i+1,j) || isPalindrome(s,i,j-1);
            }
        }
        return true;

        
    }
    public boolean isPalindrome(String s, int i, int j){
        
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            else{
                i++;
                j--;
            }
        }
        return true;
    }
}