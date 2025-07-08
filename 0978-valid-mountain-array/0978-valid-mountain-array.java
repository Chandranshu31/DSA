class Solution {
    public boolean validMountainArray(int[] arr) {
        int n=arr.length;
        if(arr.length<3){
            return false;
        }
        int i=0;
        while(i+1 <n && arr[i]<arr[i+1]){  // start from 0 keep moving i until increase found
         i++;
        }

        if(i==0 || i==n-1){
            return false; // peak cannot be the end or begining 
        }

        while(i+1<n  && arr[i]>arr[i+1]){
            i++;
        }

        return i==n-1;

        
    }
}