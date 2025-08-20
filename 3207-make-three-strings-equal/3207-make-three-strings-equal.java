class Solution {
    public int findMinimumOperations(String s1, String s2, String s3) {
        int minLen=Math.min(s1.length(),Math.min(s2.length(),s3.length()));  // to iterate till min length string only
        int lcp=0; // get the the lenth of longest common prefix

        for(int i=0;i<minLen;i++){
            if(s1.charAt(i)==s2.charAt(i) && s2.charAt(i)==s3.charAt(i)){
                lcp++;  // update lcp length
            }else{
                break;  // mismatch then break
            }
        }
        if (lcp==0) return-1;  // if no common prefix , not possible to make equal
        int numOfOps=(s1.length()-lcp)+(s2.length()-lcp)+(s3.length()-lcp);// num of ops to remove from rightmost
        return numOfOps;
    }
}