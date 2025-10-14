class Solution {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        for(int i=0;i+2*k<=nums.size();i++){
            boolean firstInc=true;
            boolean secondInc=true;
            for(int j=i;j<i+k-1;j++){
                if(nums.get(j)>=nums.get(j+1)){
                    firstInc=false;
                    break;
                }
            }
            for(int j=i+k;j<i+2*k-1 && firstInc;j++){
                if(nums.get(j)>=nums.get(j+1)){
                    secondInc=false;
                    break;
                }
            }
            if(firstInc && secondInc) return true;
      



        }
        return false;
        
    }
}