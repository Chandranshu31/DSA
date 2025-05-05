class Solution {
    public String kthDistinct(String[] arr, int k) {
        LinkedHashMap<String,Integer> map = new LinkedHashMap<>();
        HashSet<String> duplicates = new HashSet<>();
        for(String el:arr){
            if (duplicates.contains(el)) {
                continue; // already known as duplicate
            }
            if(map.containsKey(el)){
                map.remove(el);
                duplicates.add(el);
            }else{
            map.put(el,1);
            }
        }
        if(map.size()<k){
            return "";
        }
        int i = 0;
        for (String key : map.keySet()) {
            i++;
            if (i == k) return key;
        }

        return "";
      
        
    }
}