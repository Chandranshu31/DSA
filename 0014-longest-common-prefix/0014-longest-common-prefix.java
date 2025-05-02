class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0){
            return "";
        }

        for(int i=0;i<strs[0].length();i++){
            char curr=strs[0].charAt(i);
            for(int j=1;j<strs.length;j++){
                if(i>=strs[j].length()|| strs[j].charAt(i)!=curr){
                    return strs[0].substring(0,i);
                }
            }
        }
        return strs[0];
           
    }
}

// kind of vertical scanning , take the first word as reference and get the first character then iterate over
// the array from next word and if it keeps matching and in range then do nothing keep moving ahead via loop
// the moment a mismatch comes return the substring.
// if both loop ends that means all the characters got matched and all were of same length so return the first word only