class Solution {
    public boolean isPalindrome(String s) {
        int n=s.length();
        if(n==0) return true;
        int start=0;
        int end=s.length()-1;
        while(start<end){
            char currFirst=s.charAt(start);
            char currLast=s.charAt(end);
            if(!Character.isLetterOrDigit(currFirst)){
                start++;
            }else if(!Character.isLetterOrDigit(currLast)){
                end--;
            }else{
                if(!(Character.toLowerCase(currFirst)==Character.toLowerCase(currLast))){
                    return false;

                }
                start++;
                end--;
            }
        }
        return true;
        
    }
}