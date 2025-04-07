class Solution {
    public int numberOfPoints(List<List<Integer>> nums) {
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<nums.size();i++){
                int start=nums.get(i).get(0);
                int end= nums.get(i).get(1);

                for(int k=start;k<=end;k++){
                    hs.add(k);
                }
            }
        
        return hs.size();
    }
        
    
}