class Solution {
    public int scoreDifference(int[] nums) {
        int a=0;// initially active
        int b=0; // initially inactive
        boolean isActive=true; // for A 

        for(int i=0;i<nums.length;i++){
            if(nums[i]%2!=0){  // if odd make a inactive
                isActive=!(isActive);
            }
            if(isEverySixth(i)){  // same for other condiiton
                isActive=!(isActive);
            }
            if(isActive)a+=nums[i];
            else b+=nums[i];
        }
        return a-b;

    }
    public static boolean isEverySixth(int x) { // func to check if its the every sixth indx..that is 5,11,17...
    return x >= 5 && (x - 5) % 6 == 0;
}
}