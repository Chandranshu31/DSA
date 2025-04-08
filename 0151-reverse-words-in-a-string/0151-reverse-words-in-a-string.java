class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String words[]= s.trim().split("\\s+");

        for(int i=words.length-1;i>=0;i--){
            sb.append(words[i]);
            if(i!=0){
                sb.append(" ");
            }
        }
        return sb.toString();


        
    }
}

/**
An alternate solution withput using any kind of inbuilt function
class Solution {
    public String reverseWords(String s) {
        Stack<String> st = new Stack<>();
        int i=0;
        int n= s.length();

        while(i<n){ // until we iteraate the whole sentence which is in form of string 
            while(i<n && s.charAt(i)==' '){  // to skip the leading and trailing and mid spaces 
                i++;
            }
            String word=""; // to get every word until a white space ocurs whch marks the end of the single word
            while(i<n && s.charAt(i)!=' ')
            {
                word+=s.charAt(i);
                i++;
            }
            if(word.length()!=0){  // add that word into the stack
                st.push(word);
            }

        }
        String result=""; // time to make the rsultant string 
        while(!st.isEmpty()){
            result+=st.pop();  // keep adding every word
            if(!st.isEmpty()){  //  to add whitespace between two words and not before the last word 
                result+=" ";
            }
        }

        return result; 

        
    }
}  to do it withpout using any inbuilt function  */