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
    public ListNode oddEvenList(ListNode head) {
        
        if(head==null||head.next==null){
            return head;
        }

        // we will use two pointers approach 
        ListNode odd=head;// to track the odd nodes
        ListNode even=head.next;//to track the even nodes
        ListNode Ehead=even;// to maintain the head of the even pairs so that we can point odd to it

        while(even!=null&&even.next!=null){
            odd.next=odd.next.next;
          
            odd=odd.next;

            even.next=even.next.next;
            even=even.next;
        }
        // make the odd last node point towards the even head as we want odd then even
        odd.next=Ehead;

        return head;
        
    }
}