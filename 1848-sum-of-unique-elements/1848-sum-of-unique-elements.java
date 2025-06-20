class Solution {
    public int sumOfUnique(int[] nums) {
        int map[]=new int[101];
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