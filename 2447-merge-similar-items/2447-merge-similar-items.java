class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<items1.length;i++){
            map.put(items1[i][0],items1[i][1]);
        }

        List<List<Integer>> res = new ArrayList<>();
        for(int i=0;i<items2.length;i++){
            int currId=items2[i][0];
            List<Integer> aux = new ArrayList<>();
            if(map.containsKey(currId)){
                   aux.add(currId);
                   aux.add(items2[i][1]+map.get(currId));
                   map.put(currId,-1); // mark as used
            }else{
                aux.add(currId);
                aux.add(items2[i][1]);
            }
            res.add(aux);
        }

        for(int k:map.keySet()){   // if there are any elements or ids that are in n1 andnot in n2 then after above itration their values wont be -1 so just add them inot the list as well
            if(map.get(k)!=-1){
             List<Integer> aux= new ArrayList<>();
             aux.add(k);
             aux.add(map.get(k));
             res.add(aux);
            }
        }
            Collections.sort(res, new Comparator<List<Integer>>() {  // sort on the basis of index 0 or value
            public int compare(List<Integer> a, List<Integer> b) {
                return Integer.compare(a.get(0), b.get(0));
            }
        });

        return res;
    }
}