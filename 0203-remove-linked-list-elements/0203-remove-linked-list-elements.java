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
    public ListNode removeElements(ListNode head, int val) {
        if(head==null){
            return null;
        }
        ListNode curr= head;
        ListNode dummy = new ListNode(0);
        dummy.next=head;
        ListNode temp=dummy; 

        while(curr!=null ){
            if(curr.val==val){
                temp.next=curr.next;
            }else{
               
                temp=temp.next;
            }
             curr=curr.next;
        }
        return dummy.next;
        
    }
}