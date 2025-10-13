class Solution {
    public List<String> removeAnagrams(String[] words) {
        int n=words.length;
        ArrayList<String> list = new ArrayList<>();
        list.add(words[0]);
        for(int i=1;i<words.length;i++){
            String prevWord=list.get(list.size()-1);
            if(isAnaGram(words[i],prevWord)){
                continue;
            }else{
                list.add(words[i]);
            }
        }
        return list;
        
    }
    public boolean isAnaGram(String s,String t){
        if(s.length()!=t.length()) return false;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }

        for(int i=0;i<t.length();i++){
            char ch= t.charAt(i);

            if(map.containsKey(ch)){
                if(map.get(ch)==1){
                    map.remove(ch);
                }
                else{
                    map.put(ch,map.get(ch)-1);
                }
            }else{
                return false;
            }
        }
        return map.size()==0;
    }
}