class Solution {
    public String breakPalindrome(String palindrome) {
        // to make it a non palindromic and lexicographically smallest string we will make the first non a char a inthe first half so that we can get 
        // a lexico smallest and a non palindromic string also

        int n= palindrome.length();
        if(n==1){
            return "";
        }

        char arr[]= palindrome.toCharArray();
        for(int i=0;i<n/2;i++){
            if(arr[i]!='a'){ // make the first non a, a 
                arr[i]='a'; 
                return new String(arr);  // first ensured ast the moment we got an a we returned the array
            }
        }

        arr[n-1]='b';  // if all char inn frst half are a then simply make the last char of stirng b to get the lexico smallest
        return new String(arr);

        // we arent supposed to return a lexicographically smaller string than og , we need to return the lexico smallest non palindromic string when palindrome is not palindrome anymore
    }
}