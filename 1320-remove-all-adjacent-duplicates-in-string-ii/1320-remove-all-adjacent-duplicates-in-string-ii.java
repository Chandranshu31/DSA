class Solution {
       static class pair{
        char ch;
        int count;
        public pair(char ch, int count){
            this.ch=ch;
            this.count=count;
        }
    }
    public String removeDuplicates(String s, int k) {
        Stack<pair> st= new Stack<>();
        for(int i=0;i<s.length();i++){
            char curr=s.charAt(i);
            if(!st.isEmpty()&& st.peek().ch==curr){
                st.peek().count++;
            }else{
                st.push(new pair(curr,1));
            }
            if(st.peek().count==k){
                st.pop();
            }
        }

        StringBuilder sb = new StringBuilder();
        for(pair p: st){  // get every pair from stack
            for(int i=0;i<p.count;i++){ // for the count times of  a pair
                sb.append(p.ch);  // addit tto the sb
            }
        }
        return sb.toString();
   
    }
 
}