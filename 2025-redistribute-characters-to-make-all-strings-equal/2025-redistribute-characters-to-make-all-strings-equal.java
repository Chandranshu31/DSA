class Solution {
    public boolean makeEqual(String[] words) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<words.length;i++){
            String curr=words[i];
            for(int j=0;j<curr.length();j++){
                map.put(curr.charAt(j),map.getOrDefault(curr.charAt(j),0)+1);
            }
        }
        int strings=words.length;

        for(char k: map.keySet()){
            if(map.get(k)%strings !=0){
                return false;
            }
        }
        return true;
        
    }
}