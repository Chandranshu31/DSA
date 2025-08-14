class Solution {
    public int countVowelSubstrings(String word) {
        int n=word.length();
        int count=0;
        
        for(int i=0;i<n;i++){
            char curr=word.charAt(i);
            if(isVowel(curr)){
                HashSet<Character> set = new HashSet<>();
                for(int j=i;j<n;j++){
                    char c= word.charAt(j);
                    if(!isVowel(c)) break;
                    set.add(c);
                    if(set.size()==5) count++;
                }
            }


        }
        return count;
        
    }
    public boolean isVowel(char c){
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';

    }
}