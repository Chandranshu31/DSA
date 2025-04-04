class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int m=flowerbed.length;
        int count=0;
       if (m == 1) {
         if (flowerbed[0] == 0){
             return n <= 1;
         }
    else{
         return n == 0;
    }
}


        for(int i=0;i<m;i++){
            if(i==0){
                if(flowerbed[i]==0 && flowerbed[i+1]!=1){
                    count++;
                    flowerbed[i]=1;
                }
            }
            else if(i==m-1){
                if(flowerbed[i]==0 && flowerbed[i-1]!=1){
                    count++;
                    flowerbed[i]=1;
                }
            }
           else{
            if(flowerbed[i]==0 && flowerbed[i-1]!=1 && flowerbed[i+1]!=1){
                flowerbed[i]=1;
                count++;
            }
           }
        }
        return count>=n;
    }
}