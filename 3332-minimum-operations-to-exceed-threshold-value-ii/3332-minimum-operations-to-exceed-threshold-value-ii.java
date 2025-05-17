class Solution {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long> pq = new PriorityQueue<>();
        for (int num : nums) {
            pq.add((long) num);
        }

        int count = 0;
        while (!pq.isEmpty() && pq.peek() < k) {
            if (pq.size()<2) {
                return -1;
            }  //less than 2 elements so we cant combine

            long a = pq.remove();
            long b = pq.remove();
            long insert = a*2+ b;// by default a is min among a and b and b is max among a and b, so no need to calc math.max or min

            pq.add(insert);
            count++;
        }

        return count;
    }
}
// used long instead of int because 1 <= nums[i] <= 109