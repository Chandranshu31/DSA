class Solution {
    public boolean detectCapitalUse(String word) {
        boolean isCapital=true;
        if(word.length()==0){
            return false;
        }

        char ch=word.charAt(0);
        if(Character.isUpperCase(ch)){
            // if first char is capital then a valid string only when either all the charc r cap or all the chars r small
            boolean allCap=true;
            boolean allSmall=true;
            for(int i=1;i<word.length();i++){
                char b=word.charAt(i);
                if(!Character.isUpperCase(b)){
                    allCap=false;
                    break;
                }
            }
               for(int j=1;j<word.length();j++){
                char d=word.charAt(j);
                if(!Character.isLowerCase(d)){
                    allSmall=false;
                    break;
                }
            }

            if(!allCap){
                if(!allSmall){
                    isCapital=false;
                }
            }
           
    
        }
        else{
            for(int i=1;i<word.length();i++){
                char c=word.charAt(i);
                if(Character.isUpperCase(c)){
                    isCapital=false;
                    break;
                }
            }
        }

        return isCapital;
        
    }
}