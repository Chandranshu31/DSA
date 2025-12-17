class Solution {
    static int minDiff(Node root, int K) {
        if (root == null) return Integer.MAX_VALUE;

        // Calculate diff at current node
        int minDiff = Math.abs(root.data - K);

        // Recur to left or right based on BST property
        if (K < root.data) {
            int leftDiff = minDiff(root.left, K);
            minDiff = Math.min(minDiff, leftDiff);
        } else if (K > root.data) {
            int rightDiff = minDiff(root.right, K);
            minDiff = Math.min(minDiff, rightDiff);
        }
        // else K == root.data, minDiff is already 0

        return minDiff;
    }
}