class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> s = new Stack<>();
        int sum=0;
        for(String op: operations){
            if(op.equals("C")){
                int removed=s.pop();
                sum-=removed;
            }
            else if(op.equals("D")){
                int pk=s.peek();  // we r not supposed to remove here just add anew entry that is double of prev 
                s.push(2*pk);
                sum+=(2*pk);
            }
            else if(op.equals("+")){
                int top=s.pop();
                int newAddition= top+s.peek();
                s.push(top);
                s.push(newAddition);
                sum+=newAddition;
            }
            else{
                s.push(Integer.parseInt(op));
                sum+=Integer.parseInt(op);
            }
        }
        return sum;
        
    }
}