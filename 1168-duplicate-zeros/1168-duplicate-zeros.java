class Solution {
    public void duplicateZeros(int[] arr) {
        ArrayList<Integer> temp=new ArrayList<>();
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(temp.size()<n && arr[i]!=0){
                temp.add(arr[i]);
            }
            if(arr[i]==0 && temp.size()<n){
                temp.add(0);
                temp.add(arr[i]);
            }
        }

        for(int i=0;i<n;i++){
            arr[i]=temp.get(i);
        }


        
    }
}