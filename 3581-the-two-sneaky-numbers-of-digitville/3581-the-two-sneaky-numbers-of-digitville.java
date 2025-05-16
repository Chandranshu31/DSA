class Solution {
    public int[] getSneakyNumbers(int[] nums) {
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
        int ans[]=new int[2];
        for(int i=0;i<2;i++){
            ans[i]=res.get(i);
        }
        return ans;
        
    }
}