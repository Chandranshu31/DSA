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
    public ListNode doubleIt(ListNode head) {
        if(head==null) return null;
        //if(head.next==null) return new ListNode(2*head.val);
        ListNode n= reverse(head);


        ListNode dummy= new ListNode(-1);
        ListNode temp = dummy;

      ListNode a= n;
      int carry=0;
      while(a!=null){
        int sum=carry;
        int currMulti= a.val*2;
       
        sum+=currMulti;
        carry=sum/10;
        int dig= sum%10;
        temp.next=new ListNode(dig);
        temp=temp.next;
        a=a.next;   
      }

      if(carry >0) { // after the loop if any carry left then make it a new node and return 
        temp.next = new ListNode(carry);
        }

      return reverse(dummy.next);

    }
    public ListNode reverse(ListNode head){
        if(head==null) return null;
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null){
            ListNode forward=curr.next;
            curr.next=prev;
            prev=curr;
            curr=forward;
        }
        return prev;

    }
}