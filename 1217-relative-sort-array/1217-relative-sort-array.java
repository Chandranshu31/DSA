class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int n=arr1.length;
        List<Integer> list= new ArrayList<>();
       
       TreeMap<Integer,Integer> map = new TreeMap<>(); // so that the values of arr1 get stored in ascending order as akey ad we dont need to sort the left overs
       for(int i=0;i<n;i++){
        map.put(arr1[i],map.getOrDefault(arr1[i],0)+1);  // put the elements of arr1 in map with their respective frequencies
       }

       for(int i=0;i<arr2.length;i++){ 
        int curr=arr2[i];
        for(int key: map.keySet()){  // given that all the elements of a2 exits in a1
            if(curr==key){  // so this never fails, get the order
                int freq=map.get(key);  // get the freq 
                for(int j=0;j<freq;j++){  // fill the list for that much time
                    list.add(key);
                }
            }
        }
        map.remove(curr);  // keep removing the key after it got filled in list
       }

    if(list.size()!=arr1.length){  // if there are leftovers, i.e elements in a1 that r not in a2 then 
          for(int key: map.keySet()){  // the keys r aslready sorted in asceding order, so just pick them up form the map and fill it in the list
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