class Solution {
    public String finalString(String s) {
        int n=s.length();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch!='i'){
                sb.append(ch);
            }else{
                sb.reverse();
            }
        }
        return sb.toString();
        
        
    }
}