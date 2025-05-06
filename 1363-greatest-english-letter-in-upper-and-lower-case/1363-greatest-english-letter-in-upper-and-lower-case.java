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
        // now greatestAscii holds the ascii val of required greatest but in lower case so time convert it into uppercase
        char character=(char) greatestAscii;
        char res=Character.toUpperCase(character);
        return String.valueOf(res);
    }
}