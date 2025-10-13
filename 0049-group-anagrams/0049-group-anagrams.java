class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        if(strs.length==0) return res;
        HashMap<String,List<String>> map = new HashMap<>();
        for(int i=0;i<strs.length;i++){
            String curr=strs[i];
            char arr[]=curr.toCharArray();
            Arrays.sort(arr);
            String key= new String(arr);

            map.putIfAbsent(key,new ArrayList<>());
            map.get(key).add(curr);
        }
        res.addAll(map.values());
        return res;
        
    }
}