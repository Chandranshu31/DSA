class Solution {
    public boolean isCircularSentence(String sentence) {
        int n=sentence.length();
        //boolean isCs=true;
        for(int i=0;i<n;i++){
            if(i==n-1){
                if(sentence.charAt(i)!=sentence.charAt((i+1)%n)){  // check the last char with the first
                    return false;
                }
            } 
            else{  // in rest cases keep checking them
            if(sentence.charAt(i)==' '){
                 if(sentence.charAt(i-1)!=sentence.charAt(i+1)){
                    return false;
                 }
            }
        }
        }
        return true;
        
    }
}