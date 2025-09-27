/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null) return root;
        if(root.val==p.val|| root.val==q.val) return root;
        TreeNode leftLca= lowestCommonAncestor(root.left,p,q);
        TreeNode rightLca=lowestCommonAncestor(root.right,p,q);
        if(leftLca==null) return rightLca;
        if(rightLca==null) return leftLca;
        return root; // when both left and right lca r not null

        // lca is like when we look from bottom to up then very first node in which's subtrees(right or left) the two nodes exists
    }
}