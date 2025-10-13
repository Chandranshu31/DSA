// User function Template for Java

/*class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
} */
class Solution {
    static int sum=0;
    public static void transformTree(Node root) {
        // code here
        sum=0;
        dfs(root);
    }
   
     private static void dfs(Node root) {
        if (root == null) return;

        // visit right subtree first (greater values)
        dfs(root.right);

        // replace node's value with current sum (strictly greater)
        int original = root.data;
        root.data = sum;

        // update sum to include this node for next smaller nodes
        sum += original;

        // visit left subtree
        dfs(root.left);
    }
}