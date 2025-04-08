class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String words[]= s.trim().split("\\s+");

        for(int i=words.length-1;i>=0;i--){  // start storing from the end so sb will have the asn in reverse order only
            sb.append(words[i]);
            if(i!=0){
                sb.append(" "); // add whitespace but not before the first word
            }
        }
        return sb.toString();

// with the help of trim we removed the leading and trailin spaces and with the help of split("\\s+") we converted our
// string into an array and all the whitespaces,tab were ignored 
// therefore we get words[]=["the","sky","is","blue"] and ["hello","world"];
        
    }
}


