class Solution {
    public int sumOfUnique(int[] nums) {
        int map[]=new int[101];  // given the isze of 100
        for(int i=0;i<nums.length;i++){
            map[nums[i]]++;
        }

        int sum=0;
        for(int i=0;i<map.length;i++){
            if(map[i]==1){
                sum+=i;
            }
        }
        return sum;
    }
}
/**
can be solved using a map also 
class Solution {
    public int sumOfUnique(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int num: nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int sum=0;
      for(int key: map.keySet()){  // can also use for(Mpa.Entry<Integer,Integer> entry: map.entrySet()){...}
        if(map.get(key)==1){
            sum+=key;
        }
      }

        return sum;
    }
    
} */