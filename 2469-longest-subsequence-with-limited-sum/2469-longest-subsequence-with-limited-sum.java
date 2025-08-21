class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);
        int res[] = new int[queries.length];
        for(int i=0;i<queries.length;i++){
            int curr=queries[i];
            int sum=0;
            int length=0;
            for(int j=0;j<nums.length;j++){
                sum+=nums[j];
                if(sum<=curr){
                    length++;
                }
            }
            res[i]=length;
        }
        return res;
        
    }
}