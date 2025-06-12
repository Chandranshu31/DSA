class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> q = new LinkedList<>();
        for(int s:students){
            q.add(s);
        }

        Stack<Integer> s = new Stack<>();
        for(int i=sandwiches.length-1;i>=0;i--){
            s.push(sandwiches[i]);
        }

       int count=0;  // to track the number of unsucessful atempts, if it gets equal to length of queue then no student in that queue wants that top stack element

       while(!q.isEmpty()){
           if(q.peek()== s.peek()){
            q.remove();
            s.pop();
            count=0;
           }else{
               q.add(q.remove());
               count++;
           }
           if(count==q.size()){
            // no student wants to have the sandwich present at the top of the stack
            return q.size(); // number of students who could not eat
           }
       }

       return q.size();


    }
}