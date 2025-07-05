class Solution {
    public int findLucky(int[] arr) {
        int freq[]=new int[501];
        for(int i=0;i<arr.length;i++){
            int curr=arr[i];
            freq[curr]++;
        }
       // int lucky=-1;
        for(int i=500;i>=1;i--){ // to return largest, iterate form back
            if(freq[i]==i){
                return i;
            }
        } 
        return -1;       
    }
}