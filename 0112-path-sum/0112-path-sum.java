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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null) return false;
        List<Integer> temp =  new ArrayList<>();
        dfs(root,0,temp,targetSum);
        return temp.size()!=0;
    }
    public void dfs(TreeNode root,int sum, List<Integer>temp,int targetSum){
        if(root==null) return;
       // path.add(root.val);
        sum+=root.val;
        if(root.left==null && root.right==null){
            if(sum==targetSum){
                temp.add(sum);
                return;
            }
        }else{
            dfs(root.left,sum,temp,targetSum);
            dfs(root.right,sum,temp,targetSum);
        }

       // path.remove(path.size()-1);
       // sum-=root.val; we dont need to do it because int is primitive and they are call by reference and in the prev level their old or that level value is intact
       //while we need to remove the path element because they r objects n they re call by value so to every level of recursion
       // their original ersion is sent and made chnages.

    }
}