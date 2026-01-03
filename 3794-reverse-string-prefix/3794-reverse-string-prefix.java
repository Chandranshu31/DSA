class Solution {
    public String reversePrefix(String s, int k) {
        StringBuilder sb = new StringBuilder();
        if(k==s.length()){
            sb.append(s);
            sb.reverse();
            return sb.toString();
        }
        for(int i=k-1;i>=0;i--){
            sb.append(s.charAt(i));
        }
        for(int j=k;j<s.length();j++){
            sb.append(s.charAt(j));
        }
        return sb.toString();
        
    }
}