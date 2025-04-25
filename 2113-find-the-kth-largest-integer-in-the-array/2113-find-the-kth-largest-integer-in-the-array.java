class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        // mineap using custom comparator for numerical string comparison
        PriorityQueue<String> pq = new PriorityQueue<>((a, b) -> {
            if (a.length() != b.length()){ // shorter string = smaller number
                return a.length() - b.length(); // if length not same then keep the smaller string size wise in front
                } 

            return a.compareTo(b); // or  if same length, compare lexicographically and keep the smallest at front
        });

        for (String num : nums) {
            pq.add(num);
            if (pq.size() > k) {
                pq.remove(); // remove smallest if size > k
            }
        }

        return pq.peek(); // kth largest
    }
}
