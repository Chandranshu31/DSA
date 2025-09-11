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
    public int minDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
       
       Queue<TreeNode> q= new LinkedList<>();
       q.add(root);
       int depth=1; // because of first node

       while(!q.isEmpty()){
        int levelSize=q.size();
        for(int i=0;i<levelSize;i++){
            TreeNode curr= q.remove();

            if(curr.left==null&&curr.right==null){  // the moment u get  a leaf node thas the min depth
                return depth;
            }

            if(curr.left!=null){
                q.add(curr.left);
            }
            if(curr.right!=null){
                q.add(curr.right);
            }
        }
        depth++; // incrrease the depth after everylevel
       }
      return 0;  //  Only executes if root is null or tree is empty
        
    }
}