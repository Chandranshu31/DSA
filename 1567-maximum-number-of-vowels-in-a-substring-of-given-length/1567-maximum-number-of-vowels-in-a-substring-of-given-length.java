class Solution {
    public int maxVowels(String s, int k) {
        if(s.length()==0 || s.length()<k) return 0;
        if(s.length()==1) return 1;
        int count=0;
        int maxCount=Integer.MIN_VALUE;
        for(int i=0;i<k;i++){
            if(isVowel(s.charAt(i))){
                count++;
            }
            if(count>1) maxCount=Math.max(count,maxCount);
        }
        for(int i=k;i<s.length();i++){
            if(isVowel(s.charAt(i-k))){
                count--;
            }
            if(isVowel(s.charAt(i))){
                count++;
            }
            maxCount=Math.max(count,maxCount);
        }
        return maxCount;

        
    }
    public boolean isVowel(char c){
        return c=='a'||c=='e' || c=='i' || c=='o' || c=='u';
    }
}