class Solution {
    public int smallestEvenMultiple(int n) {
        for(int i=2;i<Integer.MAX_VALUE;i++){
            if(i%2==0 && i%n==0){  // from 2 to infinite return the very first number which is divisble by 2 and n
                return i;
            }
        }
        return 1; // must nvr reaach here
        
    }
}