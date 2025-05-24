class Solution {
    public int maxVowels(String s, int k) {
        int maxNumb=0;
        int n=s.length();
        for(int i=0;i<k;i++){
            if(isVowel(s.charAt(i))){
                maxNumb++;
            }
        }
        int count=maxNumb;
        for(int i=k;i<n;i++){
            if(isVowel(s.charAt(i-k))){
                count--;
            }
            if(isVowel(s.charAt(i))){
                count++;
            }
            maxNumb=Math.max(count,maxNumb);

        }

        return maxNumb;

        
    }

    public boolean isVowel(char ch){
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            return true;
        }
        return false;
    }
}