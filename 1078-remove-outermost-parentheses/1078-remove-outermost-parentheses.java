class Solution {
    public String removeOuterParentheses(String s) {
        int n= s.length();
        StringBuilder ans= new StringBuilder();

        int count=0;
        int start=0; // start index
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='('){
                count++;
            }
            else{
                count--;
                if(count==0){ // before the curr idx i the part is primitive that is a avalid parentheseis
                ans.append(s.substring(start+1,i)); // remove the outer braces  (begin is inclusive, ending idx is exclusive)
                  start=i+1; // shift it to the next part to get next primitive part
                }
            }
            
        }
        return ans.toString();
        
    }
}