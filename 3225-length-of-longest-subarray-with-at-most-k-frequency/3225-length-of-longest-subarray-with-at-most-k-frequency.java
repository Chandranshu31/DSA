class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
     HashMap<Integer,Integer> map = new HashMap<>();
     int i=0;  // set a pointer at left
     int maxLen=Integer.MIN_VALUE;
     for(int j=0;j<nums.length;j++){  // j is the right pointer
        map.put(nums[j],map.getOrDefault(nums[j],0)+1);  // add the next el inot the subarray
     
     while(map.get(nums[j])>k){   // if after adding it the freq of newly added el exceeds k then start shrinking the  window from the lest by reducing the frequency of left element which went out of window by1
        map.put(nums[i],map.get(nums[i])-1);
        i++;
     }
     maxLen=Math.max(maxLen,j-i+1); // keep updating it
        
    }
    return maxLen;
    }

}