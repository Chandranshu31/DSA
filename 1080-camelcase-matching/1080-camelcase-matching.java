class Solution {
    public List<Boolean> camelMatch(String[] queries, String pattern) {
        LinkedList<Boolean> list = new LinkedList<>();
        for(String q: queries){
            list.add(matches(q,pattern));
            
        }
        return list;
    }
    public boolean matches(String q, String pattern){
        int i=0;
        int j=0;
        while(i<q.length()){
            char qc=q.charAt(i);
            if(j<pattern.length() && qc==pattern.charAt(j)){
                i++;
                j++;
            }
            else if(Character.isLowerCase(qc)){
                i++;
            }else{ 
                return false;  // neithr the character of query matched to char of pattern nor it is a lowercase then def either a uppercase not in pattern order
            }
        }
        return j==pattern.length();
    }
}