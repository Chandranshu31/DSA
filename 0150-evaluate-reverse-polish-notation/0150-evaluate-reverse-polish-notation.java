class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> s = new Stack<>();
        for(String token: tokens){
            if(isOperator(token)){
                int b=Integer.parseInt(s.pop());
                int a=Integer.parseInt(s.pop());
                int res=applyOperator(a,b,token);
                s.push(String.valueOf(res));
            }else{
                s.push(token);
            }
        }
        return Integer.parseInt(s.pop());
        
    }
    public boolean isOperator(String token){
        return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
    }
    public int applyOperator(int a, int b, String operator){
        switch(operator){
            case "+": return a+b;
            case "-": return a-b;
            case "*": return a*b;
            case "/": return a/b;
            default: throw new IllegalArgumentException("Invalid operator");
        }
        
    }

}