class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        int n = words.length;
        if (k > n) {
            return new ArrayList<>();
        }
        HashMap<String, Integer> map = new HashMap<>();
        List<String> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String curr = words[i];
            map.put(curr, map.getOrDefault(curr, 0) + 1);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.addAll(map.values());

         for(int i=0;i<k;i++){
            int reqFreq = pq.remove();// current highestfreq 
            // now we need to get all the elements that are having above numb of freq
            List<String> temp= new ArrayList<>();
            for(Map.Entry<String,Integer> entry : map.entrySet()){
                int currFreq=entry.getValue();
                if(currFreq==reqFreq){
                    temp.add(entry.getKey());
                }
            }
            Collections.sort(temp); // to maintain the leogrpahical order between the elements with same FREQ ONLY
            // now add all those into res if they're <=k
            for(String word: temp){  // add the current set of words inot the result
                if(res.size()<k){
                    res.add(word);
                    map.put(word,0); // set the current words freq 0 to avoid repeateadity as hashmap does not allows us order
                }else{
                    break;
                }
            }

         }

        
        return res;

    }
}