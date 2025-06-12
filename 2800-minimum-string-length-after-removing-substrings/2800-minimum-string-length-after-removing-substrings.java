class Solution {
    public int minLength(String s) {
     StringBuilder sb = new StringBuilder(s);
     int i=0;
     while(i<sb.length()-1){
        char curr=sb.charAt(i);
        char next=sb.charAt(i+1);

        if((curr=='A' && next=='B') || (curr=='C' && next=='D')){
            sb.delete(i,i+2); // i+2 exclusive
            if(i>0){
                i--; // to check back the next possible formation
            }
        }else{
            i++; // means curent char will stay
        }
     }

     return sb.length();
    }
     
}
