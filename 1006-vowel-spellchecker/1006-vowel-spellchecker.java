import java.util.*;

class Solution {
    public String[] spellchecker(String[] wordlist, String[] queries) {
        Set<String> exactWords = new HashSet<>();
        Map<String, String> caseInsensitive = new HashMap<>();
        Map<String, String> vowelError = new HashMap<>();
        
        for (String word : wordlist) {
            exactWords.add(word);
            
            String lower = word.toLowerCase();
            caseInsensitive.putIfAbsent(lower, word);
            
            String devoweled = devowel(lower);
            vowelError.putIfAbsent(devoweled, word);
        }
        
        String[] result = new String[queries.length];
        for (int i = 0; i < queries.length; i++) {
            String query = queries[i];
            
            if (exactWords.contains(query)) {
                result[i] = query;
            } else {
                String lower = query.toLowerCase();
                if (caseInsensitive.containsKey(lower)) {
                    result[i] = caseInsensitive.get(lower);
                } else {
                    String devoweled = devowel(lower);
                    result[i] = vowelError.getOrDefault(devoweled, "");
                }
            }
        }
        
        return result;
    }
    
    private String devowel(String word) {
        return word.replaceAll("[aeiou]", "*");
    }
}
