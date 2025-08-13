class Solution {
    public boolean isPalindrome(int x) {
      int rev=0;
      int n=x;
      while(n>0){
        int lastDigit=n%10;
        rev=(rev*10)+lastDigit;
        n=n/10;
      }

      return rev==x;
        
    }
}