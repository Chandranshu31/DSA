class Solution {
    public int firstUniqueFreq(int[] nums) {
        LinkedHashMap<Integer,Integer> map = new LinkedHashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        HashMap<Integer,Integer> hMap = new HashMap<>();
        for(int freq:map.values()){
            hMap.put(freq,hMap.getOrDefault(freq,0)+1);
        }
        for(int key:map.keySet()){
            int freq=map.get(key);
            if(hMap.get(freq)==1){
                return key;
            }
        }
        return -1;
   
    }
}