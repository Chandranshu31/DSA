class Solution {
    public boolean canBeIncreasing(int[] nums) {
        int ptr=0;
        while(ptr<=nums.length-1){
            ArrayList<Integer> temp = new ArrayList<>();
            for(int i=0;i<nums.length;i++){
                if(i==ptr) continue;
                else{
                 temp.add(nums[i]);
                }
            }
            if(isStrictlyIncreasing(temp)){
                return true;
            }
            ptr++;
        }
        return false;
    }
    public boolean isStrictlyIncreasing(ArrayList<Integer> arr){  // strictly increasing
        for(int i=1;i<arr.size();i++){
            if(arr.get(i)<=arr.get(i-1)){
                return false;
            }
        }
        return true;
    }
}