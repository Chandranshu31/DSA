class Solution {
public:
    int search(vector<int>& nums, int target) {
        int start = 0;
        int end = nums.size()-1;
        int result = -1;

        while(start<=end){
            int mid = start + (end-start) / 2;
            if(nums[mid] == target){
                result = mid;
                return mid;
            }else if(nums[mid]<target){
                start = mid+1;
            }else{
                end = mid - 1;
            }
        }
        return result;
    }
};