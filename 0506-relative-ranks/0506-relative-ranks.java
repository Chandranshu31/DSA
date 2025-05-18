class Solution {
    public String[] findRelativeRanks(int[] score) {
        TreeMap<Integer,Integer> map = new TreeMap<>(Collections.reverseOrder());
        for(int i=0;i<score.length;i++){
            map.put(score[i],i);
        }
        String res[]=new String[score.length];
        int count=0;
        
            for(int key: map.keySet()){
                int idx=map.get(key);
                if(count==0){
                    res[idx]="Gold Medal";
                }
                else if(count==1){
                    res[idx]="Silver Medal";     
                }
               else if(count==2){
                    res[idx]="Bronze Medal";
                
                }
                else{
                    res[idx]=String.valueOf(count+1);
                }
                 count++;
            }
           
        

        return res;

    }
}