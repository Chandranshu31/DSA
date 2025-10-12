/*
class Node {
    int data;
    Node left;
    Node right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    public boolean isBST(Node root) {
        return isValid(root,null,null);
        
    }
      public boolean isValid(Node root, Node max, Node min){
        if(root==null) return true;

        if(min!=null && root.data<=min.data) return false;
        if(max!=null && root.data>=max.data) return false;

        return isValid(root.left,root,min) && isValid(root.right,max,root);
    }
}