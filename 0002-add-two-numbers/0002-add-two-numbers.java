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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy= new ListNode(-1);
        ListNode curr=dummy;
        int carry=0;
        ListNode a=l1,b=l2;

        while(a!=null || b!=null|| carry!=0){ // carry!=0 for the cases when the length of two lists is not equal and after that if we are leftover with some.. for 99+1 we want res to be 001, in revere order
            int sum=carry;

            if(a!=null){
                sum+=a.val;
                a=a.next;
            }
            if(b!=null){
                sum+=b.val;
                b=b.next;
            }
            carry=sum/10;
           int digit=sum%10;
            curr.next= new ListNode(digit);
            curr=curr.next;
        }
        return dummy.next;
    }
}