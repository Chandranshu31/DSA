class Solution {
    public int distinctAverages(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        HashSet<Double> set = new HashSet<>();
        int start=0;
        int end=n-1;

        while(start<end){
            int min=nums[start];
            int max=nums[end];
            double avg=(double)(max+min)/2;
            set.add(avg);
            start++; // to get the new min
            end--;   // to get the new max
        }
        return set.size();
    }
}

/**
AN ALTERNATE SOLUTION
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
} */