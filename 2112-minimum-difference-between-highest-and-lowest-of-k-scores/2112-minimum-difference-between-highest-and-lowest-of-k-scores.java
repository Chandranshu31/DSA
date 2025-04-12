class Solution {
    public int minimumDifference(int[] nums, int k) {
        
        Arrays.sort(nums);
        int n= nums.length;
        if(n==1){
            return 0;
        }
        int min_Diff=Integer.MAX_VALUE;
        for(int i=0;i<=n-k;i++){
            int max=nums[i+k-1];  // the last elelemnt of window would be max 
            int min=nums[i];  // first would be min ... in a single window as the array has been sorted
            min_Diff=Math.min(min_Diff,max-min);
     
        
        }
        return min_Diff;
    }
}

/**
ANOTHER SOLUTION BUT BRUTE FORCE IN WHICH ITERATE OVER EACH WINDOW
class Solution {
    public int minimumDifference(int[] nums, int k) {
        
        Arrays.sort(nums);
        int n= nums.length;
        if(n==1){
            return 0;
        }
        int min_Diff=Integer.MAX_VALUE;
        for(int i=0;i<=n-k;i++){
            int count=k;
            int currIdx=i;
            int highest=Integer.MIN_VALUE;
            int lowest=Integer.MAX_VALUE;
            while(count>0){
                highest=Math.max(nums[currIdx],highest);
                lowest=Math.min(nums[currIdx],lowest);
                count--;
                currIdx++;
            }
            
            min_Diff=Math.min(min_Diff,highest-lowest);
        
        }
        return min_Diff;
    }
} */
