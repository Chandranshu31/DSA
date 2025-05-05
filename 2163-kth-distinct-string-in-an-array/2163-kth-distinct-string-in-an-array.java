class Solution {
    public String kthDistinct(String[] arr, int k) {
        LinkedHashMap<String,Integer> map = new LinkedHashMap<>();
        HashSet<String> duplicates = new HashSet<>();
        for(String el:arr){
            if (duplicates.contains(el)) {
                continue; // already known as duplicate do nothing n skip this iteration
            }
            if(map.containsKey(el)){
                map.remove(el);  // if an el appeared for more than 1 time just remove it from ur map
                duplicates.add(el); // add to duplicate
            }else{
            map.put(el,1);
            }
        }
        // now map only has elements with freq==1 in arr and the insertion order is maintained due to linkedhashmap
        if(map.size()<k){
            return "";
        }
        int i = 0; // jus get the kth key
        for (String key : map.keySet()) {
            i++;
            if (i == k) return key;
        }

        return "";
      
        
    }
}