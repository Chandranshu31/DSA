class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int mainCount=0;
        for(int i=low;i<=high;i++){
            int curr=i;
            // now if curr has odd number of digits then is definetly not symmetric
            int count=0;
            int temp=curr;
            while(temp>0){
                int lastDigit=temp%10;
                count++;
                temp=temp/10;
            }
            if(count%2!=0){
                continue;
            }
            else{
                // now we need to chek if the sum of first n digits == sum of last n digits of the number
                // we have count number of digits in the number 
                int backSum=0;
                int originalCount=count;
                while(count!=originalCount/2){
                    int lastDigit=curr%10;
                    backSum+=lastDigit;
                    curr=curr/10;
                    count--;
                }

                int frontSum=0;
                while(count!=0){
                    int lastDigit=curr%10;
                    frontSum+=lastDigit;
                    curr=curr/10;
                    count--;
                }

                if(backSum==frontSum){
                    mainCount++;
                }

            }

        }
        return mainCount;
        
    }
}