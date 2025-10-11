class Solution {
    public static ArrayList<Integer> printNearNodes(Node root, int low, int high) {
        ArrayList<Integer> res = new ArrayList<>();
        dfs(root, low, high, res);
        return res;
    }

    private static void dfs(Node root, int low, int high, ArrayList<Integer> res) {
        if (root == null) return;

        // Left subtree only if values could be >= low
        if (root.data > low) dfs(root.left, low, high, res);

        // Current node in range
        if (root.data >= low && root.data <= high) res.add(root.data);

        // Right subtree only if values could be <= high
        if (root.data < high) dfs(root.right, low, high, res);
    }
}
