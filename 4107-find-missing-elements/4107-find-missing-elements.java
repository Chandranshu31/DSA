class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int smallest=Integer.MAX_VALUE;
        int largest=Integer.MIN_VALUE;
        HashSet<Integer> set = new HashSet<>();
        for(int num:nums){
            set.add(num);
            smallest=Math.min(smallest,num);
            largest=Math.max(largest,num);
        }
        ArrayList<Integer> res= new ArrayList<>();
        int num=smallest+1;
        while(num<largest){
            if(!set.contains(num)) res.add(num);
            num++;
        }
        return res;
        
        
    }
}