class MyHashSet {
    public boolean setArr[]; // using a boolean array where each index represents that number

    public MyHashSet() {
        setArr= new boolean[1000001];  // given the size in description
    }
    
    public void add(int key) {
        setArr[key]=true; // add key means mark that index as true so value exists
        
    }
    
    public void remove(int key) {  // make it false
        setArr[key]=false;
        
    }
    
    public boolean contains(int key) {  // return whatever is there
        return setArr[key];
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */