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
   // int maxSoFar=Integer.MIN_VALUE;
    int count=0;
    public int goodNodes(TreeNode root) {
        if(root==null) return 0;
       int maxSoFar=root.val;
       // count++;
        dfs(root,maxSoFar);
        return count;
    }
    public void dfs(TreeNode root,int maxSoFar){
        if(root==null) return;
        if(root.val>=maxSoFar){
            count++;
            maxSoFar=root.val;
        }
       dfs(root.left,maxSoFar);
     dfs(root.right,maxSoFar);
    }
}

// every path must have its own max so far...i.e every recursion path must have its own maxsofar value seen