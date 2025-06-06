class Solution {
    public String removeStars(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char curr=s.charAt(i);
            if(curr!='*'){
                sb.append(curr);
            }else{
                sb.deleteCharAt(sb.length()-1);
            }
        }    
        return sb.toString();
    }
}