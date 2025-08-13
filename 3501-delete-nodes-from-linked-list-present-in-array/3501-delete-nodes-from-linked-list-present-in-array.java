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
    public ListNode modifiedList(int[] nums, ListNode head) {
        int n=nums.length;
        if(head==null){
            return head;
        }

        HashSet<Integer> set= new HashSet<>(); // so that we can easily search array elements in O(1)
        for(int num:nums){
            set.add(num);
        }


        ListNode dummy= new ListNode(-1);
        dummy.next=head;
        ListNode curr=head;
        ListNode temp=dummy;

        while(curr!=null){
            if(set.contains(curr.val)){
                temp.next=curr.next;

            }else{
                temp=temp.next;
            }
            curr=curr.next;
    
        
            
        }
        return dummy.next;

        

    }
}

/**
Another method without using hashset using loop but it will give TLE in large array cases 
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 
class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {
        int n=nums.length;
        if(head==null){
            return head;
        }
        ListNode dummy= new ListNode(-1);
        dummy.next=head;
        ListNode temp=head;
        ListNode prev=dummy;

        while(temp!=null){
            boolean remove=false; // to check wether we want to remove ths node or not
            for(int i=0;i<n;i++){
                if(nums[i]==temp.val){
                    remove=true;  // if conditions meets then we want to remove it
                    break;
                }
            }
            if(remove){
                prev.next=temp.next;
            }else{
                prev=prev.next;
            }
            temp=temp.next;
            
        }
        return dummy.next;

        

    }
} */