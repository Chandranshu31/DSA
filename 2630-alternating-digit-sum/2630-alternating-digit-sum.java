class Solution {
    public int alternateDigitSum(int n) {
        int count=0;
        int temp=n;
        while(temp>0){
            int lastDigit=temp%10;
            count++;
            temp=temp/10;
        }

        // now if count is even then LSD always negative otherwise its positive 

        int i=1;
        int sum=0;
        if(count%2!=0){
            // LSD +VE
            while(n>0){
                int lastDigit=n%10;
                if(i%2!=0){
                    sum+=lastDigit;
                }else{
                    sum-=lastDigit;
                }
                n=n/10;
                i++;
            }

        }else{
            while(n>0){
                int lastDigit=n%10;
                if(i%2!=0){
                    sum-=lastDigit;
                }
                else{
                    sum+=lastDigit;
                }
                n=n/10;
                i++;
            }
        }

        return sum;
        
    }
}