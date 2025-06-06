class Solution {
    public String removeStars(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char curr=s.charAt(i);
            if(curr!='*'){
                sb.append(curr);
            }else{
                sb.deleteCharAt(sb.length()-1);
            }
        }    
        return sb.toString();
    }
}
/** AN ALTER soln
class Solution {
    public String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='*'){
                stack.push(s.charAt(i));
            }
            else{
                stack.pop();
            }
        }
        String temp="";
        while(!stack.isEmpty()){
            char ch=stack.pop();
            temp+=ch;
        }
        
        int j=temp.length()-1;
        String res="";
        while(j>=0){
            res+=temp.charAt(j);
            j--;
        }
        return res;
        
    }
} */