class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String,Integer> map = new HashMap<>();
        String[] words = s1.trim().split("\\s+");
        String[] words2= s2.trim().split("\\s+");

        for(int i=0;i<words.length;i++){
           String curr=words[i];
           map.put(curr,map.getOrDefault(curr,0)+1);
        }
        
        for(int i=0;i<words2.length;i++){
           String curr=words2[i];
           map.put(curr,map.getOrDefault(curr,0)+1);
        }

        ArrayList<String> temp = new ArrayList<>();
        for(String key: map.keySet()){
            if(map.get(key)==1){
                temp.add(key);
            }
        }
        int n=temp.size();
        String res[]= new String[n];
        for(int i=0;i<n;i++){
            res[i]=temp.get(i);
        }

        return res;
        
    }
}