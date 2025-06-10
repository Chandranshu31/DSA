class Solution {
    public String reversePrefix(String word, char ch) {
        Stack<Character> s = new Stack<>();
        int i=0;
        int idx=-1;
       
           
           while(i<word.length() && word.charAt(i)!=ch){
                s.push(word.charAt(i));
                i++;
            }

            if(i<word.length() && word.charAt(i)==ch){
                s.push(word.charAt(i));
                idx=i; // store the idx where we got the char so that we can add elemnts ahead of it into the res
                
            }else{
                return word;  // we reached to the end of the word and the character not found so simply return the whole string
            }

            StringBuilder sb = new StringBuilder();
            while(!s.isEmpty()){
                sb.append(s.pop());
            }

            for(int j=idx+1;j<word.length();j++){
                sb.append(word.charAt(j));
            }

            return sb.toString();


        
    }
}

/** can also be done using a stringbuilder only
class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder prefix = new StringBuilder();
        int i = 0;
        
        while (i < word.length()) {
            prefix.append(word.charAt(i));
            if (word.charAt(i) == ch) break;
            i++;
        }
        
        if (i == word.length()) return word; // ch not found
        
        prefix.reverse();
        
        for (int j = i + 1; j < word.length(); j++) {
            prefix.append(word.charAt(j));
        }
        
        return prefix.toString();
    }
}
 */