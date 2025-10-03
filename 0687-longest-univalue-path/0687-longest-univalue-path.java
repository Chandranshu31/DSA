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
    int maxLen=0;
    public int longestUnivaluePath(TreeNode root) {
        dfs(root);
        return maxLen;
    }
    public int dfs(TreeNode root){
        if(root==null) return 0;
        int left=dfs(root.left);
        int right=dfs(root.right);

        int leftPath=0;
        int rightPath=0;

        if(root.left!=null && root.val==root.left.val){
            leftPath+=left+1;
        }
        if(root.right!=null && root.val==root.right.val){
            rightPath+=right+1;
        }

        maxLen=Math.max(maxLen,leftPath+rightPath);
        return Math.max(leftPath,rightPath);
    }
}