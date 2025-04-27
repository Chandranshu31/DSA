class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<t.length();i++){
            map.put(t.charAt(i),map.getOrDefault(t.charAt(i),0)+1);
        }

        for(int i=0;i<s.length();i++){
            char curr=s.charAt(i);
            if(map.containsKey(curr)){
                map.put(curr,map.get(curr)-1);
            }
        }

        for(char key: map.keySet()){
            if(map.get(key)==1){
                return key;
            }
        }

        return ' ';


    }
}