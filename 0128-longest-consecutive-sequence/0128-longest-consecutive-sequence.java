class Solution {
    public int longestConsecutive(int[] nums) {
      int n=nums.length;
      if(n==0){
        return 0;
      }

      int maxLen=0;
      HashSet<Integer> set = new HashSet<>();
      for(int num:nums){
        set.add(num);  // used a HS to avoid the duplicates
      }

      for(int num : set){

        if(!set.contains(num-1)){  // that means there r no numbers smaller than it in the set, and its the first element of the  sequence
        int currNum=num;
        int count=1;

        while(set.contains(currNum+1)){  // keep increasing the length of the sequence till we r getting currnum+1 and keep updating currNum also
            count++;
            currNum++;
        }
        maxLen=Math.max(maxLen,count);  // update after every iteration

        }
      }

      return maxLen;
    
    }
}  // O(n) time, O(n) space

/**
An alternate solution with O(n logn) time comp and O(1) space
class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        if(n==0){
            return 0;
        }
        Arrays.sort(nums);
        int maxLen=1;
        int count=1; // cause we also  consider the curr num as a part of sequence 
        for(int i=1;i<n;i++){
            if(nums[i]==nums[i-1]){
                continue;
            }
            else if(nums[i]==nums[i-1]+1){
                count++;
            }
            else{
                count=1; // the sequnce breaks so simply reset the count to 1
            }
            maxLen=Math.max(maxLen,count);
        }

        return maxLen;
    
    }
}
 */