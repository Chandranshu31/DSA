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
    public ListNode mergeNodes(ListNode head) {
        if(head==null){
            return null;
        }
        ListNode dummy = new ListNode(-1);
        ListNode aux=dummy;
        ListNode temp=head.next;
        while(temp!=null){
            int sum=0;
            while(temp.val!=0){
                sum+=temp.val;
                temp=temp.next;
            }
            ListNode newNode = new ListNode(sum);
            aux.next=newNode;
            aux=aux.next;

             temp=temp.next;
            sum=0;
            
        }
        return dummy.next;
        
    }
}