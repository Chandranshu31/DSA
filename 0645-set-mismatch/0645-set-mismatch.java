class Solution {
    public int[] findErrorNums(int[] nums) {
        int res[]=new int[2];
        
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        for(int k:map.keySet()){
            if(map.get(k)==2){
                res[0]=k;
                break;
            }
        }

        HashSet<Integer> set = new HashSet<>();
        for(int num:nums){
            set.add(num);
        }

        for(int i=1;i<=nums.length;i++){
            if(!set.contains(i)){
                res[1]=i;
                break;
            }
        }

        return res;
    }
}