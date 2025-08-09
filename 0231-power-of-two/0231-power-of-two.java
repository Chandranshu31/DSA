public class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<=0){
            return false; // in no case a number less than or equal to zero is a pow of 2
        }

        /* if  anumber is a pow of two then it is always divisible by two and if we keep dividing
        that number with 2 and it reaches 1 then it is a pow of two otherwise it is just 
        divisible by 2 and not a pow of two.*/

        while(n%2==0){ 
            n=n/2;
        }

        if(n==1){ // if number reached to 1 after termination of while loop then it is a pow of two
            return true;
        }
        return false;
    }

    /* using bitwise
    if(n>0&&(n&(n-1)==0)){
        return true;
    } */
}