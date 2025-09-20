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
    public int maxDiam=0;
    public int diameterOfBinaryTree(TreeNode root) {
        height(root); // this is valid in java, as it does not throws any kind of error, the return value is discarde all the time
        return maxDiam;
    }
    public int height(TreeNode root){
        if(root==null) return 0;
        int lh=height(root.left);
        int rh=height(root.right);

        maxDiam=Math.max(lh+rh,maxDiam); // when asked diameter wrt numb of nodes just math.max(lh+rh+1,maxdiam)
        return Math.max(lh,rh)+1;
    }
}
/*
 * Height(TreeNode node) recursively computes the height of the subtree rooted at 'node'.
 * While computing the height, we also update 'maxDiameter' as a side effect.
 * 
 * maxDiameter stores the largest number of edges on any path between two nodes found so far.
 * For each node:
 *   - leftHeight  = height of left subtree
 *   - rightHeight = height of right subtree
 *   - leftHeight + rightHeight gives the number of edges in the longest path through this node
 *   - We update maxDiameter if this path is longer than the previous maximum.
 * 
 * Finally, getHeight returns the height to the parent so that the parent can compute its own potential diameter.
 */
