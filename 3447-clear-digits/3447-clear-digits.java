class Solution {
    public String clearDigits(String s) {
        Stack<Character> st = new Stack<>();
        for(char c: s.toCharArray()){
            if(Character.isDigit(c)){
                if(!st.isEmpty()){
                    st.pop();
                }
            }else{
                st.push(c);
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        sb.reverse(); // to get the original order.

        return sb.toString();
        
      
        
    }
}


/**
Another approach and better ig is 
class Solution {
    public String clearDigits(String s) {
        StringBuilder sb = new StringBuilder();

        for(char c : s.toCharArray())
        {
            if(Character.isDigit(c))
            {
                sb.deleteCharAt(sb.length()-1);
            }
            else
            {
                sb.append(c);
            }
        }
        return sb.toString();
    }
} */