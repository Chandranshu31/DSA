class Solution {
    public String customSortString(String order, String s) {
         int n=order.length();
         int m=s.length();

         Queue<Character> q = new LinkedList<>();
         for(int i=0;i<n;i++){
            char ch= order.charAt(i);
            q.add(ch);
         }
        
        HashMap<Character,Integer> map = new HashMap<>();
        for(int j=0;j<m;j++){
            char ch=s.charAt(j);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        StringBuilder sb= new StringBuilder();

        while(!q.isEmpty()){
            char cr=q.remove();
            for(Map.Entry<Character,Integer> entry: map.entrySet()){
                char curr=entry.getKey();
                if(curr==cr){
                    int freq=entry.getValue();
                    for(int l=0;l<freq;l++){
                        sb.append(curr);
                    }
                     map.put(curr,0);// to neglect the curr for the next time
                }
               
            }
        }
        // now for leftover elements
        for(Map.Entry<Character,Integer> e:map.entrySet()){
            char curr=e.getKey();
            int f=e.getValue();
            if(f!=0){
                for(int z=0;z<f;z++){
                    sb.append(curr);
                }
            }
        }

        return sb.toString();

    }
}