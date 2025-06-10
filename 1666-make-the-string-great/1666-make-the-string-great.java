class Solution {
    public String makeGood(String s) {
        StringBuilder sb = new StringBuilder(s);
        int i = 0;

        while (i < sb.length() - 1) { 
            char curr = sb.charAt(i);
            char next = sb.charAt(i + 1);

            if (Math.abs(curr - next) == 32) {
                sb.delete(i, i + 2); 
                if (i > 0) {
                    i--; // check previous again
                } else {
                    i=0; // reset to start
                }
            }else{
                i++;
            } 
        }

        return sb.toString();
    }
}
