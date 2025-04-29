class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        if(n==0){
            return 0;
        }
        int left=0;
        int right=0;
        int maxLength=Integer.MIN_VALUE;
        HashSet<Character> set = new HashSet<>();
        while(right<n){
            if(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }else{
                set.add(s.charAt(right));
                maxLength=Math.max(maxLength,right-left+1);
                right++;
            }
        }
        return maxLength;
        
    }
}