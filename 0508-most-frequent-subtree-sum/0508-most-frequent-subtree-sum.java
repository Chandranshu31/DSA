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
    HashMap<Integer,Integer> map = new HashMap<>();
    int maxFreq=0;
    public int[] findFrequentTreeSum(TreeNode root) {
        if(root==null) return new int[0];

        getSubTreeSum(root);
        ArrayList<Integer> temp = new ArrayList<>();
        for(int k: map.keySet()){
            if(map.get(k)==maxFreq){
             temp.add(k);
            }
        }

        int res[]=new int[temp.size()];
        for(int i=0;i<res.length;i++){
            res[i]=temp.get(i);
        }
        return res;
        
    }

    public int getSubTreeSum(TreeNode root){
        if(root==null) return 0;

        int left=getSubTreeSum(root.left);
        int right=getSubTreeSum(root.right);

        int currSum=left+right+root.val;
        map.put(currSum,map.getOrDefault(currSum,0)+1);
        maxFreq=Math.max(maxFreq,map.get(currSum));

        return currSum;
    }
}