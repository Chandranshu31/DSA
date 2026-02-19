class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        HashMap<Integer, Character> map = new HashMap<>();
        for (int i = 0; i < 26; i++) {
            map.put(i, (char)('z' - i));
        }

        StringBuilder sb = new StringBuilder();
        for(String word:words){
            int totalWeight=0;
            for(int i=0;i<word.length();i++){
                char curr=word.charAt(i);
                int weight=weights[curr-'a'];
                totalWeight+=weight;
            }
            int normalisedWeight=totalWeight%26;
            char toAdd=map.get(normalisedWeight);
            sb.append(toAdd);

        }
        return sb.toString();
    }
}