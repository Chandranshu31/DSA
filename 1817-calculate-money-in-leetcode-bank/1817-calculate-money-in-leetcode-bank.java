class Solution {
    public int totalMoney(int n) {
        int og=1;
        int counter=1;
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=counter;
            counter++;
            if(i%7==0){
                counter=og+1;
                og+=1;
            }
        }
        return sum;
        
    }
}