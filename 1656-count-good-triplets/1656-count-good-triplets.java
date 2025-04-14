class Solution {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int n=arr.length;
        int count=0;
        if(n<3){
            return 0;
        }
       for(int i=0;i<=n-3;i++){
               for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                if(Math.abs(arr[i]-arr[j])<=a && Math.abs(arr[j]-arr[k])<=b && Math.abs(arr[k]-arr[i])<=c){
            count++;
                }
               }
       }
       }
    
        return count;
    }
    }
