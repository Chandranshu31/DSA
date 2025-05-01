class Solution {
    public int similarPairs(String[] words) {
        int n=words.length;
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                HashSet<Character> set1 = new HashSet<>();
                HashSet<Character> set2 = new HashSet<>();
                String curr=words[i];
                String curr2=words[j];
                for(int k=0;k<curr.length();k++){
                    set1.add(curr.charAt(k));
                }
                for(int p=0;p<curr2.length();p++){
                    set2.add(curr2.charAt(p));
                }
                if(set1.equals(set2)){  // returns true only if both sets have the same unique characters.
                    count++;
                }
               
            }
        }
        return count;
        
        
    }
}