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
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> q= new LinkedList<>();

        q.add(root);
        

        int leftBottomValue=root.val;

        while(!q.isEmpty()){

            int levelSize=q.size();

            for(int i=0;i<levelSize;i++){
                TreeNode curr=q.remove();


                if(i==0){ 
                    leftBottomValue=curr.val;  // it will add very first Node at every level to it,and end up adding the leftMost value of bottom level

                }

                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
        
        }
        return leftBottomValue;
    }
}


/**

if ques is for bottom right then simple check conditions with
if(i==size-1) */