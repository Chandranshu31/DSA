class Solution {
    public int rearrangeCharacters(String s, String target) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch: s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        HashMap<Character,Integer> tMap= new HashMap<>();
        for(char ch: target.toCharArray()){
            tMap.put(ch,tMap.getOrDefault(ch,0)+1);
        }

        int minFreq=Integer.MAX_VALUE;
        for(char ch: target.toCharArray()){
            if (!map.containsKey(ch)) {
                return 0;
            }
            int possible = map.get(ch) / tMap.get(ch);
            minFreq = Math.min(minFreq, possible);
        }
        return minFreq;

      
    
    }
}