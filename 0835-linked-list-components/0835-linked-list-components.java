class Solution {
    public int numComponents(ListNode head, int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        int connected = 0;
        ListNode curr = head;
        while(curr != null){
            if (set.contains(curr.val) && 
               (curr.next == null || !set.contains(curr.next.val))) {
                connected++;
            }
            curr = curr.next;
        }

        return connected;
    }
}
