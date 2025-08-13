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
    public ListNode deleteMiddle(ListNode head) {
        if(head==null){
            return null;
        }
        if(head.next==null){
            return null;
        }
        ListNode dummy = new ListNode(-2);
        dummy.next=head;

        ListNode fast=head;
        ListNode slow= head;
        ListNode prev= dummy;
        

        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            prev=prev.next;
        }
        prev.next=prev.next.next;
        return head;
        
    }
}