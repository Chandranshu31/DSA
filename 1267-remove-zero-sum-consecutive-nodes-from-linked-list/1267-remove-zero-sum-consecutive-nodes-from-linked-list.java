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
    public ListNode removeZeroSumSublists(ListNode head) {
       ListNode dummy= new ListNode(0);
       dummy.next=head;
       ListNode curr=dummy;
       HashMap<Integer,ListNode> map= new HashMap<>();
       int prefixSum=0;

       while(curr!=null){
        prefixSum+=curr.val;
        map.put(prefixSum,curr); // will update the  value or node if it gets a same key or prefix  sum again
        curr=curr.next;
       }

       prefixSum=0;
       curr=dummy;
       while(curr!=null){
        prefixSum+=curr.val;
        curr.next=map.get(prefixSum).next;
        curr=curr.next;
       } 

       return dummy.next;
    }
}

// the core idea was if the preficsum is same at two diff indices then the sumof elements in between them must be zero, so remove them all