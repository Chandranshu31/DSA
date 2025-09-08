class Solution {
    public boolean checkDivisibility(int n) {
        int digSum = 0;
        long digProd = 1;  // use long to prevent overflow
        int x = n;

        while (x > 0) {
            int lastDig = x % 10;
            digSum += lastDig;
            
             digProd *= lastDig;  // use digit zero as valid as well
            
            x /= 10;
        }

        long total = digSum + digProd;
        if (total == 0) return false;  // avoid divide by zero

        return n % total == 0;
    }
}
