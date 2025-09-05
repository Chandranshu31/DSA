class LRUCache { 
    public int capacity;
    public HashMap<Integer,Integer> map;
    public Deque<Integer> dq;

    public LRUCache(int capacity) {
        this.capacity=capacity;
        this.map = new HashMap<>();
        this.dq= new LinkedList<>();
         
    }
    
    public int get(int key) {
        if(!map.containsKey(key)) return -1;
        // and if the map contains then this key is now the most recent used key so, just remove it from dq and add last which is MRU
        dq.remove(key);
        dq.addLast(key);
        return map.get(key);
        
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            map.put(key,value);
            // now this key is also a most recently used key
            dq.remove(key);
            dq.addLast(key);
            return;
        }

        if(map.size()==capacity){
            int lruKey=dq.removeFirst();
            map.remove(lruKey);
        }
        map.put(key,value);
        dq.addLast(key);
        
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */