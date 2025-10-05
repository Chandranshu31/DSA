class Solution {
    public int longestSubsequence(int[] nums) {
        int arr[]=nums;
        int totalXor=0;
        boolean allZero=true;
        for(int x:arr){
            totalXor^=x;
            if(x!=0) allZero=false;
        }
        if(allZero) return 0;
        int n=arr.length;
        if(totalXor!=0){
            return n;
        }else{
           return n==1?0:n-1;
        }
    }
}