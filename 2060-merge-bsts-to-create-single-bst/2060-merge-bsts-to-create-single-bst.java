

public class Solution {

    public TreeNode canMerge(List<TreeNode> trees) {
        Map<Integer, TreeNode> valToNode = new HashMap<>();
        Map<Integer, Integer> count = new HashMap<>();

        // STEP 1: Map each root value → full tree
        // and count how many times each value appears overall
        for (TreeNode tree : trees) {
            valToNode.put(tree.val, tree);  // map root value to its tree
            count.put(tree.val, count.getOrDefault(tree.val, 0) + 1);

            if (tree.left != null)
                count.put(tree.left.val, count.getOrDefault(tree.left.val, 0) + 1);
            if (tree.right != null)
                count.put(tree.right.val, count.getOrDefault(tree.right.val, 0) + 1);
        }

        // STEP 2: Identify the only possible global root
        // -> the root whose value appears only once
        TreeNode root = null;
        for (TreeNode tree : trees) {
            if (count.get(tree.val) == 1) {
                root = tree;
                break;
            }
        }
        if (root == null) return null;  // no valid root found

        // STEP 3: Merge all possible trees into one starting from root
        mergeTree(root, valToNode);

        // STEP 4: Validate if final tree is a valid BST and uses all nodes
        // To ensure all nodes are used, we can check by inorder traversal
        Set<Integer> used = new HashSet<>();
        if (!isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE, used))
            return null;

        // Ensure we used all nodes (no leftover subtrees)
        if (used.size() != count.size()) return null;

        return root;
    }

   private TreeNode mergeTree(TreeNode node, Map<Integer, TreeNode> valToNode) {
    if (node == null) return null;

    if (node.left != null && valToNode.containsKey(node.left.val)) {
        TreeNode leftSubtree = valToNode.remove(node.left.val);
        node.left = mergeTree(leftSubtree, valToNode);
    }

    if (node.right != null && valToNode.containsKey(node.right.val)) {
        TreeNode rightSubtree = valToNode.remove(node.right.val);
        node.right = mergeTree(rightSubtree, valToNode);
    }

    return node;
}


    // validate BST using inorder range checking + record visited nodes
    private boolean isValidBST(TreeNode node, long min, long max, Set<Integer> used) {
        if (node == null) return true;
        if (node.val <= min || node.val >= max) return false;
        used.add(node.val);
        return isValidBST(node.left, min, node.val, used)
            && isValidBST(node.right, node.val, max, used);
    }
}
