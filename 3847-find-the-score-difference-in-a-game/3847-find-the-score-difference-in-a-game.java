class Solution {
    public int scoreDifference(int[] nums) {
        int a=0;// initially active
        int b=0; // initially inactive
        boolean isActive=true; // for A

        for(int i=0;i<nums.length;i++){
            if(nums[i]%2!=0){
                isActive=!(isActive);
            }
            if(isEverySixth(i)){
                isActive=!(isActive);
            }
            if(isActive)a+=nums[i];
            else b+=nums[i];
        }
        return a-b;

    }
    public static boolean isEverySixth(int x) {
    return x >= 5 && (x - 5) % 6 == 0;
}
}