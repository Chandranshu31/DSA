class Solution {
    public boolean digitCount(String num) {
       int n= num.length();
       boolean isValid=true;
       for(int i=0;i<n;i++){
           int val=Character.getNumericValue(num.charAt(i));
           int idx=i;
           // now idx must appear val times in string
           int count=0;
           for(int j=0;j<n;j++){
            if(Character.getNumericValue(num.charAt(j))==idx){
                count++;
            }
           }
           if(count!=val){
            isValid=false;
           }
       } 
       return isValid;
        
    }
}