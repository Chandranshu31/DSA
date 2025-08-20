class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
       int freq1[] = new int[1001];
       int freq2[]= new int[1001];
       for(int x: target){
        freq1[x]++;
       }
       for(int y:arr){
        freq2[y]++;
       }

       for(int i=0;i<freq1.length;i++){
        if(freq1[i]!=freq2[i]) return false;
       }

       return true;

    }
}