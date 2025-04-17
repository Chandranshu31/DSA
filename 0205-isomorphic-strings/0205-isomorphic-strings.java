class Solution {
   public boolean isIsomorphic(String s, String t) {
         int n=s.length();// both have same length
         HashMap<Character,Character> mapST= new HashMap<>(); // to map character of s to t
         HashMap<Character, Character> mapTS= new HashMap<>(); // to map chars of t to s

         for(int i=0;i<n;i++){
            char c1=s.charAt(i);
            char c2=t.charAt(i);

            if(mapST.containsKey(c1)){ // if the current character has already been mapped
                if(mapST.get(c1)!=c2){ // and it has been mapped to a diff char than c2(kind of its alter in T) then return fasle
                    return false;
                }
            }else{
                mapST.put(c1,c2);  // othrwise map c1 to c2
            }

            if(mapTS.containsKey(c2)){
                if(mapTS.get(c2)!=c1){
                    return false;
                }
            }else{
                mapTS.put(c2,c1);
            }
         }
         // if all mappingis done without any conflict then return true

         return true;
}

}