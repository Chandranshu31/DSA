class Solution {
    public int countEven(int num) {
        int count=0;
        for(int i=1;i<=num;i++){
            int digitSum=0;
            int temp=i;
            while(temp>0){
                int lastD=temp%10;
                digitSum+=lastD;
                temp=temp/10;

            }
            if(digitSum%2==0){
                count++;
            }

        }
        return count;
        
    }
}