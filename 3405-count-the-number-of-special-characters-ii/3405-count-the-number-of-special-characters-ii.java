class Solution {
    public int numberOfSpecialChars(String word) {
           HashMap<Integer,Integer> map1 = new HashMap<>();
           HashMap <Integer,Integer> map2 = new HashMap<>();

           // map1 to store the first occurences of caps letters present in string
           // map2 to store the last occurences of lowercase letters present in string

           for(int i=0;i<word.length();i++){
            char curr=word.charAt(i);
            if(Character.isLowerCase(curr)){  // to skip or ignore the lowercase letters
                 continue;
            }
            int ascii=(int) curr;
            if(map1.containsKey(ascii)){  // if a letter appears again (capslock) then ignore no need weve already got its first occurence
                continue;
            }
            map1.put(ascii,i);  // it will store the ascii val of caps let and as a val the first occurence of its in string
           }

           for(int i=word.length()-1;i>=0;i--){  // in map2 we will store the last occurence of a letter in lowercase, so thats why were iterating from back, aage se last mtlb peche se phla
            char curr=word.charAt(i);
            if(Character.isUpperCase(curr)){  // if uppercase ignore it
                continue;
            }
            int ascii=(int) curr;
            if(map2.containsKey(ascii)){ // if its appearing again again ignore as we already have its last occurence
                continue;
            }
            map2.put(ascii,i);  // put in map
           }

           int count=0;
           for(int key: map1.keySet()){
            if(map2.containsKey(key+32)){
                if(map2.get(key+32)<map1.get(key)){
                    count++;
                }
            }
           }
           return count;
     
    }
}