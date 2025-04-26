class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
      HashSet<Integer> set = new HashSet<>();
      for(int num: nums1){
        set.add(num);
      }

      for(int num:nums2){
        if(set.contains(num)){
            return num;
        }
      }
      return -1;
        
    }
}

/**
ANOTHER APPROACH USING TREEMAP(sorted map)
class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        TreeMap<Integer, Integer> m1 = new TreeMap<>();
        TreeMap<Integer,Integer> m2 = new TreeMap<>();

        for(int num:nums1){
            m1.put(num,m1.getOrDefault(num,0)+1);
        }
         for(int num:nums2){
            m2.put(num,m2.getOrDefault(num,0)+1);
        }

        for(int key: m2.keySet()){
            if(m1.containsKey(key)){
                return key;
            }
        }
        return -1;
        
    }
}
 */