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
    public boolean isPalindrome(ListNode head) {
        if(head==null){
            return true;
        }
        ListNode fast=head.next;
        ListNode slow=head;

        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        ListNode temp=slow.next;
        slow.next=null;

        // now reverse the right part;
        ListNode curr=temp;
        ListNode prev=null;
        while(curr!=null){
            ListNode forward=curr.next;
            curr.next=prev;
            prev=curr;
            curr=forward;
        }
        ListNode secondHead=prev;

        ListNode one=head;
        ListNode secnd=secondHead;

        while(one!=null && secnd!=null){
            if(one.val!=secnd.val){
                return false;
            }
            one=one.next;
            secnd=secnd.next;
        }
        return true;
        
    }
}