class Solution {
    public boolean isUgly(int n) {
        if(n<=0){
            return false;
        }
        if(n==1){
            return true;
        }

        while(n%2==0){
            n=n/2;
        }
        while(n%3==0){
            n=n/3;
        }
        while(n%5==0){
            n=n/5;
        }

        return n==1;
        
    }
}

/**
 class Solution {
    public boolean isUgly(int n) {
        if(n<=0){
            return false;
        }
        if(n==1){
            return true;
        }
        for(int i=2;i<=n;i++){
            if(n%i==0 && isPrime(i) && i!=2 && i!=5 && i!=3){
                return false;
            }
        }
        return true;
        
    }
    public boolean isPrime(int n){
        if(n<=1 ){
            return false;
        }

        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
 another approach but TLE IN HUGE CASES */