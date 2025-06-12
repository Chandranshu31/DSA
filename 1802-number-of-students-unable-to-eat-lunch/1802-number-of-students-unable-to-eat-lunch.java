class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> q = new LinkedList<>();   /// to store the students standing in queue
        for(int s:students){
            q.add(s);
        }

        Stack<Integer> s = new Stack<>();  // to make the sandwiches get stored in stack so iterate from back to make sandwches[0] the top of stack
        for(int i=sandwiches.length-1;i>=0;i--){
            s.push(sandwiches[i]);
        }

       int count=0;  // to track the number of unsucessful atempts, if it gets equal to length of queue then no student in that queue wants that top stack element

       while(!q.isEmpty()){

           if(q.peek()== s.peek()){  // if choices matches the type
            q.remove();   // make the student leave
            s.pop();  // with the sandwich
            count=0;  // reset the unsuccessfull count to zero
           }else{
               q.add(q.remove());  // make the student stand last in the queue
               count++;    // unsuccessfull attemp count gets incremented
           }
           if(count==q.size()){
            // no student wants to have the sandwich present at the top of the stack
            return q.size(); // number of students who could not eat, if any numb os sttudents could not each the ans would get returned from here only
           }
       }

       return q.size();  // gets executed when q is empty so always res 0


    }
}