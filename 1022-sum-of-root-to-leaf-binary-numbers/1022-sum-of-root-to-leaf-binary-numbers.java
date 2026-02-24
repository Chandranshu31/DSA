class Solution {
    public int sumRootToLeaf(TreeNode root) {
        return dfs(root, new StringBuilder());
    }
    
    private int dfs(TreeNode node, StringBuilder sb) {
        if (node == null) return 0;
        
        // Append current bit
        sb.append(node.val);
        
        int sum = 0;
        
        // If leaf → convert binary string to integer
        if (node.left == null && node.right == null) {
            sum = Integer.parseInt(sb.toString(), 2);
        } else {
            sum = dfs(node.left, sb) + dfs(node.right, sb);
        }
        
        // Backtrack
        sb.deleteCharAt(sb.length() - 1);
        
        return sum;
    }
}