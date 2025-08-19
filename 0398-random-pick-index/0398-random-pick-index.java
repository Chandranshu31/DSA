class Solution {
    Random rand;
    HashMap<Integer, ArrayList<Integer> > map ;

    public Solution(int[] nums) {
        map = new HashMap<>();
        rand= new Random();

        for(int i=0;i<nums.length;i++){
         map.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);

        }
        
    }
    
    public int pick(int target) {
        List<Integer> indices = map.get(target);
        int randomIndex = rand.nextInt(indices.size());
        return indices.get(randomIndex);
        
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int param_1 = obj.pick(target);
 */