class Solution {
    public int findDuplicate(int[] nums) {
     int slow=nums[0];  // initialise the two pointers on the first element
     int fast=nums[0];

     slow=nums[slow];     // move it one step ahead
     fast=nums[nums[fast]];  // move it two steps ahead

     while(slow!=fast){    // detect the cycle
        slow=nums[slow];
        fast=nums[nums[fast]];
     }

     slow=nums[0];  // when cycle got detected set slow at first element and move both of them one step
     while(slow!=fast){
        slow=nums[slow];
        fast=nums[fast];
     }  // the match at the duplicate number

     return fast;      
    }
}


/**
ANOTHER  VALID APPROACH FOR O(NLOGN) TIME AND O(1) SPACE
class Solution {
    public int findDuplicate(int[] nums) {
       Arrays.sort(nums);
       for(int i=1;i<nums.length;i++){
        if(nums[i]==nums[i-1]){
            return nums[i];
            
        }
       }

       return -1;        
    }
} */