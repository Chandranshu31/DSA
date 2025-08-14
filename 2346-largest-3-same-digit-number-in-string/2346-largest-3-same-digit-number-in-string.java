class Solution {
    public String largestGoodInteger(String num) {
        StringBuilder sb = new StringBuilder();
        int largest=-1;
        for(int i=0;i<=num.length()-3;i++){
            if(num.charAt(i)-'0'==num.charAt(i+1)-'0' && num.charAt(i)-'0'==num.charAt(i+2)-'0'){
                largest=Math.max(largest,num.charAt(i)-'0');
            
            }
        }
        if(largest==-1){
            return "";
        }

        for(int i=0;i<3;i++){
          sb.append((char) (largest + '0'));
        }

        return sb.toString();
        
    }
}