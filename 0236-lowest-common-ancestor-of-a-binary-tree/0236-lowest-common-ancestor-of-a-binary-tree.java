/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null) return root;
        if(root.val==p.val|| root.val==q.val) return root;
        TreeNode leftLca= lowestCommonAncestor(root.left,p,q);
        TreeNode rightLca=lowestCommonAncestor(root.right,p,q);
        if(leftLca==null) return rightLca;
        if(rightLca==null) return leftLca;
        return root; // when both left and right lca r not null

        // lca is like when we look from bottom to up then very first node in which's subtrees(right or left) the two nodes exists
    }
}

/** class Solution { nodes may or maynot exist then find lca
    boolean foundN1 = false, foundN2 = false;

    Node lca(Node root, int n1, int n2) {
        Node ans = lcaSimple(root, n1, n2);
        return (foundN1 && foundN2) ? ans : null;
    }

    Node lcaSimple(Node root, int n1, int n2) {
        if (root == null) return null;
        if (root.data == n1) {
            foundN1 = true;
            return root;
        }
        if (root.data == n2) {
            foundN2 = true;
            return root;
        }

        Node left = lcaSimple(root.left, n1, n2);
        Node right = lcaSimple(root.right, n1, n2);

        if (left != null && right != null) return root;
        return left != null ? left : right;
    }
}

lca of multiple nodes 
class Solution {
    Node lca(Node root, Set<Integer> nodes) {  if list given then convert it into the set
        if (root == null) return null;
        if (nodes.contains(root.data)) return root;

        Node left = lca(root.left, nodes);
        Node right = lca(root.right, nodes);

        if (left != null && right != null) return root;
        return left != null ? left : right;
    }
}

 */