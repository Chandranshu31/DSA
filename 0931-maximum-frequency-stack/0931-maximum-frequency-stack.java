class FreqStack {
    HashMap<Integer,Integer> freq;
    HashMap<Integer, Stack<Integer>> group;
    int maxFreq;

    public FreqStack() {
        freq = new HashMap<>();
        group = new HashMap<>();
        maxFreq=0;
        
    }
    
    public void push(int val) {
        int f=freq.getOrDefault(val,0)+1; 
        freq.put(val,f);

        maxFreq=Math.max(f,maxFreq);

        if (!group.containsKey(f)) {
         group.put(f, new Stack<>());
         }
         group.get(f).push(val);   
    }
    
    public int pop() {
        int x=group.get(maxFreq).pop();
        freq.put(x,freq.get(x)-1);
         if (group.get(maxFreq).isEmpty()) {
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