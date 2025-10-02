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
    int sum=0;

    public int sumNumbers(TreeNode root) {
        int num=0;
        dfs(root,num);
        return sum;
        
    }
    public void dfs(TreeNode root,int num){
        if(root==null) return;
        num=num*10+root.val; // generate num or that is the numbeer formed from a single root to leaf path
        if(root.left==null && root.right==null){ // leaf node reached
            sum+=num; // add it to the sum
        }else{ // if leaf not reached explore the left and right subtrees
                dfs(root.left,num); 
                dfs(root.right,num);
        }

        
    }
}