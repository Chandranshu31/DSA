class Solution {
    public int generateKey(int num1, int num2, int num3) {
      String s1 = String.format("%04d",num1);  // convert num1 into string with  a format that has to be atleast 4 length and filled with leading zeros
      String s2 = String.format("%04d",num2);
      String s3= String.format("%04d",num3);

      StringBuilder sb = new StringBuilder();
      for(int i=0;i<4;i++){
        char min=(char)Math.min(s1.charAt(i),Math.min(s2.charAt(i),s3.charAt(i)));
        sb.append(min);
      }

      return Integer.parseInt(sb.toString());
      
        
        
    }
}