class Solution {
    public String discountPrices(String sentence, int discount) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<sentence.length();i++){
             if (sentence.charAt(i) != '$' || (i > 0 && sentence.charAt(i - 1) != ' ')) {
                // just copy char if not a valid starting '$'
                sb.append(sentence.charAt(i));
            }else{
                sb.append('$');
                int j=i+1;
                StringBuilder temp = new StringBuilder();
                while(j<sentence.length() && sentence.charAt(j)!=' '){
                    temp.append(sentence.charAt(j));
                    j++;
                }
                    String aux = temp.toString();
                
                // only apply discount if it's a valid number  
                /** $100, $5, $999999 → valid prices
                 $abc, $12a, $12.50, $ → not valid */
                if (aux.matches("\\d+")) {   //  tells that string has all digits it's all digits
                    long price = Long.parseLong(aux);
                    double discounted = price - (price * discount / 100.0);
                    
                    
                    sb.append(String.format("%.2f", discounted));  // to format upto 2 decimal places
                } else {
                    // not a valid number, keep as is
                    sb.append(aux);
                }
                
                i = j - 1; // move outer loop index to end of the price, to reduce repetetive itration 
            }
        }
        return sb.toString();
        
        
    }
}