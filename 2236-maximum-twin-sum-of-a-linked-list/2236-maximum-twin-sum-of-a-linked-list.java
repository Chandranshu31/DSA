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
    public int pairSum(ListNode head) {
        // we can do it by finding the mid of the linked list, and then reversing the part ahead of mid 
        ListNode mid=findMid(head);
        ListNode newHead=mid.next;
        mid.next=null;
        ListNode headOfRevLL=reverseLinkedList(newHead);

        ListNode temp1=head;
        ListNode temp2=headOfRevLL;
        int maxTwinSum=Integer.MIN_VALUE;

        while(temp1 !=null && temp2 !=null ){
            int currSum=temp1.val+temp2.val;
            maxTwinSum=Math.max(currSum,maxTwinSum);
            temp1=temp1.next;
            temp2=temp2.next;
        }

        return maxTwinSum;

    }
    public ListNode findMid(ListNode head){
        ListNode fast=head.next;
        ListNode slow=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public ListNode reverseLinkedList(ListNode head){
        if(head==null){
            return null;
        }
        ListNode prev=null;
        ListNode temp=head;
        while(temp!=null){
            ListNode forward=temp.next;
            temp.next=prev;
            prev=temp;
            temp=forward;
        }
        return prev;
    }
}
// O(n) time and O(1) extra space.
// the idea was to reverse the linked list from the mid and then set two pointers and keep adding their values and checking the max so far