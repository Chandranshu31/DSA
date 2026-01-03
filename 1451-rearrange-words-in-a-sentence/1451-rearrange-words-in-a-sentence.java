class Solution {
    public String arrangeWords(String text) {
        text=text.toLowerCase(); // convert full string into lowercase
        String arr[]= text.trim().split("\\s+");
        Arrays.sort(arr,(a,b)-> a.length()-b.length());// sort in asc order on the basis of length, its a stable sort so if a.length()==b.length(), the relative order is maintained
        StringBuilder sb = new StringBuilder();
        for(String word: arr){
            sb.append(word).append(" "); // space after every word
        }

        sb.setCharAt(0,Character.toUpperCase(sb.charAt(0)));
        return sb.toString().trim(); // to remove last added extra space after the last word        
    }
}