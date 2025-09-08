class Solution {
    public int minOperations(int[] nums, int x) {
        int n=nums.length;
        int total=0;
        for(int num:nums){
            total+=num;
        }
        int target=total-x;
        if(target<0) return -1;
        if(target==0) return n;

        int currSum=0;
        int maxLen=-1;
        int left=0;

        for(int right=0;right<n;right++){
            currSum+=nums[right];

            while(currSum>target && left<=right){
                currSum-=nums[left];
                left++;
            }
      
        if(currSum==target){
            maxLen=Math.max(maxLen,right-left+1);
        }
        }

        return maxLen==-1 ? -1: n-maxLen;
    }

    /**In this question we are supposed to tell the min numb of operations to reduce x to zero by removing eleemnts from left and right only,
    so, its like keep adding elemnts from left and right  to sum until they become ==x which makes A MIDDLE SUBARRAY WHOSE sum is totalsum-x and if the length of  this middle
    subarray is longest then it means we have picked the least number of elements from left and right. so we just need to find the maxlen of such  subarray that
    has sum==totalsum-x and then numb of operations would be n-maxlen if such subarray exists or else it would be zero */
}

/** previously i was approach it as gredy +sorting which was passing a few test cases, but not all
class Solution {
    public int minOperations(int[] nums, int x) {
    int n=nums.length;
    int op=0;
    Arrays.sort(nums);
    if(nums[0]>x){
        return -1; // in array there are no elements that r equal or smaller than x so we cant perform the substraction operation here
    }
    int i=0;
    int j=n-1;
    while(i<=j){
        if(nums[j]<=x){
            x-=nums[j];
            op++;
            if(x==0) break;
            j--;
        }else if(nums[i]<=x){
            x-=nums[i];
            op++;
            if(x==0) break;
            i++;
        }else if(nums[j]>x){
            j--;
        }else if(nums[i]>x){
            i++;
        }

    }
    return x==0? op:-1;
    
}
} */

 