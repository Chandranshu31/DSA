class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        //int n=nums1.length;
        int n= nums2.length;
        HashMap<Integer,Integer> h1 = new HashMap<>();
        HashMap<Integer,Integer> h2 = new HashMap<>();

        for(int num:nums1){
            h1.put(num,h1.getOrDefault(num,0)+1);
        }
        for(int num: nums2){
            h2.put(num,h2.getOrDefault(num,0)+1);
        }
       List<Integer> list= new ArrayList<>();
        for(int key: h2.keySet()){
            
            if(h1.containsKey(key)){
                int freq1= h1.get(key);
                int freq2=h2.get(key); // as we r iterating over n2 then its definitely in h2
                int min=Math.min(freq1,freq2);
                for(int j=0;j<min;j++){
                    list.add(key);
                }
                h1.put(key,0); // so if we again encounter the num we dont fill it again 

            }
        }

        int m= list.size();
        int res[]=new int[m];
        for(int i=0;i<m;i++){
            res[i]=list.get(i);
        }

        return res;

        

        
        


        
    }
}