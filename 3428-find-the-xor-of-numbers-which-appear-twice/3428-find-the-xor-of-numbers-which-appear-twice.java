class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int ans=0;
        for(int k:map.keySet()){
            if(map.get(k)==2){
                ans=ans^k;

            }
        }
        return ans;
    }
}