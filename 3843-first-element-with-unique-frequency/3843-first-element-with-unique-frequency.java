class Solution {
    public int firstUniqueFreq(int[] nums) {
        LinkedHashMap<Integer,Integer> map = new LinkedHashMap<>(); // count freq of numbers, linked imp to maintain the order
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        HashMap<Integer,Integer> hMap = new HashMap<>(); // count freq of frequencies
        for(int freq:map.values()){
            hMap.put(freq,hMap.getOrDefault(freq,0)+1);
        }
        // then interaate on first map to check which first numb has unique freq
        for(int key:map.keySet()){
            int freq=map.get(key);
            if(hMap.get(freq)==1){
                return key;
            }
        }
        return -1;
   
    }
}

// find fereq, then freq of freq, then chck which is the first number whose freq is unique that is its freq's freq is 1