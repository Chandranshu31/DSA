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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null) return null;
        int  n=0;
        ListNode temp= head;
        while(temp!=null){
            n++;
            temp=temp.next;
        }
        k=k%n; // normalise k
        if(k==0){
            return head;
        }

        // reverse the whole LL. then reverse first K elements, then reverse remainig elements...and done, by interlinking and breaking the link
        ListNode revHead= reverse(head);
        ListNode aux= revHead;
        for(int i=0;i<k-1;i++){
            aux=aux.next;
        }
        ListNode rightHead=aux.next;
        aux.next=null;

        ListNode revLeft=reverse(revHead);
        ListNode revRight=reverse(rightHead);
        ListNode r=revLeft;

        while(r.next!=null){
            r=r.next;
        }
        r.next=revRight;
        return revLeft;


        
    }
    public ListNode reverse(ListNode head){
        if(head==null){
            return null;
        }
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