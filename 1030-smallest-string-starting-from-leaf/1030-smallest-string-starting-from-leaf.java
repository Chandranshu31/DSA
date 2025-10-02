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
    String smallest;
    public String smallestFromLeaf(TreeNode root) {
        
       
       smallest="~"; // it is greater than z
       dfs(root, new StringBuilder());
    
       return smallest;
    }
    public void dfs(TreeNode root, StringBuilder sb){
        if(root==null) return;
        char c=(char) ('a'+root.val);  // numb to char
        int len=sb.length();
        sb.append(c);
        if(root.left==null && root.right==null){
           String currString=new StringBuilder(sb).reverse().toString();
           if(currString.compareTo(smallest)<0){
            smallest=currString;
           }
         }else{
              dfs(root.left,sb);
              dfs(root.right,sb);
        }
        sb.setLength(len); // backtrack, i.e remove the prev one
    }
}