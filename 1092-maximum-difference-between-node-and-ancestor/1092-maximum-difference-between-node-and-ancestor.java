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
    int maxDiff=Integer.MIN_VALUE;
    public int maxAncestorDiff(TreeNode root) {
        if(root==null) return -1;
        dfs(root,root.val,root.val);
        return maxDiff;
       
        
    }
    public void dfs(TreeNode root,int minVal,int maxVal){
       if(root==null) return;
       maxDiff=Math.max(maxDiff,Math.max(Math.abs(root.val-minVal),Math.abs(root.val-maxVal)));

       minVal=Math.min(root.val,minVal);
       maxVal=Math.max(root.val,maxVal);

       dfs(root.left,minVal,maxVal);
       dfs(root.right,minVal,maxVal);
    }
}

// the logic is on a path from root curr node 
// the max diff between curr node and any of its ancstors would be definitly wther be from maxval seen till now on path from root to curr
// or min val seen so far...so we used that logic here and then keep updating minval and maxval at every node