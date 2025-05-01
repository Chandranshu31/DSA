class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> map1 = new HashMap<>();
        for(char ch: ransomNote.toCharArray()){
            map1.put(ch,map1.getOrDefault(ch,0)+1);
        }
        HashMap<Character,Integer> map2 = new HashMap<>();
        for(char ch: magazine.toCharArray()){
            map2.put(ch,map2.getOrDefault(ch,0)+1);
        }
        // boolean can=true;
        for(int i=0;i<ransomNote.length();i++){
            char curr=ransomNote.charAt(i);
            if(!map2.containsKey(curr)){
               return false;
            }
            else{
                if(map1.get(curr)>map2.get(curr)){ // if the freq of element in ransomnote is greater than the freq of char in mag then ransom note cannot be formed
                    return false;
                }
            }
        }
        return true;  
    }
}