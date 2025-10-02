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
        char c=(char) ('a'+root.val);  // numb to char
        int len=sb.length();
        sb.append(c);
        if(root.left==null && root.right==null){
            temp.add(new StringBuilder(sb).reverse().toString()); // always add new sb as if we reverse the original one then it would get reversed for rest of the operations as well
        }else{
              dfs(root.left,sb,temp);
              dfs(root.right,sb,temp);
        }
        sb.setLength(len); // backtrack, i.e remove the prev one
    }
}