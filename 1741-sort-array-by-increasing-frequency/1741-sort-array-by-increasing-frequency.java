class Solution {
    public int[] frequencySort(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num: nums){
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }else{
                map.put(num,1);
            }
        }
        // now we need to sort the array based on freq;
        // the idea is get the key with min freq all time and put it in our res array 
        
        int res[]=new int[n];
        int i=0;
        while(i<n){
            int smallestFreq=Integer.MAX_VALUE;
            int keyWithMinFreq=-1;
                 // Find the key with the smallest frequency
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                int key = entry.getKey();
                int freq = entry.getValue();
                if (freq > 0 && (freq < smallestFreq || (freq == smallestFreq && key > keyWithMinFreq))) {  // in case if fre of two elements r same the ELMENT i.e key greater should bbe the one prioritized
                    smallestFreq = freq;
                    keyWithMinFreq = key;
                }
            }

            for(int j=0;j<smallestFreq;j++){
                res[i++]=keyWithMinFreq;
            }
            map.put(keyWithMinFreq,0);

        }
        return res;   
    }  
}