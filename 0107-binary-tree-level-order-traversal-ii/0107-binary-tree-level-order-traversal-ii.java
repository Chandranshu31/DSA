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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        
       List< List<Integer>> result = new ArrayList<>();
       if(root==null){
        return result;
       }
      
        Queue<TreeNode> q= new LinkedList<>();

        q.add(root);

        while(!q.isEmpty()){

          List<Integer> levelNodes= new ArrayList<>(); // list to store nodes of a particular level

            int levelSize=q.size();

            for(int i=0;i<levelSize;i++){

                TreeNode curr=q.remove();
                
                levelNodes.add(curr.val);

                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
            result.add(0,levelNodes); // in the result add every level at the front,this is how we do it.
        }

        
        return result;

        
    }
}