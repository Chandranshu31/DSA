class Solution {
    public int minOperations(List<Integer> nums, int k) {
      HashSet<Integer> set = new HashSet<>();
      int moves=0;
      for(int i=nums.size()-1;i>=0;i--){
        int val=nums.get(i);
        if(val>=1 && val<=k){
            set.add(val);
        }
        moves++;
        
        if(set.size()==k){
            break;
        }
      }
      return moves;

    }
}