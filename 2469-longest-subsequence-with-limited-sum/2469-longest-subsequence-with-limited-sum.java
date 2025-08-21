class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);
        int prefix[]=new int[nums.length];
        prefix[0]=nums[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+nums[i];
        }
        int res[]=new int[queries.length];
        for(int i=0;i<queries.length;i++){
            res[i]=firstGreaterIdx(prefix,queries[i]);
        }
        return res;
    }
    public int firstGreaterIdx(int arr[], int x){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]<=x){
                start=mid+1;
            }else{
                end=mid;
            }
        }
        if (arr[start] <= x) return arr.length; // atp start would be at the last index
    return start;
    }
}