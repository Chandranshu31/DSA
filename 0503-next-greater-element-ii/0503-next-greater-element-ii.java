class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        Stack<Integer> stack = new Stack<>();

        for(int i = 2 * n - 1; i >= 0; i--) {  // to maintain the circularity, rest all same, we need to iterate twice on the arr
            int idx = i % n;  

            while(!stack.isEmpty() && stack.peek() <= nums[idx]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                res[idx] = -1;
            }else {
                res[idx] = stack.peek();
            }

            stack.push(nums[idx]);
        }

        return res;
    }
}
