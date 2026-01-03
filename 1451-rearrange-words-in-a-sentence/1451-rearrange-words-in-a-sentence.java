class Solution {
    public String arrangeWords(String text) {
        text=text.toLowerCase();
        String arr[]=text.trim().split("\\s+");
        Arrays.sort(arr,(a,b)->a.length()-b.length());
        StringBuilder sb = new StringBuilder();
        for(String word:arr){
            sb.append(word).append(" ");
        }
        sb.setCharAt(0,Character.toUpperCase(sb.charAt(0)));
        return sb.toString().trim();
        
    }
}