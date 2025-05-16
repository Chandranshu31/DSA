class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        List<Integer> res= new ArrayList<>();
        for(int k:map.keySet()){
            if(map.get(k)==2){
                res.add(k);
            }
        }
        return res;
        
    }
}