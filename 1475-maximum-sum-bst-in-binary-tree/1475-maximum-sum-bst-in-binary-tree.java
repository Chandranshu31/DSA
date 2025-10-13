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
    int maxSum=0;
     class info{
        boolean isBST;
        int sum;
        int min;
        int max;
        public info(boolean isBST, int sum, int min, int max){
            this.isBST=isBST;
            this.sum=sum;
            this.min=min;
            this.max=max;
        }
    }
    public info maxBSTsum(TreeNode root){
        if(root==null) return new info(true,0,Integer.MAX_VALUE,Integer.MIN_VALUE);

        info leftInfo=maxBSTsum(root.left);
        info rightInfo=maxBSTsum(root.right);

        // now we have left info and right info so calculate details
        int sum=leftInfo.sum+rightInfo.sum+root.val;
        int min=Math.min(root.val,Math.min(leftInfo.min,rightInfo.min));
        int max=Math.max(root.val,Math.max(leftInfo.max,rightInfo.max));

        // now check wether root's value is considerable forbeing  bst or not
        if(root.val<=leftInfo.max || root.val>=rightInfo.min){
            return new info(false,sum,min,max);
        }// now the root is a bst
        // and now we need to update max sum if its left and right subtrees r also bst
        if(leftInfo.isBST && rightInfo.isBST){
            maxSum=Math.max(sum,maxSum);
            return new info(true,sum,min,max); // to upper level if exists
        }
        // if not then return false
        return new info(false,sum,min,max); // case when either of left or right subtree of a node is not a bst
    }
    public int maxSumBST(TreeNode root) {
        maxBSTsum(root);
        return maxSum;
    }
    
}