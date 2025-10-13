class Solution {
    public int compress(char[] chars) {
        int n=chars.length;
        int write=0;
        for(int i=0;i<n;){
            char curr=chars[i];
            int j=i;
            while(j<n && chars[j]==curr){
                j++;
            }
            int count=j-i;
            chars[write++]=curr;

            if(count>1){
                for(char c:String.valueOf(count).toCharArray()){
                    chars[write++]=c;
                }
            }
            i=j;
        }
        return write;
    }
}