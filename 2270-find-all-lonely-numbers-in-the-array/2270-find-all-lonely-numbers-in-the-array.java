class Solution {
    public List<Integer> findLonely(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);  // store the numbs with their freq in  a map
        }

        List<Integer> list = new ArrayList<>();
        for(int key: map.keySet()){  // iterate over map
            if(map.get(key)==1 && (!map.containsKey(key-1)&& !map.containsKey(key+1))){ // if the freq==1 and key-1 and key+1 dne in map that eans also in array then add them inot a list
                list.add(key);
            }
    }

        return list;

        
    }
}