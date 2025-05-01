class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
          HashMap<String,Integer> map1= new HashMap<>();
          HashMap<String,Integer> map2= new HashMap<>();

          for(int i=0;i<list1.length;i++){
            map1.put(list1[i],i);
          }
          for(int i=0;i<list2.length;i++){
            map2.put(list2[i],i);
          }
          int leastIdxSum=Integer.MAX_VALUE;
          List<String> list = new ArrayList<>();
          HashSet<String> set = new HashSet<>(map1.keySet());
          for(String key:set){
            if(map2.containsKey(key)){
               int v1=map1.get(key);
               int v2=map2.get(key);
               int indxSum=v1+v2;
                  if (indxSum < leastIdxSum) {
                    list.clear();
                    list.add(key);
                    leastIdxSum = indxSum;
                } else if (indxSum == leastIdxSum) {
                    list.add(key);
                }
               
        
            }
          }

          int size=list.size();
          String res[]= new String[size];
          for(int i=0;i<size;i++){
            res[i]=list.get(i);
          }
return res;






    }
}