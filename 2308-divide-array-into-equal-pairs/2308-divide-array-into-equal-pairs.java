class Solution {
    public boolean divideArray(int[] nums) {
        int n=nums.length;
        if(n%2!=0){
            return false;
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        for(int num: map.keySet()){
            int k=map.get(num);
            if(k%2!=0){
                return false;
            }
        }
        return true;
    }
}
// can be done using a freq also, if freq of any element is odd then it the array cant be paired in n groups if thre are 2n elements and a group can only have duplicates