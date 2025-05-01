class Solution {
    public int countCharacters(String[] words, String chars) {
        int n=words.length;
         int ans=0;

        for(int i=0;i<n;i++){
            HashMap<Character,Integer> map = new HashMap<>(); // for every string in word build the map and then further match the frequencies
            for(char ch:chars.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
           }
            String curr=words[i];
            boolean isGood=true;
            for(int j=0;j<curr.length();j++){
                if(!map.containsKey(curr.charAt(j)) || map.get(curr.charAt(j))<=0){   
                    isGood=false;
                    break; // if the curr character DNE in map just break the loop for that string no need to check further
                    }
                else{
                    map.put(curr.charAt(j),map.get(curr.charAt(j))-1); // if word found update frequency in map by  reducing it by 1
                }
            }
            if(isGood){  // if the word is good then add its length into the ans
               ans+=curr.length();
            }
        }
        return ans;
        
    }
}

/** A FASTER METHOD IS THIS ONE 
class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] charFreq = new int[26];
        for (char ch : chars.toCharArray()) {
            charFreq[ch - 'a']++;
        }

        int ans = 0;

        for (String word : words) {
            int[] freqCopy = charFreq.clone(); // fresh copy for each word
            boolean isGood = true;

            for (char ch : word.toCharArray()) {
                if (freqCopy[ch - 'a'] == 0) {
                    isGood = false;
                    break;
                }
                freqCopy[ch - 'a']--;
            }

            if (isGood) {
                ans += word.length();
            }
        }

        return ans;
    }
}
 */