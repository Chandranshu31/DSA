class Solution {
    public int getLucky(String s, int k) {
        int sum=0;
        int n=s.length();

        for(int i=0;i<n;i++){
            char ch= s.charAt(i);
            int val = ch-'a'+1 ;
            // now break this val into digits and add to sum

            while(val>0){
                int ld= val%10;
                sum+=ld;
                val=val/10;
            }
        } 
        k--; // cause we already trnasforemed for 1 time without any concatenation

        while(k!=0){ // do it for k times
                String temp=Integer.toString(sum);
                int newSum=0;
                for(int i=0;i<temp.length();i++){
                    char ch= temp.charAt(i);
                    newSum+=ch-'0';
                }
                sum=newSum;
                k--;
            }


             return sum;
        }
        
    }
