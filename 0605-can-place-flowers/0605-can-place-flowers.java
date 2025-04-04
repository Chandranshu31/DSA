class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int m=flowerbed.length;
        int count=0;
       if (m == 1) {
         if (flowerbed[0] == 0){ // if there is only one elemnt and its 0 then return true in case n is less than or equal to 1
             return n <= 1; 
         }
    else{  // when the sigle element is 1 then true only if n==0, i.e we dont hve to plot  any flower
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
        return count>=n;  // in many cases it is also posible that we can place flowers on more positions than we are asked
        // in that case also we will be able to place n flowers so return ture there also 
    }
}