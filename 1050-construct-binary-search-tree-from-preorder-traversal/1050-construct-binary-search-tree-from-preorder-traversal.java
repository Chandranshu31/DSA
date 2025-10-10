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
    
    public TreeNode bstFromPreorder(int[] preorder) {
        if(preorder.length==0) return null;
        TreeNode root= null;
        for(int i=0;i<preorder.length;i++){
            root=insert(root,preorder[i]);
        }
        return root;  
    }
    public TreeNode insert(TreeNode node, int val){
        if(node==null){
            TreeNode root= new TreeNode(val);
            return root;
        }
        if(val>node.val){
        node.right=insert(node.right,val);
        }else{
            node.left=insert(node.left,val);
        }
        return node;
    }
}