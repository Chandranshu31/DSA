class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int bulb:bulbs){
            map.put(bulb,map.getOrDefault(bulb,0)+1);
        }
        List<Integer> list= new ArrayList<>();
        for(int key:map.keySet()){
            if(map.get(key)%2!=0){
                list.add(key);
            }
        }
        Collections.sort(list);
        return list;
        
    }
}