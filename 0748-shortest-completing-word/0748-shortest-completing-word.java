class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        HashMap<Character,Integer> licMap= new HashMap<>();
        for(int i=0;i<licensePlate.length();i++){
            char curr=Character.toLowerCase(licensePlate.charAt(i)); // to handle case insensitive
            if(Character.isLetter(curr)){
                licMap.put(curr,licMap.getOrDefault(curr,0)+1);
            }
        }

        String ans = null;
        for (String w : words) {
            HashMap<Character,Integer> wordMap = new HashMap<>();
            for (int i = 0; i < w.length(); i++) {
                char c = Character.toLowerCase(w.charAt(i));
                if (Character.isLetter(c)) {
                    wordMap.put(c, wordMap.getOrDefault(c, 0) + 1);
                }
            }

            if (hasAllCharactersForSameNumbOfTimes(licMap, wordMap)) {
                if (ans == null || w.length() < ans.length()) {
                    ans = w;
                }
            }
        }

        return ans;
    }

    public boolean hasAllCharactersForSameNumbOfTimes(HashMap<Character,Integer> licMap, HashMap<Character,Integer> wordMap){
        for (Character c : licMap.keySet()) {
            if (!wordMap.containsKey(c)) return false;
            if (wordMap.get(c) < licMap.get(c)) return false; // the word must contain that charcter atleast the numb of times it is in lic plate
        }
        return true;
    }
}
