class Solution {
    public boolean makeEqual(String[] words) {
        HashMap<Character,Integer> map = new HashMap<>();
         for(String word: words){
            for(char ch: word.toCharArray()){
                map.put(ch,map.getOrDefault(ch,0)+1);
            }
         }
        int n=words.length;

       for(int val: map.values()){
        if(val% n!=0){
            return false;
        }
       }
        return true;
        
    }
}