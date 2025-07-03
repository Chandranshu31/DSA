class Solution {
    public char kthCharacter(int k) {
    StringBuilder sb = new StringBuilder("a");// because it starts from a
    while(sb.length()<k){
        int length=sb.length();
        for(int i=0;i<length;i++){
            char nextChar=(char)((sb.charAt(i)-'a'+1)%26+'a');  // get the next char for each character 
            sb.append(nextChar);
        }
    }
    return sb.charAt(k-1);

    }
}