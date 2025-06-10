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
        ListNode aux=dummy; // pointer over the dummy node
        ListNode temp=head.next;  // start from the next of head ashead is always==0
        while(temp!=null){  // iterate over the given linkedlist
            int sum=0;     // to store the running sum
            while(temp.val!=0){  // until we get a 0 keep moving the temp and adding the values inot sum
                sum+=temp.val;
                temp=temp.next;
            }
            ListNode newNode = new ListNode(sum);  // now create a node with value of sum
            aux.next=newNode;  // make aux point towards it
            aux=aux.next;  // move aux ahead to add next node if its there
            temp=temp.next;   // move temp ahead
            sum=0;  // set sum==0 again. for the next iteration
            
        }
        return dummy.next; // return the head of the new linked list
        
    }
}