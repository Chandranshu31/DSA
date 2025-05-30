class Solution {
    public String greatestLetter(String s) {
        TreeMap<Integer,Integer> map = new TreeMap<>();
        for(int i=0;i<s.length();i++){
            char curr=s.charAt(i);
            int ascii=(int)curr;
            map.put(ascii,map.getOrDefault(ascii,0)+1);
        }

        int greatestAscii=Integer.MIN_VALUE;
        HashSet<Integer> visited = new HashSet<>();
        for(int key: map.keySet()){
            if(visited.contains(key)){
                continue;
            }

            if(map.containsKey(key+32)){
                greatestAscii=Math.max(greatestAscii,key);
                visited.add(key);
               // visited.add(key+32);
            }
        }
        if(greatestAscii==Integer.MIN_VALUE){
            return "";
        }
        // now greatestAscii holds the ascii val of required greatest and also the uppercase on only cause during iteration 
        // we only chekced for key+32 which is for an uppercase(key) if the lowercase exists... then update the greatest ascii
        return String.valueOf((char)greatestAscii);
    }
}