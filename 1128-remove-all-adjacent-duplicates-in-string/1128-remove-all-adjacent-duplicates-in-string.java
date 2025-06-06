class Solution {
    public String removeDuplicates(String s) {
     int n=s.length();
     if(n==0)   return "";
      
     
     Stack<Character> stack = new Stack<>();

     stack.push(s.charAt(0));

     for(int i=1;i<n;i++){
        
        if(!stack.isEmpty() && stack.peek()==s.charAt(i)) stack.pop();

        else  stack.push(s.charAt(i));  

     }

     StringBuilder sb = new StringBuilder();

     while(!stack.isEmpty())  sb.append(stack.pop());
       
     sb.reverse();
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