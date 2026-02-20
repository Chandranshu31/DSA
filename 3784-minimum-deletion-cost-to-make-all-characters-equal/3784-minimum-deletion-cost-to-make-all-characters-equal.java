class Solution {
    public long minCost(String s, int[] cost) {
        long total=0;
        for(int c:cost){
            total+=c;
        }
        HashMap<Character,Long> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
        map.put(s.charAt(i),map.getOrDefault(s.charAt(i), 0L)+cost[i]);
        }
        long maxKeep=0;
            for (long val : map.values()) {
            maxKeep = Math.max(maxKeep, val);
        }

        return total - maxKeep;
    }
    }
