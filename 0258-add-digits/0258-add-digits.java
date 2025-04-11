class Solution {
    public int addDigits(int num) {
     
        while(num%10!=num){  // until were getting a two digit numb keep continuing 
            int res=0;
            while(num>0){
            int lastDigit=num%10;
            res+=lastDigit;
            num=num/10;
            }

            num=res; // update the num

        }
        return num;
    }
}