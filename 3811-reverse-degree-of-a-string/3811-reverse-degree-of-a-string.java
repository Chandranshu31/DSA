class Solution {
    public int reverseDegree(String s) {
        int revDg=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int rev='z'-ch+1;
            int prod=rev*(i+1);
            revDg+=prod;
        }
        return revDg;
        
    }
}