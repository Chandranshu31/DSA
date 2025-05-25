class Solution {
    public int minSwaps(int[] nums) { 
        int k=0;
        for(int num: nums){
            if(num==1){
                k++;
            }
        }
        
        int count=0;
        for(int i=0;i<k;i++){
            if(nums[i]==0){
                count++;
            }
        }
        int n=nums.length;
        int minSwaps=count;
        for(int i=1 ;i<nums.length; i++){
            if(nums[(i-1)%n]==0){  // if element going out of window is 0 reduce the count
                count--;
            }
            if(nums[(i+k-1)%n]==0){  // if el added to the window is 0 then increase the count
                count++;
            }

            minSwaps=Math.min(count,minSwaps);
        }

        return minSwaps;

    }  // simply coun the number of 1s in the array and then 
    // for a window of that count find out the min number of swaps u need to make in that winodw to bring all the 1s together

}