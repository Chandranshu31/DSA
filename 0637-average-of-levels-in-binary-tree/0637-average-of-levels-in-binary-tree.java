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
    public List<Double> averageOfLevels(TreeNode root) {
        ArrayList<Double> ans= new ArrayList<>();

        if(root==null){
            return ans; //empty list
        }

        Queue<TreeNode> q= new LinkedList<>();

        q.add(root);

        while(!q.isEmpty()){
            int levelSize=q.size();
            double sum=0;  //Reset sum to 0 for the current level

            for(int i=0;i<levelSize;i++){
                TreeNode current=q.remove();

                sum+=current.val;

                if(current.left!=null){
                    q.add(current.left);
                }

                if(current.right!=null){
                    q.add(current.right);
                }
            }
            ans.add(sum/levelSize);  /// after every level
        }

        return ans;
        
    }
}