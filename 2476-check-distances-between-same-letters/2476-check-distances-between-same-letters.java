class Solution {
    public boolean checkDistances(String s, int[] distance) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char curr=s.charAt(i);
             map.put(curr,i);
        } // now in map we have the second occurence occurences and their indices
        
        HashMap<Character,Integer> map2 = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char curr=s.charAt(i);
            if(map2.containsKey(curr)){
                continue;
            }else{
                map2.put(curr,i); 
            }

        }  // now in map2 we have the first occurences

        boolean isWell = true;
        for(int i=0;i<s.length();i++){
            char curr=s.charAt(i);// this would always give us the first occurence 
            int a=map.get(curr);
            int b=map2.get(curr);
            if(a-b-1 != distance[curr-'a']){
                isWell=false;
            }

        }
        return isWell;

        
    }
}