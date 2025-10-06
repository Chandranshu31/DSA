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
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSubPath(ListNode head, TreeNode root) {
        if(head==null) return true; // if no list and tree exists then true
        if(root==null) return false; // if no tree then false
        if(root.val==head.val){
            if(isDownwardPath(root,head)){
                return true;
            }
        }
        return isSubPath(head,root.left) || isSubPath(head,root.right);
    }
    public boolean isDownwardPath(TreeNode root,ListNode head){ // sure shot that root n head r not passed null here
        if(head==null) return true; // we reached the end of list while matching so return true
        if(root==null) return false; // we reached the leaf's ull while above cond is false that is list not finished yet so ret false
        if(root.val!=head.val) return false; // if val mismatches then again false

        return isDownwardPath(root.left,head.next) || isDownwardPath(root.right,head.next);  // if matched then check for left and righsubtree
// a dfs
    }
}