class Solution {
    public int findMaxK(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num: nums){
            if(num<0){
                set.add(num);
            }
        }

        int largest=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                continue;
            }
            if(nums[i]>largest && set.contains(-nums[i])){
                largest=nums[i];
            }
        }
        return largest;
    }
}