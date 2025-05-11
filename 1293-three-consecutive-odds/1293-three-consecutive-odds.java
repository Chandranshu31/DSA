class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
          int n=arr.length;
          boolean  con=false;
          for(int i=0;i<=n-3;i++){
            if(arr[i]%2!=0){
                if(arr[i+1]%2!=0 && arr[i+2]%2!=0){
                    con=true;
                }
            }
          }
          return con;
        
    }
}