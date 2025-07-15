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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root==null){
            return result; // empty list
        }
        Queue<TreeNode> q=new LinkedList<>();
        boolean leftToRight=true;  // because for root, it begins left to right then right to left at level 2 and so on

        q.add(root);

        while(!q.isEmpty()){
            int levelSize=q.size();
            List<Integer> levelNodes= new ArrayList<>();  // to store nodes of a particular level

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
            if(!leftToRight){  
                Collections.reverse(levelNodes);
            } 
            result.add(levelNodes);

            leftToRight=!leftToRight; // after each level change the bool flag to get the result in reversed order
        }
        return result;
        
    }
}