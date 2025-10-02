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
    int sum=0;

    public int sumNumbers(TreeNode root) {
       // List<List<Integer>> list = new ArrayList<>();
       int num=0;
        dfs(root,num);
       // int sum=0;
       // for(List<Integer> path:list){
           // int num=0;
          //  for(int i=0;i<path.size();i++){
             //   num=num*10+path.get(i);

          //  }
            //sum+=num;
        //}
        return sum;
        
    }
    public void dfs(TreeNode root,int num){
        if(root==null) return;
        num=num*10+root.val;
        if(root.left==null && root.right==null){
            sum+=num;
        }else{
                dfs(root.left,num);
                dfs(root.right,num);
        }

        num=0;
    }
}