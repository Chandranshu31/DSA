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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        dfs(root,new StringBuilder(),res);
        return res;
    }
    public static void dfs(TreeNode root,StringBuilder sb,List<String> res){
        if(root==null) return;
        int len=sb.length();
        sb.append(root.val);
        
        if(root.left==null && root.right==null){
            res.add(sb.toString());
        }else{
            sb.append("->");
            dfs(root.left,sb,res);
            dfs(root.right,sb,res);
        }

        sb.setLength(len);
    }
}