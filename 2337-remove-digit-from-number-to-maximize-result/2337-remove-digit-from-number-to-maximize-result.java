class Solution {
    public String removeDigit(String number, char digit) {
      String res="";
      for(int i=0;i<number.length();i++){
        if(number.charAt(i)==digit){
            String temp=number.substring(0,i)+number.substring(i+1,number.length());
            if(res.equals("") || temp.compareTo(res)>0){ // if temp>res it returns value mmore than zero
                res=temp;
            }
        }
      }
      return res;
    }
}