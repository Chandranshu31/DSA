/*Complete the function below
Node is as follows:
class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}
*/
class Solution {
    public Node deleteNode(Node root, int k) {
        // add code here.
        if(root==null) return null;
        if(root.data>=k){
            return deleteNode(root.left,k);
        }
        root.right=deleteNode(root.right,k);
        return root;
    }
}