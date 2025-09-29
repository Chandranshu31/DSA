class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int k:map.keySet()){
            if(map.get(k)==1){
                return k;
            }
        }
        return 0; // unreachable statement
        
    }
}