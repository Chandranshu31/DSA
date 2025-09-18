class Solution {
    public String findCommonResponse(List<List<String>> responses) {
        TreeMap<String,Integer> map = new TreeMap<>();
        int maxFreq=0;
        for(List<String> r : responses){
            HashSet<String> seen = new HashSet<>();
            for(int i=0;i<r.size();i++){
                String curr= r.get(i);
                if(!seen.contains(curr)){
                      map.put(curr,map.getOrDefault(curr,0)+1);
                      seen.add(curr);
                      maxFreq=Math.max(maxFreq,map.get(curr));
                }
            }
        }
        for(String r: map.keySet()){
            if(map.get(r)==maxFreq){
                return r;
            }
        }
        return " ";
        
    }
}