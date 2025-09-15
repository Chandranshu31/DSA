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
            while(j<n && txt[j]!=' '&&  (!set.contains(txt[j]))){
                j++;
            }
            if (j == n || txt[j] == ' ') {
                words++;
            }
              while (j < n && txt[j] != ' ') j++;
            j++; // skip space
            i = j;
        }
        return words;
    }
}