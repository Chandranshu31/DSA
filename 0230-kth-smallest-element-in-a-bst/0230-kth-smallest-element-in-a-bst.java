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
    public int kthSmallest(TreeNode root, int k) {
        if(root==null) return -1;
        int res[]=new int[1];
        int count[]= new int[1];
        inOrder(root,k,res,count);
        return res[0];
    }
    public void inOrder(TreeNode root,int k, int res[],int count[]){
        if(root==null) return;

        inOrder(root.left, k, res, count);
        count[0]++;
        if(count[0]==k){
            res[0]=root.val;
            return;
        }
        inOrder(root.right,k,res,count);
    }
}