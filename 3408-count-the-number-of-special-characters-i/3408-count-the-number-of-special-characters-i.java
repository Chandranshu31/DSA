class Solution {
    public int numberOfSpecialChars(String word) {
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<word.length();i++){
            char curr=word.charAt(i);
            int ascii=(int)curr;
            map.put(ascii,map.getOrDefault(ascii,0)+1);
        }
        HashSet<Integer> visited = new HashSet<>(); // to track the characters or ascii vals that have been visited
        int count=0;
        for(int key: map.keySet()){
            if(visited.contains(key)){
                continue;
            }
            if(map.containsKey(key+32)){
                
                count++;
               visited.add(key);
               visited.add(key+32);
            }
            else if(map.containsKey(key-32)){
                count++;
                visited.add(key);
                visited.add(key+-32);
            }
        }
        return count;
        
    }
}