class Solution {
    public String triangleType(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        if(isValid(nums)){
        if(set.size()==1){
            return "equilateral";
        }
        else if(set.size()==2){
            return "isosceles";
        }else{
            return "scalene";
        }
        }

        return "none";

    
        
    }
    public boolean isValid(int nums[]){
        int a=nums[0];
        int b=nums[1];
        int c=nums[2];

        if(  ((a+b)>c) && ((b+c)>a)  && ((c+a)>b)   ){
            return true;
        }
        return false;
    }
}