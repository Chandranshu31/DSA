class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        TreeMap<Integer, Integer> map = new TreeMap<>();

        for (int[] pair : nums1) {
            map.put(pair[0], map.getOrDefault(pair[0], 0) + pair[1]);
        }

        for (int[] pair : nums2) {
            map.put(pair[0], map.getOrDefault(pair[0], 0) + pair[1]);
        }

        int[][] result = new int[map.size()][2];
        int i = 0;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            result[i][0] = entry.getKey();
            result[i][1] = entry.getValue();
            i++;
        }

        return result;
    }
}

/**
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

        for(int k:map.keySet()){   // if there are any elements or ids that are in n1 andnot in n2 then after above itration their values wont be -1 so just add them inot the list as well
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
        Arrays.sort(res, (a, b)->Integer.compare(a[0], b[0])); // sort on the basis of id.

        return res; 
        
        
    }
} */
