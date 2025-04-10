class Solution {
    public int minIncrementForUnique(int[] nums) {
        int n= nums.length;
        Arrays.sort(nums);
        int count=0;
        for(int i=1;i<n;i++){
            if(nums[i]<=nums[i-1]){
                // case of not  unique  if equal then also or if < then maybe somewhere back the array has same element
                int inc = (nums[i-1]+1)-nums[i];  // we want the current to be just +1 than its prev to ensure min moves
                // so,we do nums[i-1]+1 where we want to reach subtract nums[i] where we exactly are 
                nums[i]+=inc;  // incremeent the number
                count+=inc;  // increment the count as well
            }
        }
        return count;
        
    }
}

/**
nums[i-1]+1 is like where we want to take the cuurent numb and -nums[i] means the steps we have walked till now  */