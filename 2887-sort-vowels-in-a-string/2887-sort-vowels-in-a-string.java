class Solution {
    public String sortVowels(String s) {
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        List<Character> list = new ArrayList<>();
        List<Integer> index = new ArrayList<>();

        for(int i=0;i<sb.length();i++){
            if(isVowel(sb.charAt(i))){  // if the char is vowel
                list.add(sb.charAt(i)); // add it to vowels list
                index.add(i);  // store the index sequence wise to insert sortd vowels, as we r only suppoosed to sort the vowels and not consonants
            }
        }

        Collections.sort(list); // get the vowels sorted acc to their ASCII, it will do that
        for(int i=0;i<index.size();i++){
            sb.setCharAt(index.get(i),list.get(i)); // to replace we use setCharAt and to insert we use insert
        }

        return sb.toString();

        
    }
      public boolean isVowel(char ch) {
      
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
               ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }
}