class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character,Integer> vow = new HashMap<>();
        HashMap<Character,Integer> cons = new HashMap<>();
        int maxVow=0;
        int maxCons=0;

        for(char ch: s.toCharArray()){
            if(isVowel(ch)){
              vow.put(ch,vow.getOrDefault(ch,0)+1);
              maxVow=Math.max(maxVow,vow.get(ch));
            }else{
                cons.put(ch, cons.getOrDefault(ch,0)+1);
                maxCons=Math.max(maxCons,cons.get(ch));
            }
        }
        return maxVow+maxCons;
    }
    public boolean isVowel(char c){
        return ( c=='a' || c=='e' || c== 'i' || c=='o' || c=='u');
    }
}