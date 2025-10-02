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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> res = new ArrayList<>();
        dfs(root,0,new ArrayList<>(),res,targetSum);
        return res;
        
    }
    public void dfs(TreeNode root,int sum, List<Integer> path, List<List<Integer>> list,int targetSum){
        if(root==null) return;
        path.add(root.val);
        sum+=root.val;
        if(root.left==null && root.right==null){
            if(sum==targetSum){
                list.add(new ArrayList<>(path));
            }
        }else{
            dfs(root.left,sum,path,list,targetSum);
            dfs(root.right,sum,path,list,targetSum);
        }
        path.remove(path.size()-1); // during backtrack remove current nodes val from path
       // sum-=root.val; // and subtract current root's val from sum also
       

    }
}