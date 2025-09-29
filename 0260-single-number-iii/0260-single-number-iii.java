class Solution {
    public int[] singleNumber(int[] nums) {
        int res[]=new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int i=0;
        for(int k:map.keySet()){
            if(map.get(k)==1){
                res[i++]=k;
                if(i==2) break;
            }
        }
        return res;
    }
}