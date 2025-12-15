class Solution {
    public String capitalizeTitle(String title) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<title.length();i++){
            
            if (title.charAt(i) == ' ') {
                sb.append(' ');
                continue;
            }

            int j=i;
            int len=0;
            StringBuilder temp = new StringBuilder();
            while(j<title.length() && title.charAt(j)!=' '){
                len++;
                temp.append(Character.toLowerCase(title.charAt(j)));
                j++;
            }
            if(len==1||len==2){
                sb.append(temp.toString());
            }else{
                char firstChar=temp.charAt(0);
                temp.setCharAt(0,Character.toUpperCase(firstChar));
                sb.append(temp.toString());
            }
            i=j-1;
        }
        return sb.toString();
        
    }
}