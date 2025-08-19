class Solution {
    public String reverseParentheses(String s) {
        Stack<StringBuilder> st = new Stack<>();
        StringBuilder curr = new StringBuilder();

        for(char c: s.toCharArray()){
            if(c=='('){
                st.push(curr);
                curr=new StringBuilder();
            }else if(c==')'){
                curr.reverse();
                curr=st.pop().append(curr);
            }else{
                curr.append(c);
            }
        }
        return curr.toString();

    }
}