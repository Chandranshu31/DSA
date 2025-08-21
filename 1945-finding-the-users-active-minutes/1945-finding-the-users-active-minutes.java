class Solution {
    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        int n=logs.length;
        HashMap<Integer,HashSet<Integer>> map = new HashMap<>();

        for(int i=0;i<n;i++){
           int id= logs[i][0];
           int time=logs[i][1];
           map.putIfAbsent(id, new HashSet<>()); // if key not present create a new hashset corresponding to it
           map.get(id).add(time); // for the key get that hashset and add the time... so now the unique minues r there
        }

        // now we need to iterate over map and count the elements prsent in the set and find UAM and increment UAM-1 for the sake of 1 based indexing
        int res[]= new int[k];
        for(Map.Entry<Integer,HashSet<Integer>> entry: map.entrySet()){
            int key=entry.getKey(); // the unique time 
            int UAM= entry.getValue().size(); 
            res[UAM-1]++;
        }
        return res;
    }
}