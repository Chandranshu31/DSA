class Solution {
    public int secondHighest(String s) {
        int largest=Integer.MIN_VALUE;
        int sLargest=Integer.MIN_VALUE;
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                int num=s.charAt(i)-'0';
                if(num>largest){
                    sLargest=largest;
                    largest=num;
                }else if(num>sLargest && num<largest){
                    sLargest=num;
                }
            }
        }
        if(sLargest==Integer.MIN_VALUE){
            return -1;
        }else{
            return sLargest;
        }
    }
}