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
    public String smallestFromLeaf(TreeNode root) {
        
       List<String> temp = new ArrayList<>();
       dfs(root, new StringBuilder(),temp);
       Collections.sort(temp) ;
       return temp.get(0);
    }
    public void dfs(TreeNode root, StringBuilder sb, List<String> temp){
        if(root==null) return;
        char c=(char) ('a'+root.val);
        int len=sb.length();
        sb.append(c);
        if(root.left==null && root.right==null){
            temp.add(new StringBuilder(sb).reverse().toString());
        }else{
              dfs(root.left,sb,temp);
              dfs(root.right,sb,temp);
        }
        sb.setLength(len);
    }
}