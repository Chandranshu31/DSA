class Solution {
    public int[] getNoZeroIntegers(int n) {
      int res[]=new int[2];
      for(int i=1;i<n;i++){
        int a=i;
        int b=n-i;
        if(doesNotcontainsZero(a) && doesNotcontainsZero(b)){
            res[0]=a;
            res[1]=b;
            return res;
        }
      }
      return res; // unreachable statement


    }
    public boolean doesNotcontainsZero(int n){
        if(n==0) return false;
        while(n>0){
            int lastDigit=n%10;
            if(lastDigit==0) return false;
            n=n/10;
        }
        return true;
    }
}