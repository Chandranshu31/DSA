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
    HashMap<Integer,Integer> map = new HashMap<>();// to store sum and its freq
    int maxFreq=0; // we will update it thoroughly
    public int[] findFrequentTreeSum(TreeNode root) {
        if(root==null) return new int[0];

        getSubTreeSum(root); // its return values would be discarded as they r of no need
        ArrayList<Integer> temp = new ArrayList<>();
        for(int k: map.keySet()){ // add all maxfreq keys or sums inot list
            if(map.get(k)==maxFreq){
             temp.add(k);
            }
        }

        int res[]=new int[temp.size()]; // convert it into the array
        for(int i=0;i<res.length;i++){
            res[i]=temp.get(i);
        }
        return res;
        
    }

    public int getSubTreeSum(TreeNode root){
        if(root==null) return 0;

        int left=getSubTreeSum(root.left); // leftsubtrree sum
        int right=getSubTreeSum(root.right); // right subtree sum
  
        int currSum=left+right+root.val; // currsum including root
        map.put(currSum,map.getOrDefault(currSum,0)+1);  // update in map
        maxFreq=Math.max(maxFreq,map.get(currSum)); // update maxFreq

        return currSum; // return currsum to the upper level
    }
}