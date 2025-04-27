class Solution {
    public int findPermutationDifference(String s, String t) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){  // fill the  map with the  char and its idx in s
            map.put(s.charAt(i),i);
        }
        int sum=0;
        for(int i=0;i<t.length();i++){
            char curr=t.charAt(i); // given that t is a permutation of s that means every char in s exists in t nothing less and nothing more and for same freq also
            int idx1=map.get(curr); // get the idx of the occurence of curr char in string s
            sum+=Math.abs(idx1-i); // update sum
        }
        return sum;
        
    }
} 