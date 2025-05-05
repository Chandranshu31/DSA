class Solution {
    public int countDistinctIntegers(int[] nums) {
        int n=nums.length;
        HashSet<Integer> set = new HashSet<>();
       for(int num:nums){
        set.add(num);
        int r=rev(num);
        set.add(r);
       }
        return set.size();
    }
    
    public int rev(int num){
        long res=0;
        while(num!=0){
            int lastDigit=num%10;
            res=res*10+lastDigit;
            if(res > Integer.MAX_VALUE){ // to control the overflow of integer
                return 0;}
            if(res < Integer.MIN_VALUE){//same as above
                return 0;
            }
            num/=10;
        }
        return(int)res;
        
    }
}