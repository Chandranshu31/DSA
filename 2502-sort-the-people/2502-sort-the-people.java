class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int n=names.length;
        TreeMap<Integer,String> map = new TreeMap<>(Collections.reverseOrder());// to store the keys, i.e heights in  descending order
        for(int i=0;i<n;i++){
            map.put(heights[i],names[i]);
        }

        String res[]=new String[n];
        int i=0;
        for(String val: map.values()){ // iterate over the values of map, i.e names sorted in descending order of their heights
            res[i++]=val;
        }
        return res;
        
    }
}