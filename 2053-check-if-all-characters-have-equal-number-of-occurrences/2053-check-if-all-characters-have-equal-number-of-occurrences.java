class Solution {
    public boolean areOccurrencesEqual(String s) {
        int freq[]= new int[26];
        for(int i=0;i<s.length();i++){
            freq[(s.charAt(i)-'a')]++;
        }
        int initial=-1;
        int idx=-1;
        for(int i=0;i<freq.length;i++){
            if(freq[i]!=0){
                initial =freq[i];
                idx=i;
                break;
            }
        }
        for(int i=idx;i<freq.length;i++){
            if(freq[i]!=0 && freq[i]!=initial){
                return false;
            }
        }
        return true;
    }
}