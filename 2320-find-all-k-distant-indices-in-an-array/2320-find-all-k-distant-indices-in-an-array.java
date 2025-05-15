class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> keyIndices= new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==key){
                keyIndices.add(i);
            }
        }
        List<Integer> res= new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int currIdx=i;
            for(int j=0;j<keyIndices.size();j++){
                if(Math.abs(currIdx-keyIndices.get(j))<=k){
                    res.add(currIdx);
                    break;
                }
            }
        }
        return res;
    }
}