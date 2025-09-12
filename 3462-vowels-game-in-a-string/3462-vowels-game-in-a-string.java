class Solution {
    public boolean doesAliceWin(String s) {
        int vow=0;
        for(char ch: s.toCharArray()){
            if(isVowel(ch)) return true;
        }
        return false;
        
    }
    public boolean isVowel(char c){
        return c=='a'||c=='e'||c=='i'||c=='o'||c=='u';
    }
}