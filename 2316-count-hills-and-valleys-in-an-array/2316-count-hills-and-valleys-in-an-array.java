class Solution {
    public int countHillValley(int[] nums) {

        int n=nums.length;
        int hill=0; // to store  number of hills
        int valley=0; // to store number of valleys
        int lastUnique = nums[0]; //assume that current numb has not repeated yet
        int uniqueCount = 1;

        for (int i = 1; i < n; i++) {
            if (nums[i] != lastUnique) {
                lastUnique = nums[i];
                nums[uniqueCount] = nums[i];
                uniqueCount++;
            }
        }

        for(int i=1;i<uniqueCount-1;i++){
           
            if(nums[i]>nums[i+1]&&nums[i]>nums[i-1]){
                hill++;
            }
            else if(nums[i]<nums[i-1]&&nums[i]<nums[i+1]){
                valley++;
            }
            else{

            }
        }
        return hill+valley;
        
    }
}