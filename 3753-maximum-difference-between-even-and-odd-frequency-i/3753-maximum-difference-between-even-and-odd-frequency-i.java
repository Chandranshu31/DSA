class Solution {
    public int maxDifference(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
             map.put(c,map.getOrDefault(c,0)+1); // to store the freq
        }
        
           
        int minEven=Integer.MAX_VALUE;
        int maxOdd=Integer.MIN_VALUE;

        for(char k: map.keySet()){
            int currFreq=map.get(k);
            if(currFreq%2==0){
                minEven=Math.min(minEven,currFreq);
            }else{
                maxOdd=Math.max(maxOdd,currFreq);
            }
        }

        if(minEven==Integer.MAX_VALUE || maxOdd==Integer.MIN_VALUE){
            return 0; // to handle the  case where there are no odd frequenct or no even freq
        }

        return  maxOdd-minEven;
        
    }
}