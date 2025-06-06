class Solution {
    public String removeDuplicates(String s) {
     int n=s.length();
     StringBuilder sb = new StringBuilder();
     for(int i=0;i<n;i++){
        if(sb.length()>0){
            if(sb.charAt(sb.length()-1)==s.charAt(i)){
                sb.deleteCharAt(sb.length()-1);
            }else{
                sb.append(s.charAt(i));
            }
        }else{
            sb.append(s.charAt(i));
        }
     }
     return sb.toString();
        
   
    }
}