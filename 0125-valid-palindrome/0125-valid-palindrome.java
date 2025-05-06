class Solution {
    public boolean isPalindrome(String s) {
        int n=s.length();
        if(n==0){
            return true;
        }
        int start=0;
        int end=n-1;

        while(start<end){
            char currFirst=s.charAt(start);
            char currLast=s.charAt(end);
            if(!Character.isLetterOrDigit(currFirst)){
                start++;
            }
            else if(!Character.isLetterOrDigit(currLast)){
                end--;
            }
            else{
                if(Character.toLowerCase(currFirst)!=Character.toLowerCase(currLast)){
                    return false;
                }
                start++;
                end--;
            }
        }
        return true;
    }
}

// Idea is very simple, set two pointers at start and end, if the characters at the two pointers are non-alphanumeric just move them 
// forward and backward respectively
// then if the chars at both pointers is alphanumeric, convert them to lowercase and compare them, if they are mismatched then simply return false
// otherwise if matched then move both the pointers