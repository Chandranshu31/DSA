class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        if(s.length()<=9) return new ArrayList<String>(); // because we need the subsequence of length oonly of 10

        HashMap<String,Integer> map = new HashMap<>();
        for(int i=0;i<=s.length()-10;i++){
            String currPattern=s.substring(i,i+10);
            map.put(currPattern,map.getOrDefault(currPattern,0)+1);
        }

        ArrayList<String> res= new ArrayList<>();
        for(String p: map.keySet()){
            if(map.get(p)>1){
                res.add(p);
            }
        }
        return res;
        
    }
}