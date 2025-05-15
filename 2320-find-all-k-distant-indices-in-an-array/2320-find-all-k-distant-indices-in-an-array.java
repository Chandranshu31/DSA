class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> keyIndices= new ArrayList<>();
        for(int i=0;i<nums.length;i++){ // add al the indices havig key to the list
            if(nums[i]==key){
                keyIndices.add(i);
            }
        }
        List<Integer> res= new ArrayList<>();
        for(int i=0;i<nums.length;i++){  // for every index
            int currIdx=i;
            for(int j=0;j<keyIndices.size();j++){  // iterate over keyidx
                if(Math.abs(currIdx-keyIndices.get(j))<=k){ // and if condition matches even once just add that index and break the  loop
                    res.add(currIdx);
                    break;
                }
            }
        }
        return res;
    }// by default increaing order as we r simply iterating and checking from begining
}