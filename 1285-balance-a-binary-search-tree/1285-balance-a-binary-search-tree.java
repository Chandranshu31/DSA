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

        ArrayList<Integer> ans= new ArrayList<>();
        inorder(root,ans); // now ans stores the sorted seq.

        return createBalancedBST(ans,0,ans.size()-1);
        
    }

    public static TreeNode createBalancedBST(ArrayList<Integer> ans, int start,int end){  // create balanced bst from sorted seq
        if(start>end){
            return null;
        }

        
            int mid=start+(end-start)/2;

            TreeNode root= new TreeNode(ans.get(mid));
            root.left=createBalancedBST(ans,start,mid-1);
            root.right=createBalancedBST(ans,mid+1,end);
   
        
         return root;

    }


    public static void inorder(TreeNode root, ArrayList<Integer> ans){  // get sorted seq for bst by inorder traversal
        if(root==null){
            return;
        }

        inorder(root.left,ans);
        ans.add(root.val);
        inorder(root.right,ans);
    }
}

/**
We know how to make a blanced bst from sorted array, so first of all simply find the sorted seq of BST, whch is inorder seq
and then make a bst from that sorted seq,as usual. */