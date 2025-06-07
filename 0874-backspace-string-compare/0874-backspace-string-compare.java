class Solution {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder sb= new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='#' && sb.length()==0){ // to handle the cases where get a # and no letter remianed previously
                continue;
            }
            if(sb.length()>0 && s.charAt(i)=='#'){
                sb.deleteCharAt(sb.length()-1);
            }else{
                sb.append(s.charAt(i));
            }
        }

        StringBuilder sbb= new StringBuilder();
        for(int i=0;i<t.length();i++){
             if(t.charAt(i)=='#' && sbb.length()==0){
                continue;
            }
            if(sbb.length()>0 && t.charAt(i)=='#'){
                sbb.deleteCharAt(sbb.length()-1);
            }else{
                sbb.append(t.charAt(i));
            }
        }

        if(sb.length()!=sbb.length()){ // early exit in few cases 
            return false;
        }

        for(int i=0;i<sb.length();i++){  // the length of both the stringbuilders is same, so iterate over it and if there is a mismatch then return false 
            if(sb.charAt(i)!=sbb.charAt(i)){
                return false;
            }
        }
        return true;
    }
}