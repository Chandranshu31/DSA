// User function Template for Java

/*
class Node {
    int data;
    Node left, right;

    Node(int d) {
        data = d;
        left = right = null;
    }
}
*/

class Solution {
    // Function that constructs BST from its preorder traversal.
    public Node Bst(int pre[], int size) {
        if(size==0) return null;
        Node root= new Node(pre[0]);
        for(int i=1;i<size;i++){
            insert(root,pre[i]);
        }
        return root;
        // code here
        
    }
   public Node insert(Node root, int val) {
    if (root == null) return new Node(val);

    if (val <= root.data) {
        root.left = insert(root.left, val);
    } else {
        root.right = insert(root.right, val);
    }

    return root;
}

}