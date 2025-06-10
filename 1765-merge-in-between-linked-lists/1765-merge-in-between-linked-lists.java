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
        
        ListNode tailOfList2=list2;
        while(tailOfList2.next!=null){
            tailOfList2=tailOfList2.next;
        }
        int count=1;
        ListNode temp=list1;
        while(count<a){
            temp=temp.next;
            count++;
        }
        ListNode forward=temp.next;
        temp.next=list2;
        while(count<b){
            forward=forward.next;
            count++;
        }
        ListNode end=forward.next;
        forward.next=null;
        tailOfList2.next=end;

        return list1;


    }
}