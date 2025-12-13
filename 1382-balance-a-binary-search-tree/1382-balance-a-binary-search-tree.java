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
    public TreeNode balanceBST(TreeNode root) {
        if(root==null) return null;
        ArrayList<Integer> temp = new ArrayList<>();
        inorder(root,temp);
        return createBalancedBST(temp,0,temp.size()-1);
        
    }
    public void inorder(TreeNode root,ArrayList<Integer> temp){
        if(root==null) return;
        inorder(root.left,temp);
        temp.add(root.val);
        inorder(root.right,temp);
    }
    public TreeNode createBalancedBST(ArrayList<Integer> temp,int start,int end){
        if(temp.size()==0) return null;
        if(start>end)return null;
        int mid=start+(end-start)/2;
        TreeNode root=new TreeNode(temp.get(mid));
        root.left=createBalancedBST(temp,start,mid-1);
        root.right=createBalancedBST(temp,mid+1,end);
        return root;
    }
}