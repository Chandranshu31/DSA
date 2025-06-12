class CustomStack {
    int n;
    int arr[];
    int top=-1;  // to track the top of the stack

    public CustomStack(int maxSize) {
        arr= new int[maxSize];  // the array will act as stack, where we increent top pointer and putvalue inits place
        n=maxSize; // size of stack or arr
    }
    
    public void push(int x) {
        if(top < n-1){ // if stack is not full
            arr[++top]=x;  // increment top and inseert
        }
    }
    
    public int pop() {
        if(top==-1){  // is stack is empty
            return -1;
        }
        return arr[top--];  // or else
        
    }
    
    public void increment(int k, int val) {
        if(top>=k){  // if top is k times ahead of bottom then...
            for(int i=0;i<k;i++){
                arr[i]+=val;
            }
        }else{  // or else increment all  the el by 1
            for(int i=0;i<=top;i++){
                arr[i]+=val;
            }
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */