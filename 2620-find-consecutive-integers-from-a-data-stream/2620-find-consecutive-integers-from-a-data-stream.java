class DataStream {
    int count;
    int value;
    int k;

    public DataStream(int value, int k) {
        this.k=k;
        this.value=value;
        this.count=count;
        
    }
    
    public boolean consec(int num) {
    if(num==value){
        count++;
    }else{
        count=0;
    }
    return count>=k;
        
    }
}

/**
 * Your DataStream object will be instantiated and called as such:
 * DataStream obj = new DataStream(value, k);
 * boolean param_1 = obj.consec(num);
 */

 /**
 Another soln  but tle for larger cases 
 class DataStream {
    public Queue<Integer> q;
    int value;
    int k;

    public DataStream(int value, int k) {
        this.k=k;
        this.value=value;
        this.q=new LinkedList<>();
        
    }
    
    public boolean consec(int num) {
        q.add(num);
        if(q.size()<k) return false;

        if(q.size()>k){
            q.remove();
        }
        for(int n: q){
            if(n!=value){
                return false;
            }
        }
        return true;
        
    }
}

/**
 * Your DataStream object will be instantiated and called as such:
 * DataStream obj = new DataStream(value, k);
 * boolean param_1 = obj.consec(num);
 */ 