class Solution {
    public int findNumbers(int[] nums) {
        int n=nums.length;
        if(n==0){
            return 0;
        }
        int count =0;

        for(int i=0;i<n;i++){
            int digits=0;
            while(nums[i]!=0){
                nums[i]=nums[i]/10; //keep removing the last digit,it will help us count the no. of digits that element has
                digits++;
            }
            if(digits%2==0){
                count++;
            }
      


        }
              return count;
        
    }
}