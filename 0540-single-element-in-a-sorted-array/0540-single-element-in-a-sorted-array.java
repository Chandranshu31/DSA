class Solution {
    public int singleNonDuplicate(int[] nums) {

        int n=nums.length; 
        int low=0;
        int high=n-1; 

        if(high==0){
            return nums[0];
        }
        if(nums[0]!=nums[1]){
            return nums[0];
        }
        if(nums[high]!=nums[high-1]){
            return nums[high];
        }  
  /// the PAIRS in left of unique elements exists in[even,odd] index pair and in right [odd,even] index pair 

        while(low<=high){
            int mid= low+(high-low)/2;

            if(nums[mid]!=nums[mid-1] && nums[mid]!=nums[mid+1]){ // unique element condition
                return nums[mid];
            }

            else if( ( (mid%2)==0 && nums[mid]==nums[mid+1]) || ((mid%2==1) && nums[mid]==nums[mid-1]) ) {
                // here in both the above conditions the pair exists and it exists on [EVEN,ODD]index 
                // therefore we are in teh left of the unique element so just move to the right,i.e mid+1
                low =mid+1;
            }
            else{  
                // the pairs exists and they are in[ODD,EVEN] index form so we are in right of unique element there fore got left
                high=mid;
            }
          
        }
        return -1;  // we wont reach this state as given that an unnique element always exists
      
        
    }
}