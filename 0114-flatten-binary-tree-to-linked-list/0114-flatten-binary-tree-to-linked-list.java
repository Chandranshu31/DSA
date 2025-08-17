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
    
    public void flatten(TreeNode root) {

        if(root==null){
            return;
        }
        ArrayList<TreeNode> seq = new ArrayList<>();

        preOrder(root,seq);

        TreeNode current=root;
        for(int i=0;i<seq.size()-1;i++){   //flatteing steps.
            TreeNode next=seq.get(i+1);   // for a node, it(next) stores the next of that node(current) in preorder seq
            current.left=null;
            current.right=next;
            current=next;  // current ko aage bdha do,for the next NODE.
        }

        
    }

    public static void preOrder(TreeNode root,ArrayList<TreeNode>seq){
        if(root==null){
            return;
        }

        seq.add(root);
        preOrder(root.left,seq);
        preOrder(root.right,seq);
    }
}
/**
We just need to flatten the BT into LL by modifying in such a way that left of all the nodes
ponts to null and right of every node points to the next node in its preOrder sequence.
So,simply find the preorder seq and start performing these steps for each and every node, starting from root */