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
        if(l1==null) return l2;
        if(l2==null) return l1;
        if(l1==null && l2==null) return null;
        

        ListNode dummy= new ListNode(-1);
        ListNode curr=dummy;

        ListNode a=reverse(l1);
        ListNode b= reverse(l2);
        int carry=0;

        while(a!=null || b!=null || carry!=0){
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

            curr.next=new ListNode(digit);
            curr=curr.next;
        }

        return reverse(dummy.next);
        
    }
    public ListNode reverse(ListNode head){
        if(head==null|| head.next==null){
            return head;
        }
        ListNode curr=head;
        ListNode prev=null;
        while(curr!=null){
            ListNode forward=curr.next;
            curr.next=prev;
            prev=curr;
            curr=forward;
        }
        return prev;
    }
}

// imagine the numbs r reversed, so bring them in original form and start adding from MSB and rev for desired result, as we dont ave any prev pointer