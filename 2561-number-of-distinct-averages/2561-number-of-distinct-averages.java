class Solution {
    public int distinctAverages(int[] nums) {
        Arrays.sort(nums);
        
        HashSet<Double> set = new HashSet<>();
        List<Integer> list= new ArrayList<>();

        for(int num:nums){
            list.add(num);
        }

        while(list.size()!=0){
            int min=list.get(0);  // as sorted so min always at start
            int max=list.get(list.size()-1);  // and max at the end
            

            double avg=(double)(max+min)/2;
            set.add(avg);
            list.remove(0);
            list.remove(list.size()-1);
        

        }
        return set.size();

        
        
    }
}