class Solution {
    public int reverse(int x) {
        int num = x;
        long rev = 0;
        while(num != 0){
            long lastdigit = num%10; // to get the last digit
            rev = 10*rev + lastdigit;
            if(rev > Integer.MAX_VALUE){ // to control the overflow of integer
                return 0;}
            if(rev < Integer.MIN_VALUE){//same as above
                return 0;
            }
            num/=10; // to remove the last digit
        }
        return (int)rev;
    }
}