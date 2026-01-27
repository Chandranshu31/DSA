class Solution {
    public int minimumPrefixLength(int[] nums) {
        if(nums.length==0 || nums.length==1 ) return 0;
        //if(nums.length==1) return 0;
        if(strictlyDecreasing(nums)) return nums.length-1;
        if(strictlyIncreasing(nums)) return 0;
        int idx=-1;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]>=nums[i+1]){
                idx=i+1;
                break;
            }
        }
        return idx==-1?0:idx; 

        // from the right find the first idx where the condition matches and before that if we keep removing then it would be
        // a strictlt increasing rest in right...iterate from end


        
    }
    public boolean strictlyIncreasing(int nums[]){
        if(nums.length==0) return true;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<=nums[i-1]){
                return false;
            }
        }
        return true;
    }
    public boolean strictlyDecreasing(int nums[]){
        if(nums.length==0) return true;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>=nums[i-1]){
                return false;
            }
        }
        return true;
    }
}