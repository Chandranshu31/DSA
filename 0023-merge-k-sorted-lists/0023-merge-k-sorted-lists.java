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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a,b) -> Integer.compare(a.val,b.val)); // for custom objects like listnode, we need to tell it how tos ort
        for(ListNode node: lists){
           if(node!=null) pq.add(node);
        }

        ListNode dummy= new ListNode(-1);
        ListNode curr=dummy;

        while(!pq.isEmpty()){
            ListNode minNode= pq.remove();
            curr.next=minNode;
            curr=curr.next;
            if(minNode.next!=null){
                pq.add(minNode.next);
            }
        }

        return dummy.next;
    }
}


// imagine it like that at every indx only the head of Linked list is given to us and so on that is sorted in asc,
// pq will help us to keep the min node at the front