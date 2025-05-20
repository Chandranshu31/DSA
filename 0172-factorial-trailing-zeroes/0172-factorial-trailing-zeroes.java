class Solution {
    public int trailingZeroes(int n) {
        int count=0;
        while(n>=5){  // because the numbers from where we start getting the trailing zeros in factorial is 5, all below 5 does not have trailing zeros in their factorials
            n/=5;
            count+=n;
        }
        return count;    
    } 
}