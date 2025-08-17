class Solution {
    public String addBinary(String a, String b) {
        int i=a.length()-1;
        int j= b.length()-1;
        StringBuilder sb = new StringBuilder();
        int carry=0;
        while(i>=0 || j>=0|| carry!=0){
            int sum=carry;
            if(i>=0){
                sum+=a.charAt(i)-'0';
                i--;
            }
            if(j>=0){
                sum+=b.charAt(j)-'0';
                j--;
            }
            sb.append(sum%2);  // if sum==0 then 0+0 means just add 0%2, if 1 then (0+1 or vice versa) then add 1%2 that is 1.. in case of 1+1 add 2%2 that is 0 and in this case only ca
            // carry would be 1.
            carry=sum/2;  // 0/2=0, 1/2=0, 2/2=1 only in 1+1 case carry would become 1
        }
        sb.reverse();
        return sb.toString();
        
    }
}