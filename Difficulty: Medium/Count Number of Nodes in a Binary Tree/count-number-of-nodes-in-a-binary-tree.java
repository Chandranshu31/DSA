// User function Template for Java

class Solution {
    static int count=0;

    public static int countNodes(Node root) {
        if(root==null) return 0;
        return 1+countNodes(root.left)+countNodes(root.right);
    }
    
}