class Solution {
    public long sumAndMultiply(int n) {
        long sum=0;
        long num=0;
        while(n>0){
            long dig=n%10;
            if(dig==0){
                n=n/10; 
                continue;}
            sum+=dig;
            num=(num*10)+dig;
            n=n/10;
        }
    long number=0;
    while(num>0){
        long lastDig=num%10;
        number=(number*10)+lastDig;
        num=num/10;
    }
    return number*sum;
        
    }
}