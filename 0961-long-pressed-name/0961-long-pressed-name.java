class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int i = 0;
        int j = 0;
        int n = name.length();
        int m = typed.length();

        boolean isName=true;

        while (i < n && j < m) {
            if (name.charAt(i) != typed.charAt(j)) {  // if charcters mismatched return false immediately or assign false to isName
                return false; 
            }
            char currChar=name.charAt(i);
            int count1=0;
            while(i<n && name.charAt(i)==currChar){
                count1++;
                i++;
            }

            int count2=0;
            while(j<m && typed.charAt(j)==currChar){
                count2++;
                j++;
            }

            if(count2<count1){
                return false;
            }

        }

        // Make sure both strings are fully processed
        return i==n && j==m;
    }
}
