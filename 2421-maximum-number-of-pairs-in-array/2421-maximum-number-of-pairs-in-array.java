class Solution {
    public int[] numberOfPairs(int[] nums) {
      HashMap<Integer,Integer> map = new HashMap<>();
      int ans[]=new int[2];
      for(int num:nums){
        map.put(num,map.getOrDefault(num,0)+1);
      }
      int pairs=0; 
      int remain=0; //leftover after forming pairs of equal numbs
      for(Map.Entry<Integer,Integer> entry: map.entrySet()){
        int currFreq=entry.getValue();
        if(currFreq%2==0){ // if even numb of occurences of a number then it will form pairs only so numb of pairs=freq/2
            pairs+=currFreq/2;
        }else{  // for odd, it may form pair until it reaches a multiple of 2 and leftover will go in remain
            pairs+=currFreq/2;
            remain+=currFreq%2;
        }

      }
      ans[0]=pairs;
      ans[1]=remain;
      return ans;

    }
}