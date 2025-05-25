class Solution {

    public int closestTarget(String[] words, String target, int startIndex) {
       int minDistance = Integer.MAX_VALUE;
       int n=words.length;
       for(int i=0;i<n;i++){
        if(words[i].equals(target)){
            int direct= Math.abs(i-startIndex);
            int circular= n-direct;
              minDistance=Math.min(minDistance,Math.min(direct,circular));
        }
      
       }
       if(minDistance==Integer.MAX_VALUE){
        return -1;
       }

       return minDistance;




        
    }

}