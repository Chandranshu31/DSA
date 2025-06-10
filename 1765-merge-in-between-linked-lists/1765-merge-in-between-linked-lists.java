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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        // given that a and b wil always be between 1 and length of l1-1 so tail node wont be there in b
        // set a pointer at the tail of list2
        
        ListNode tailOfList2=list2; 
        while(tailOfList2.next!=null){
            tailOfList2=tailOfList2.next;
        }

        int count=1;      // after that move the pointer until we reach behind the ath  indexed node
        ListNode temp=list1;
        while(count<a){
            temp=temp.next;
            count++;
        }

        ListNode forward=temp.next;  // store the next and make temp pont to th list1 head
        temp.next=list2;
        while(count<b){    // same for b iterate until we reach  the b
            forward=forward.next;
            count++;
        }

        ListNode end=forward.next;  // just ahead or next of bth node
        forward.next=null;  //break the link from original
        tailOfList2.next=end;  // make the tail point to it

        return list1;


    }
}