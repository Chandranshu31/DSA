class Solution {
    public String findCommonResponse(List<List<String>> responses) {
        HashMap<String,Integer> map = new HashMap<>();
        int maxFreq=0;
        String res="" ; // to store the best video response
        for(List<String> r : responses){
            HashSet<String> seen = new HashSet<>();
            for(int i=0;i<r.size();i++){
                String curr= r.get(i);
                if(!seen.contains(curr)){
                      map.put(curr,map.getOrDefault(curr,0)+1);
                      seen.add(curr);
                     int freq=map.get(curr);
                     if(freq>maxFreq || (freq==maxFreq && curr.compareTo(res)<0)){
                        res=curr;
                        maxFreq=freq;
                     }
                }
            }
        }
       
        return res;
        
    }
}