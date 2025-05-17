class Solution {
    public void sortColors(int[] nums) {
        int  n= nums.length;
        int low=0;
        int mid=0;
        int high=n-1;

        while(mid<=high){ 
            if(nums[mid]==0){
                swap(nums,mid,low);
                mid++;
                low++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else {
                // nums[mid]==2
                swap(nums,mid,high);
                high--;
            }
        }
        
    } 
    public static void swap(int nums[],int a, int b){ // helper fn to swap two elements inside an array
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
}

/**

arr[mid] = 0, then swap arr[lo] and arr[mid] and increment low and mid  by 1 
arr[mid] = 1,  increment mid by 1.
arr[mid] = 2, then swap arr[mid] and arr[hi] and decrement hi by 1 */