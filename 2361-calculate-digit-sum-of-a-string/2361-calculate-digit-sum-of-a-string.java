class Solution {
    public String digitSum(String s, int k) {
        StringBuilder sb = new StringBuilder(s);
        while(sb.length()>k){
            StringBuilder temp = new StringBuilder();
            int i=0;
            while(i<sb.length()){
            int sum=0;
            int count=0;
            while(count<k && i<sb.length()){
                sum+=sb.charAt(i)-'0';
                i++;
                count++;
            }
            temp.append(sum);
            
            }
            sb=temp;
         

        }
        return sb.toString();
        
    }
}