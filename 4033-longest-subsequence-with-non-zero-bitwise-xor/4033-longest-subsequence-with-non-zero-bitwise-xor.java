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
/*


- If all elements are 0 → every subsequence XOR = 0 → return 0.
- If totalXor != 0 → the whole array already has non-zero XOR → answer = n.
- If totalXor == 0 but not all zeros elements → remove one non-zero element, totalXor=totalXor^removedEl,0^removed...removedEl
  new XOR = that element ≠ 0 → answer = n - 1.
*/
