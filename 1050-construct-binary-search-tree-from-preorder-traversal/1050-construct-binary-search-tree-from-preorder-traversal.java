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
    int index=0;

    public TreeNode bstFromPreorder(int[] preorder) {
        return buildBST(preorder,Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    public TreeNode buildBST(int [] preorder, int lower, int upper){
        if(index==preorder.length){
            return null;
        }
        int val=preorder[index];
        if(val<lower || val> upper){ // the node is not be the child of the current node.
            return null;
        }

        index++;
        TreeNode root = new TreeNode(val);
        root.left=buildBST(preorder,lower,val);
        root.right=buildBST(preorder,val,upper);
        return root;
    }
}