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
            else if(op.equals("+")){  // to add prev two
                int top=s.pop();  // get the top
                int newAddition= top+s.peek(); // the new umb as the 2nd would become current top
                s.push(top);  // push the top first to maintain te order
                s.push(newAddition);  // then add the new addition
                sum+=newAddition;
            }
            else{
                s.push(Integer.parseInt(op));
                sum+=Integer.parseInt(op);
            }
        }
        return sum;
        
    }
    // here we calculated the running sum dynamically... instead of calaculating it explicitly after the operations
}