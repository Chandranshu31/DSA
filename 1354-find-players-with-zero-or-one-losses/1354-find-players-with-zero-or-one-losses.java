class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        HashSet<Integer> players= new HashSet<>();
        HashMap<Integer,Integer> map = new HashMap<>(); // to store who has lost how many matches
        for(int match[]:matches){
            players.add(match[0]);
            players.add(match[1]);
            int winner=match[0];
            int looser=match[1];
            map.put(looser,map.getOrDefault(looser,0)+1);
        }
        List<Integer> exactlyOne = new ArrayList<>();
        for(int k:map.keySet()){
            if(map.get(k)==1){
                exactlyOne.add(k);
            }
        }
        List<Integer> noDefeats = new ArrayList<>();
        for(int player:players){
            if(!map.containsKey(player)) noDefeats.add(player);
        }
        Collections.sort(noDefeats);  // can use tree set n tree map to prserve sorted order but that woul slow down the code abit
        Collections.sort(exactlyOne);
        List<List<Integer>> res = new ArrayList<>();
        res.add(noDefeats);
        res.add(exactlyOne);
        return res;
        
    }
}