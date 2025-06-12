class Solution {
    public int maxDepth(String s) {
       Stack<Character> st = new Stack<>();
       int count=0;
       int maxCount=0;
       for(int i=0;i<s.length();i++){
        char curr=s.charAt(i);
        if(curr!='(' && curr!=')'){
            continue;
        }
        if(curr=='('){
            st.push(curr);
            count++;
            maxCount=Math.max(count,maxCount);
        }
        else{
            st.pop();
            count--;
        }
    
       }

       return maxCount; 
    }
}