class Solution {
    public int mirrorDistance(int n) {
        return Math.abs(n-reverse(n));
        
    }
    public int reverse(int n){
        int rev=0;
        while(n>0){
            int lastDig=n%10;
            rev=(rev*10)+lastDig;
            n=n/10;
        }
        return rev;
    }
}