class Solution {
    public boolean checkString(String s) {
      int lastIdxofA=-1;
      int firstIdxOfB=-1;
      for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='a'){
            lastIdxofA=i;
        }
      }
      for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='b') {
            firstIdxOfB=i;
            break;
        }
      }  
      if(firstIdxOfB==-1 && lastIdxofA!=-1) return true;
      return lastIdxofA<firstIdxOfB;
    }
}