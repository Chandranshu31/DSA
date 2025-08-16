class Solution {
    public int maximum69Number (int num) {
        String temp=String.valueOf(num);
        char digits[]= temp.toCharArray();

        for(int i=0;i<digits.length;i++){
            if(digits[i]=='6'){
                digits[i]='9';
                break;
            }
        }
        String str= String.valueOf(digits);
        return Integer.parseInt(str);
    }
}