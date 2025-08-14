class Solution {
    public String largestGoodInteger(String num) {
        StringBuilder sb = new StringBuilder();
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<=num.length()-3;i++){
            if(num.charAt(i)-'0'==num.charAt(i+1)-'0' && num.charAt(i)-'0'==num.charAt(i+2)-'0'){ // we can also do it by directly chekcng thorugh string without converting them to integer.
                largest=Math.max(largest,num.charAt(i)-'0');
                i+=2; // if triplet found then simply move two steps ahead as no neeed to consider the next two indices as they are same as prev one.
            }
        }
        if(largest==-Integer.MIN_VALUE){
            return "";
        }

        for(int i=0;i<3;i++){
          sb.append(largest);
        }

        return sb.toString();
        
    }
}