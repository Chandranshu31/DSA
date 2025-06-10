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
    public int[] nextLargerNodes(ListNode head) {
        int n=0;
        ListNode temp=head;
        while(temp!=null){
            n++;
            temp=temp.next;
        }
        int res[]=new int[n];
        ListNode revHead=reverseList(head);  // now this is the new head; and the list has been reversed
        ListNode aux=revHead;

        Stack<Integer> s = new Stack<>();

        // now the last element of the list has no greater element, so fill the res array with 0 and push the value of lastnode
        res[n-1]=0;
        s.push(aux.val);
        aux=aux.next;
        
        int i=n-2;
        while(aux!=null){
            int currVal=aux.val;
            while(!s.isEmpty() && s.peek()<=currVal){
                s.pop();
            }
            if(s.isEmpty()){
                res[i--]=0;
                s.push(currVal);
            }
            else{
                res[i--]=s.peek();
                s.push(currVal);
            }
            
            aux=aux.next;
        }

        return res;
        
    }
    public ListNode reverseList(ListNode head){
        if(head==null){
            return null;
        }

        ListNode curr=head,prev=null;
        while(curr!=null){
            ListNode forward=curr.next;
            curr.next=prev;
            prev=curr;
            curr=forward;
        }

        return prev;
    }
}