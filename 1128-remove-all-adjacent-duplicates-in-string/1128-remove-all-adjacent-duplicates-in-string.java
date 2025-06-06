class Solution {
    public String removeDuplicates(String s) {
     int n=s.length();
     StringBuilder sb = new StringBuilder();
     for(int i=0;i<n;i++){
        if(sb.length()>0){
            if(sb.charAt(sb.length()-1)==s.charAt(i)){  // if the prev element or last element added in stringulder is same as current character
            // then its a duplicate case, so delete that element from sb and donta= add this one into the sb
                sb.deleteCharAt(sb.length()-1);
            }else{
                sb.append(s.charAt(i)); // otherwise simply add
            }
        }else{
            sb.append(s.charAt(i));  // if sblength<0 then simply add the char 
        }
     }
     return sb.toString();
        
   
    }
}

/**
Another solution but with a repeatitive chekc over string s which is abit unnecessary 
class Solution {
    public String removeDuplicates(String s) {
     int n=s.length();
        
    while (isRepeating(s)) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < n; i++) {
        if (sb.length() > 0 && sb.charAt(sb.length() - 1) == s.charAt(i)) {
            sb.deleteCharAt(sb.length() - 1);
        } else {
            sb.append(s.charAt(i)); 
        }
      }
      s = sb.toString(); // update the S to check if its still has repeting occurences 
     }

     return s;   
    }
    public boolean isRepeating(String s){
        int n=s.length();
        for(int i=1;i<n;i++){
            if(s.charAt(i)==s.charAt(i-1)){
                return true;
            }
        }
        return false;
    }
}
 */