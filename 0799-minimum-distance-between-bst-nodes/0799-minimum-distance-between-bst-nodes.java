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
    int minDiff=Integer.MAX_VALUE;
    Integer prev=null;
    public int minDiffInBST(TreeNode root) {
        inorder(root);
        return minDiff;
    }
    public void inorder(TreeNode root){
        if(root==null) return;
        inorder(root.left);
        if(prev!=null){
            minDiff=Math.min(minDiff,Math.abs(prev-root.val));
        }
        prev=root.val;
        inorder(root.right);

    }
}
// inorder trav of bst gives sorted order and min diff would exist between two consecutive nodes when order is sorted... so a simple inorder with a trck of prev 
// and keep checking