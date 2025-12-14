class Solution {
    public String reverseWords(String s) {
        int i=0;
        int vowelCountInFirstWord=0;
        StringBuilder sb= new StringBuilder();
        while(i<s.length() && s.charAt(i)!=' '){
            sb.append(s.charAt(i));
            if(isVowel(s.charAt(i))) vowelCountInFirstWord++;
            i++;
        }

        if(i<s.length()){
            for(int j=i;j<s.length();j++){
                int k=j;
                StringBuilder temp = new StringBuilder();
                int vowCount=0;
                while( k<s.length() && s.charAt(k)!=' '){
                    temp.append(s.charAt(k));
                    if(isVowel(s.charAt(k))) vowCount++;
                    k++;
                }
                if(vowCount==vowelCountInFirstWord){
                    sb.append(temp.reverse().toString());
                  if(k<s.length()) sb.append(" ");
                    
                }else{
                    sb.append(temp.toString());
                    if(k<s.length()) sb.append(" ");
                }
    
                j=k;
            }
        }
        return sb.toString();
        
    }
    public boolean isVowel(char c){
        return (c=='a'||c=='e'||c=='i'||c=='o'||c=='u');
    }
}