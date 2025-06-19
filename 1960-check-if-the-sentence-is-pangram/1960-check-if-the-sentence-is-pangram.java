class Solution {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length()<26){
            return false;
        }
        HashSet<Character> set = new HashSet<>();
        for(char ch: sentence.toCharArray()){
            set.add(ch);
        }

        return set.size()==26;
        
    }
}