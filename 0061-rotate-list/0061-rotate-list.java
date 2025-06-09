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
        if(head==null){
            return null;
        }
        int n=0;
        ListNode temp=head;
        while(temp != null){
            n++;
            temp=temp.next;
        }
         k=k%n;  // normalize k
        if(k==0) return head;
        // in this approach we wil do it by reversing the whole list then reverse the first k nodes, then break the link , then reverse the remaining n-k elements then making the others nul point to a ones head
        ListNode revHead=reverse(head); // reverse the whole linked list
        // now we need to reverse the first k elements then 
       
        ListNode secondTemp=revHead;
        for(int i=1;i<k;i++){
            secondTemp=secondTemp.next;
        }
        ListNode secondHead=secondTemp.next;
        secondTemp.next=null;

        // now the linked lsit is broken into two parts, revHead (contians first k elements) and secondHead(head of rest n-k elements)
        // now time to reverse the two LL and make the k elements one join to other

        ListNode r=reverse(revHead);
        ListNode r2=reverse(secondHead);

        ListNode tail=r;
        while(tail.next!=null){
            tail=tail.next;
        }
        tail.next=r2;
        return r;
   

    }
    public ListNode reverse(ListNode head){
        if(head==null){
            return null;
        }
        ListNode curr=head,prev=null;
        while(curr!=null){
            ListNode forward=curr.next;
            curr.next=prev;
            prev=curr;
            curr=forward;
        }
        return prev;
    }
}