class Solution {
    public int countPrimeSetBits(int left, int right) {
        int count=0;
        for(int i=left;i<=right;i++){
            String binRep=toBinary(i);
            int countOfOnes=0;
            for(int j=0;j<binRep.length();j++){
                if(binRep.charAt(j)=='1')countOfOnes++;
            }
            if(isPrime(countOfOnes))count++;
        }
        return count;
        
    }
    public  String toBinary(int n) {
    if (n == 0) return "0";
    
    StringBuilder sb = new StringBuilder();
    
    while (n > 0) {
        sb.append(n % 2);   // remainder (0 or 1)
        n = n / 2;         // divide by 2
    }
    
    return sb.reverse().toString();
}
public boolean isPrime(int n){
    if(n==0||n==1) return false;
    for(int i=2;i<n;i++){
        if(n%i==0)return false;
    }
    return true;
}
}