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
    public int maxLevelSum(TreeNode root) {
        if(root==null) return 0;
        int maxLevelSum=Integer.MIN_VALUE;
        int level=0;
        int smallestLevel=level;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int levelSize=q.size();
            int levelSum=0;
            for(int i=0;i<levelSize;i++){
                TreeNode curr=q.poll();
                levelSum+=curr.val;
                if(curr.left!=null) q.offer(curr.left);
                if(curr.right!=null) q.offer(curr.right);
            }
            level++;
            if(maxLevelSum<levelSum){
                maxLevelSum=levelSum;
                 smallestLevel=level;
            }
        }
        return smallestLevel;
    }
}