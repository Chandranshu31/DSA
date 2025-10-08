class Solution {
    int maxDiff = Integer.MIN_VALUE;

    int maxDiff(Node root) {
        helper(root);
        return maxDiff;
    }

    // Returns min value in the subtree rooted at 'node'
    int helper(Node node) {
        if (node == null)
            return Integer.MAX_VALUE;

        // If it's a leaf node, just return its own value
        if (node.left == null && node.right == null)
            return node.data;

        // Find min in left and right subtrees
        int leftMin = helper(node.left);
        int rightMin = helper(node.right);

        // Smallest value among descendants
        int minDescendant = Math.min(leftMin, rightMin);

        // Update max difference using current node as ancestor
        maxDiff = Math.max(maxDiff, node.data - minDescendant);

        // Return minimum value in this subtree
        return Math.min(node.data, minDescendant);
    }
}
