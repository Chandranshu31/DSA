class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int n=arr1.length;
        List<Integer> list= new ArrayList<>();
       // LinkedHashSet<Integer> set = new LinkedHashSet<>(); // to get the relative order
       TreeMap<Integer,Integer> map = new TreeMap<>();
       for(int i=0;i<n;i++){
        map.put(arr1[i],map.getOrDefault(arr1[i],0)+1);
       }

       for(int i=0;i<arr2.length;i++){
        int curr=arr2[i];
        for(int key: map.keySet()){
            if(curr==key){
                int freq=map.get(key);
                for(int j=0;j<freq;j++){
                    list.add(key);
                }
            }
        }
        map.remove(curr);
       }

    if(list.size()!=arr1.length){
          for(int key: map.keySet()){
                int freq=map.get(key);
                for(int j=0;j<freq;j++){
                    list.add(key);
                }
       }


    }
    int res[]=new int[n];
    for(int i=0;i<n;i++){
        res[i]=list.get(i);
    }

    return res;
}
}