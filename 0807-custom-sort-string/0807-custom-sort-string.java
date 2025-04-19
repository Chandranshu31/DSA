class Solution {
    public String customSortString(String order, String s) {
         int n=order.length();
         int m=s.length();

         Queue<Character> q = new LinkedList<>();  // to maintain the order, it can be solved without it also
         for(int i=0;i<n;i++){
            char ch= order.charAt(i);
            q.add(ch);
         }
        
        HashMap<Character,Integer> map = new HashMap<>(); // store the elemnts of s with their freq, they rnot supposed to b unique, if ord="aba"  then if
        // in s b is 6 times still the order must be maintained
        for(int j=0;j<m;j++){
            char ch=s.charAt(j);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        StringBuilder sb= new StringBuilder();

        while(!q.isEmpty()){
            char cr=q.remove();
            if(map.containsKey(cr)){
                int freq=map.get(cr);
                for(int i=0;i<freq;i++){
                   sb.append(cr);
                }
                map.put(cr,0);
            }
               
            }
        // now for leftover elements who are not a part of order, they just need to be added inot the string in any manner
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