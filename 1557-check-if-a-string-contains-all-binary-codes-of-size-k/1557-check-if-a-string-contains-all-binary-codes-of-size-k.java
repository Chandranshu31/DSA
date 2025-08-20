class Solution {
    public boolean hasAllCodes(String s, int k) {
        HashSet<String> set= new HashSet<>();
        double total=Math.pow(2,k);
      
        
        for(int i=0;i<=s.length()-k;i++){
            String su = s.substring(i,i+k);
             set.add(su);
        }

        return set.size()==total; 
        
    }
}