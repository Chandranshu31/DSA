class Solution {
    public int divisorSubstrings(int num, int k) {
        int count=0;
        String s= String.valueOf(num);
        int n=s.length();
        for(int i=0;i<=n-k;i++){
            String sub=s.substring(i,i+k);
            int temp=Integer.parseInt(sub);

            if(temp!=0 && num%temp==0){
                count++;
            }
        }
        return count;
    }
}