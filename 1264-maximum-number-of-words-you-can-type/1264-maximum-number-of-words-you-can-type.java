class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        HashSet<Character> set = new HashSet<>();
        for(char ch: brokenLetters.toCharArray()){
            set.add(ch);
        }
        int words=0;
        char txt[]=text.toCharArray();
        int i=0,n=txt.length;
        while(i<n){
            int j=i;
            boolean isBroken=false;
            while(j<n && txt[j]!=' '){
                if(set.contains(txt[j])){
                    isBroken=true;
                }
                j++;
            }
            if(!isBroken) words++;
            i=j+1;
         
        }
        return words;
    }
}