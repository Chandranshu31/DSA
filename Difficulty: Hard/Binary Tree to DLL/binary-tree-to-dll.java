class Solution {
    Node prev = null;
    Node head = null;

    Node bToDLL(Node root) {
        inorder(root);
        return head;
    }

    void inorder(Node root) {
        if (root == null) return;

        inorder(root.left);

        // Process current node
        if (prev == null) {
            head = root;          // first node becomes DLL head
        } else {
            root.left = prev;     // prev ← current
            prev.right = root;    // prev → current
        }

        prev = root;              // move prev forward

        inorder(root.right);
    }
}
