class Solution {
    public int sumBase(int n, int k) {
        int reversedNewNumb=0;
        while(n>0){
            int lastDigit= n%k;
            reversedNewNumb = reversedNewNumb*10 +lastDigit;
            n=n/k;
        }  

        int sum=0;
        while(reversedNewNumb>0){
            int lastDigit=reversedNewNumb%10;
            sum+=lastDigit;
            reversedNewNumb=reversedNewNumb/10;
           
        }
  return sum;
             
    }
}

/**
to convert any numb to a base k simple keep getting remainder on diivding by k then update the var and remove  the lastdigit
and when u reverse it u get the new numb in base k but here we need to calculate sum only so no need to get the original order */