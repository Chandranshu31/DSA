class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums1.length;i++){
            map.put(nums1[i][0],nums1[i][1]);
        }

        List<List<Integer>> temp = new ArrayList<>();
        for(int i=0;i<nums2.length;i++){
            int currId=nums2[i][0];
            List<Integer> aux = new ArrayList<>();
            if(map.containsKey(currId)){
                   aux.add(currId);
                   aux.add(nums2[i][1]+map.get(currId));
                   map.put(currId,-1);
            }else{
                aux.add(currId);
                aux.add(nums2[i][1]);
            }
            temp.add(aux);
        }

        for(int k:map.keySet()){
            if(map.get(k)!=-1){
             List<Integer> aux= new ArrayList<>();
             aux.add(k);
             aux.add(map.get(k));
             temp.add(aux);
            }
        }

        int p=temp.size();
        int res[][]=new int[p][2];

        for(int i=0;i<p;i++){
            res[i][0]=temp.get(i).get(0);
            res[i][1]=temp.get(i).get(1);
        }
        Arrays.sort(res, (a, b) -> Integer.compare(a[0], b[0]));

        return res; 
        
        
    }
}