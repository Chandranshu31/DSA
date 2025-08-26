class Solution {
    public int calculate(String s) {
        if(s==null || s.length()==0) return 0;
        Stack<Integer> st = new Stack<>();
        int n=s.length();
        char sign='+';
        int num=0;
        for(int i=0;i<n;i++){
            char curr=s.charAt(i);
            if(Character.isDigit(curr)){
                num=num*10+(curr-'0'); // build the numb from string
            }
            // if operator or last character
            if((!Character.isDigit(curr)&& curr!=' ') || i==n-1){ //curr is operator
                if(sign=='+'){
                    st.push(num);
                }else if(sign=='-'){
                    st.push(-num);
                }else if(sign=='*'){
                    st.push(st.pop()*num);
                }else{
                    st.push(st.pop()/num);
                }
                sign=curr;
                num=0; // to build next numb ,........... our code ignores white spaces

            }
        }
        int result = 0;
        for (int x : st) result += x;
        return result;
        
    }
}