class Solution {
    public long smallestNumber(long num) {
        String temp= String.valueOf(Math.abs(num));
        char digits[]=temp.toCharArray();
        boolean isNegative= num<0;

        if(isNegative){
            Arrays.sort(digits);
            int i=0;
            int j=digits.length-1;
            while(i<j){
                char t=digits[i];
                digits[i]=digits[j];
                digits[j]=t;
                i++;
                j--;
            }
        }
        else{
            Arrays.sort(digits);
            if(digits[0]=='0'){
                for(int k=1;k<digits.length;k++){
                    if(digits[k]!='0'){
                        char f=digits[0];
                        digits[0]=digits[k];
                        digits[k]=f;
                        break;
                    }
                }
            }
        } 

        long res=Long.parseLong(new String(digits));

        return isNegative ? -res:res;       
    }
}