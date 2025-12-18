// User function Template for Java

/*Linked List Node
class LNode
{
    int data;
    LNode next;
    LNode(int d) {
        data = d;
        next = null;
    }
}

//Tree Node
class TNode
{
    int data;
    TNode left, right;
    TNode(int x)
    {
        data=x;
        left=right=null;
    }

}*/

class Solution {
    public TNode sortedListToBST(LNode head) {
        if(head==null) return null;
        if (head.next == null) {
    return new TNode(head.data);
}

        LNode fast=head;
        LNode slow=head;
        LNode dummy = new LNode(-1);
        dummy.next=head;
        LNode curr=dummy;
        
        while(fast!=null && fast.next!=null){
            curr=slow;
            fast=fast.next.next;
            slow=slow.next;
        }
        if(curr!=null){
            curr.next=null;
        }
        // now slow is at the middle
        TNode root= new TNode(slow.data);
        root.left=sortedListToBST(head);
        root.right=sortedListToBST(slow.next);
        slow.next=null;
        return root;
        
    }
}