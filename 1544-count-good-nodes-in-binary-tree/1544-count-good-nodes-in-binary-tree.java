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
    public int goodNodes(TreeNode root) {
        return dfs(root,root.val);
    }
    public int dfs(TreeNode root, int maxSoFar){
       if(root==null) return 0;
       int good=0;
       if(root.val>=maxSoFar){
        good=1;
        maxSoFar=root.val;
       }
      // maxSoFar=Math.max(root.val,maxSoFar);
       good+=dfs(root.left,maxSoFar);
       good+=dfs(root.right,maxSoFar);
       return good;
    }
}