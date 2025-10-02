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
 // A BRUTE FORCE APPROACH WHERE WE GENERATE ALL THE ROOT TO LEAF PATH AND THEN CHECK WETHER THE VALUES ADD UPTO THE TARGET SUM OR NOT
class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> list = new ArrayList<>();
        dfs(root,new ArrayList<>(),list);
        List<List<Integer>> res = new ArrayList<>();
        for(List<Integer> path: list){
            int sum=0;
            for(int num:path){
                sum+=num;
            }
            if(sum==targetSum){
                res.add(new ArrayList<>(path));
            }
        }
        return res;
    }
    public void dfs(TreeNode root, List<Integer> path, List<List<Integer>> list){
        if(root==null) return;
        path.add(root.val);
        if(root.left==null && root.right==null){
            list.add(new ArrayList<>(path));
        }else{
            dfs(root.left,path,list);
            dfs(root.right,path,list);
        }
        path.remove(path.size()-1);

    }
}