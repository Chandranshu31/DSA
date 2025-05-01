class Solution {
    public int countCharacters(String[] words, String chars) {
        int n=words.length;
         int ans=0;

        for(int i=0;i<n;i++){
            HashMap<Character,Integer> map = new HashMap<>();
            for(char ch:chars.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
           }
            String curr=words[i];
            boolean isGood=true;
            for(int j=0;j<curr.length();j++){
                if(!map.containsKey(curr.charAt(j)) || map.get(curr.charAt(j))<=0){
                   
                    isGood=false;
                    break;
                    }
                
                else{
                    map.put(curr.charAt(j),map.get(curr.charAt(j))-1);

                }
            }
            if(isGood){
               ans+=curr.length();
            }
        }
        return ans;
        
    }
}