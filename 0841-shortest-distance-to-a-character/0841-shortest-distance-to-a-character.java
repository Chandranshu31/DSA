class Solution {
    public int[] shortestToChar(String s, char c) {
        List<Integer> indices= new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==c){
                indices.add(i); // in the list store al the occurences of c
            }
        }

        int res[]=new int[s.length()];
        int n=res.length;

        for(int i=0;i<n;i++){
            int curr=i;
            int minDiff=Integer.MAX_VALUE; // now for every el in s, iterate over the indices and find the min distance
            for(int j=0;j<indices.size();j++){
                minDiff=Math.min(minDiff,Math.abs(curr-indices.get(j)));
            }
            res[i]=minDiff;
        }
        return res;
        
        
    }
}