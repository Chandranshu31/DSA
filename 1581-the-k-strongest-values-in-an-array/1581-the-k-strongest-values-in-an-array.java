class Solution {
    public int[] getStrongest(int[] arr, int k) {
        Arrays.sort(arr);
        int centre=findCenter(arr);
        int res[]=new int[k];
        int i=0;
        int j=arr.length-1;
        int count=0;
        while(count<k){
            int leftStrength=Math.abs(arr[i]-centre);
            int rightStrength=Math.abs(arr[j]-centre);
            if(rightStrength>leftStrength || (leftStrength==rightStrength && arr[j]>arr[i])){
                res[count++]=arr[j--];
            }else{
                res[count++]=arr[i++];
            }
        }
        return res;

        
    }
    public int findCenter(int arr[]){
        int n=arr.length;
        int m=((n-1)/2);
        return arr[m];
    }
}