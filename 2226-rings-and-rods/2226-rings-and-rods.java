class Solution {
    public int countPoints(String rings) {
        int n=rings.length();
        int count=0;
        HashMap<Character,HashSet<Character>> map = new HashMap<>();
        for(int i=0;i<n;i+=2){
            char ring=rings.charAt(i);
            char rod=rings.charAt(i+1);
            map.putIfAbsent(rod, new HashSet<>());
            map.get(rod).add(ring);
        }

        for(Set<Character> ring: map.values()){
            if(ring.size()==3) count++;
        }
        return count;

    }
}