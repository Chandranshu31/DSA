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
        if(head==null||head.next==null){
            return null;
        }
       

        ListNode dummy=new ListNode(-1);

        dummy.next=head;

        ListNode fast=head;
        ListNode slow=head;
        ListNode prev=dummy;

        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            prev=prev.next;
        }
        prev.next=slow.next;

        return head;

        
    }
}
/** could be solved without using dummy node by initialsing fast from head.next.next and slow from head and then
moving them according to their pace, at the end slow would be 1 node behind of middle. */