class FreqStack {
    HashMap<Integer,Integer> freq;  // stores the frequency of a number
    HashMap<Integer, Stack<Integer>> group;  // key is the freq and value is all the numbes having those freq in a stack.... so that if fre colide we cna get the most reentone by top of stack, LIFO
    int maxFreq;

    public FreqStack() {
        freq = new HashMap<>();
        group = new HashMap<>();
        maxFreq=0;
        
    }
    
    public void push(int val) {
      int f=freq.getOrDefault(val,0)+1; // get the freq of val, if dnethen 0+1 or if exists then +1
        freq.put(val,f); // put it into the map now with new freq

        maxFreq=Math.max(f,maxFreq);  // update max feq if possible

        if (!group.containsKey(f)) {  // if group dne then create a key of this freq and a stack correspondindg to it
         group.put(f, new Stack<>());
         }
         group.get(f).push(val);     // then push the val inot that stack
    }
    
    public int pop() {
        int x=group.get(maxFreq).pop();  // get the most reent numb with maxfreq by map->correspondng key of maxfreq then value of stack then pop for most recent one
        freq.put(x,freq.get(x)-1);  // update the frequency of current numb
         if (group.get(maxFreq).isEmpty()) {  // if group is empty now for the key then reduce amxfreq as thee are no numbers there
            maxFreq--;
        }
        return x;

        
    }
}

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(val);
 * int param_2 = obj.pop();
 */