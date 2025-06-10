/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    List<Integer> list;
    Random rand; // to get random val

    public Solution(ListNode head) {
        list = new ArrayList<>();
        rand = new Random();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        
    }
    
    public int getRandom() {
        int randomIndex = rand.nextInt(list.size());  // get any ranodm index from the list 
        return list.get(randomIndex);  // return the val
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */