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

    public int sumNumbers(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        dfs(root,new ArrayList<>(),list);
        int sum=0;
        for(List<Integer> path:list){
            int num=0;
            for(int i=0;i<path.size();i++){
                num=num*10+path.get(i);

            }
            sum+=num;
        }
        return sum;
        
    }
    public void dfs(TreeNode root,List<Integer> path,List<List<Integer>> list){
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