class Solution {
    public int findLucky(int[] arr) {
        int freq[]=new int[501];
        for(int i=0;i<arr.length;i++){
            int curr=arr[i];
            freq[curr]++;
        }
        int lucky=-1;
        for(int i=1;i<freq.length;i++){
            if(freq[i]==i){
                lucky=i;
            }
        } 
        return lucky;       
    }
}