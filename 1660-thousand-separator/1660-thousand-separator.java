class Solution {
    public String thousandSeparator(int n) {
        if(n<=999) return String.valueOf(n);
        String val=String.valueOf(n);

        StringBuilder res = new StringBuilder();
        int j=0;
        for(int i=val.length()-1;i>=0;i--){
            res.append(val.charAt(i));
            j++;
            if(j%3==0 && i!=0){
                res.append('.');
            }
        }
        return res.reverse().toString();
        
    }
}