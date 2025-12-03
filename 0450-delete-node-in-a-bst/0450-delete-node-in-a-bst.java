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
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null) return null;
        if(root.val>key) root.left=deleteNode(root.left,key);
        else if(root.val<key) root.right=deleteNode(root.right,key);
        else{
            // root.val==key
            //case-I when the node which we want to del has no child
            if(root.left==null && root.right==null) return null;
            //case-II when the node which we want to del has only 1 child, either left or right
            if(root.left==null) return root.right;
            if(root.right==null) return root.left;

            // case-III when the node which we want to delete has two childs, both left and right
            /*In such cases we find the inorder successsor(left most child in right subtree of the given node) of the node
            which we want to delete and replace the value of node with IS.val and then delete the IS node... note that
            for a node with 2 childs, its IS will always have either 1 or 0 child */
            TreeNode IS=getIs(root.right);
            root.val=IS.val;
            root.right=deleteNode(root.right,IS.val);
        }
        return root;
    }
    public TreeNode getIs(TreeNode root){
        if(root==null) return null;
        while(root.left!=null) root=root.left;
        return root;
    }
        
  
}