class Solution {
    public int numberOfSpecialChars(String word) {
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<word.length();i++){
            char curr=word.charAt(i);
            int ascii=(int)curr;
            map.put(ascii,map.getOrDefault(ascii,0)+1); /// add the char with its ascii val and freq in hashmap
        }
        HashSet<Integer> visited = new HashSet<>(); // to track the characters or ascii vals that have been visited
        int count=0;
        for(int key: map.keySet()){  // iterate over the map
            if(visited.contains(key)){  // if the char or ascii val already visited then just skip it
                continue;
            }
            if(map.containsKey(key+32)){
                  // if for a lower case an uppercase is also there in map
                count++;  // increment the count
               visited.add(key);  // mark the lowercase visited
               visited.add(key+32);  // mark the uppercase visited
            }
            else if(map.containsKey(key-32)){  // or if for an uppercase the lowercase is present
                count++;
                visited.add(key);
                visited.add(key+-32);
            }
        }
        return count;
        
    }

    // the diff between an uppercase and lowercase ascii values of a single character is  32
}