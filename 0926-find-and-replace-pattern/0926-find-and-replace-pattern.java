class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        // if string present in words and pattern are isomorphic, that means if  they have one to one mapping then the words[i] matches the pattern
        List<String> res = new ArrayList<>();
        for(int i=0;i<words.length;i++){
            String curr=words[i];
            if(isIsomorphic(curr,pattern)){
                res.add(curr);
            }
        }
        return res; 
    }

    public boolean isIsomorphic(String s, String t){
        int n=s.length();
        int m=t.length();
        if(n!=m){
            return false;
        }

        HashMap<Character,Character> mapST= new HashMap<>();
        HashMap<Character,Character> mapTS= new HashMap<>();

        for(int i=0;i<n;i++){
            char c1=s.charAt(i);
            char c2=t.charAt(i);

            if(mapST.containsKey(c1)){
                if(mapST.get(c1)!=c2){
                    return false;
                }
            }else{
                mapST.put(c1,c2);
            }

            if(mapTS.containsKey(c2)){
                if(mapTS.get(c2)!=c1){
                    return false;
                }
            }else{
                mapTS.put(c2,c1);
            }
        }

        return true;
    }
     
}