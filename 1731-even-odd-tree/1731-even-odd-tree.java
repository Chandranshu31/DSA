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
    public boolean isEvenOddTree(TreeNode root) {
        if (root == null) return true;

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int level = 0;

        while (!q.isEmpty()) {
            int size = q.size();
            int prevVal = (level % 2 == 0) ? Integer.MIN_VALUE : Integer.MAX_VALUE; 

            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();
                int val = node.val;

                // check value parity
                if (level % 2 == 0 && val % 2 == 0) return false; // even value on even level
                if (level % 2 == 1 && val % 2 == 1) return false; // odd value on odd level

                // check ordering
                if (level % 2 == 0 && val <= prevVal) return false; // if level is even and currval is less than prev so its decreasing threfore return false
                if (level % 2 == 1 && val >= prevVal) return false; // if level is odd and curr val is greater than prev then increasing so return false

                prevVal = val; 

                if (node.left != null) q.offer(node.left);
                if (node.right != null) q.offer(node.right); 
            }

            level++; 
        }

        return true;
    }
}
