class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int res[]=new int[k];
        int n= nums.length;

        HashMap<Integer,Integer> map= new HashMap<>();

        for(int i=0;i<n;i++){
            int curr=nums[i];
            if(map.containsKey(curr)){
                map.put(curr,map.get(curr)+1);
            }
            else{
                map.put(curr,1);
            }
        } //filled the hashmap with numbers and their frequencies


        Set<Integer> keys= map.keySet(); // get the keyset

        for(int i=0;i<k;i++){  // this loop wil run for k times, giving us the k most freq elements
            int mostFrequent=-1;
            int maxFrequency=Integer.MIN_VALUE;

            for(int key: keys){
                int frequency=map.get(key);
                if(frequency>maxFrequency){
                    maxFrequency=frequency;
                    mostFrequent=key;
                }
            }
            map.remove(mostFrequent); // keep removing the current most frequent so that it does not get addedin the
            // next time also
           
            res[i]=mostFrequent; 
             

        }
        return res;
        
    }
} // time comp is O(n*k) , optimized could be O(n logk) using min heap.
// but I solved this question on my own;