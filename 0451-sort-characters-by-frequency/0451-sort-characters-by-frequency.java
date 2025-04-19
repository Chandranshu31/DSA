class Solution {
    public String frequencySort(String s) {
        int n=s.length();
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        pq.addAll(map.values());
         StringBuilder result = new StringBuilder();
         while(!pq.isEmpty()){
            int freq=pq.remove(); // get the highest frequency
            // now find the character with this frequency in map which stores character and their frequencies
            for(Map.Entry<Character,Integer> entry: map.entrySet()){
                int currFreq= entry.getValue();
                if(currFreq==freq){ // get the character only if the xurr freq is equal to maxfreq
                    char ch=entry.getKey();
                    for(int i=0;i<freq;i++){
                        result.append(ch);  // append the character to result for freq times
                    }
                      map.put(ch,0);  // reduce the freq to zero
                      break;
                }
              
            }
         }

         return result.toString();



        
        
    }
}