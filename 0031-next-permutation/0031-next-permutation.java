class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int i=n-2;

        while(i>=0 && nums[i]>=nums[i+1]){  // find the first decreasig elemnt from right
            i--;
        }

        if(i>=0){  // if such a numb exists then
           int j=n-1;
           while(j>=0 && nums[i]>=nums[j]){
            j--;
           }

           swap(i,j,nums);
        }
        reverse(nums,i+1);


        
    }
    public void swap(int i, int j, int nums[]){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public void reverse(int nums[], int i){
      
        int start=i;
        int end=nums.length-1;
        while(start<end){
            int a=nums[start];
            nums[start]=nums[end];
            nums[end]=a;
            start++;
            end--;
        }
    }
}