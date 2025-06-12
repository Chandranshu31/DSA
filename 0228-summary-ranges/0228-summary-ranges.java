class Solution {
    public List<String> summaryRanges(int[] nums) {
        int n=nums.length;
        List<String> res = new ArrayList<>();
        int i=0;
        while(i<n){
            int start=i;

            while(i+1<n && nums[i]+1==nums[i+1]){
                i++;
            }
            if(start==i){
                res.add(String.valueOf(nums[start]));
            }else{
                res.add(nums[start]+"->"+nums[i]);
            }
            i++;
        }
        return res;
    }
}