/**
 * Definition for singly-linked list.
 * class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) {
 * val = x;
 * next = null;
 * }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }

        ListNode fast = head;
        ListNode slow = head;

        // move both by assuming we have a normal singly linked list and do the
        // operation if they meet
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) { // they have met for the first time
                slow = head;

                // and now move both by 1 step until they meet again
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
                // they met for the 2nd time and this is where the cycle begins
                return fast; // couldve returned fast as we;; becasue both are on same pos

            }
        }

        return null;

    }
}
