class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count=0;
        HashSet<Character> set = new HashSet<>();
        for(char ch: allowed.toCharArray()){
            set.add(ch);
        }

        for(int i=0;i<words.length;i++){
            HashSet<Character> s = new HashSet<>();
            for(char ch: words[i].toCharArray()){
                s.add(ch);
            }
            if(set.containsAll(s)){  // returns true if set contains all the elements that s have 
                count++;
            }
        }
        return count;
    }
}