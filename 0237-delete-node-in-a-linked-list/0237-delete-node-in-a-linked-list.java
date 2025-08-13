/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
 // copy the value of next into currrent node(the node which we want to delete) and then make it point to next.next
 // it will automatically delete that node
class Solution {
    public void deleteNode(ListNode node) {
     /** Delete the given node. Note that by deleting the node, we do not mean removing it from memory. We mean:

The value of the given node should not exist in the linked list.
The number of nodes in the linked list should decrease by one. as this is given so we just need to replace the value and not actually del it */
if(node==null || node.next==null){
    return;
}
node.val=node.next.val;
node.next=node.next.next;
        
    }
}