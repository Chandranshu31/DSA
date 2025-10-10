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
    HashMap<Integer,Integer> map= new HashMap<>();
    int highestFreq=0;
    public int[] findMode(TreeNode root) {
        if(root==null) return new int[0];
        dfs(root);
        ArrayList<Integer> temp = new ArrayList<>();
        for(int m: map.keySet()){
            if(map.get(m)==highestFreq){
                temp.add(m);
            }
        }
        int res[]=new int[temp.size()];
        for(int i=0;i<temp.size();i++){
            res[i]=temp.get(i);
        }
        return res;
        
    }
    public void dfs(TreeNode root){
        if(root==null) return;
        map.put(root.val,map.getOrDefault(root.val,0)+1);
        highestFreq=Math.max(highestFreq,map.get(root.val));
        dfs(root.left);
        dfs(root.right);
    }
}