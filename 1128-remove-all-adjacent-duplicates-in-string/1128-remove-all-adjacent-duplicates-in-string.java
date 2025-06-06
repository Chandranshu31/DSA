class Solution {
    public String removeDuplicates(String s) {
        int n=s.length();
        
    while (isRepeating(s)) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < n; i++) {
        if (sb.length() > 0 && sb.charAt(sb.length() - 1) == s.charAt(i)) {
            sb.deleteCharAt(sb.length() - 1); // remove previous char (duplicate)
        } else {
            sb.append(s.charAt(i)); // add current char
        }
    }
    s = sb.toString(); // <--- This updates s for next iteration
}

        return s;
        
    }
    public boolean isRepeating(String s){
        int n=s.length();
        for(int i=1;i<n;i++){
            if(s.charAt(i)==s.charAt(i-1)){
                return true;
            }
        }
        return false;
    }
}