class Solution {
    public String[] findWords(String[] words) {
        String[] rows = {
            "qwertyuiopQWERTYUIOP", 
            "asdfghjklASDFGHJKL", 
            "zxcvbnmZXCVBNM"
        };

        List<String> res = new ArrayList<>();

        for (String word : words) {
            for (String row : rows) {
                if (canTypeFromRow(word, row)) {
                    res.add(word);
                    break;
                }
            }
        }

        String[] ans= new String[res.size()];
        for(int i=0;i<ans.length;i++){
            ans[i]=res.get(i);
        }

        return ans;
    }

    private boolean canTypeFromRow(String word, String row) {
        for (char ch : word.toCharArray()) { // convert the word into character array
            if (row.indexOf(ch) == -1) {  // if the index of that curr char is there in ROW then it will return valid valid val, and if -1 that means dne so immediately retrn false
                return false;
            }
        }
        return true;
    }
}
