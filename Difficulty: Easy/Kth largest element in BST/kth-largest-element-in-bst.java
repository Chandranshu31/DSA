/*
class Node
{
    int data;
    Node left;
    Node right;
    Node(int data)
    {
        this.data = data;
        left=null;
        right=null;
    }
}
*/
class Solution {
    // return the Kth largest element in the given BST rooted at 'root'
    public int kthLargest(Node root, int k) {
        // Your code here
        ArrayList<Integer> temp = new ArrayList<>();
        inorder(root,temp);
        return temp.get(temp.size()-k);
        
    }
    public void inorder(Node root, ArrayList<Integer> res){
        if(root==null) return;
        inorder(root.left,res);
        res.add(root.data);
        inorder(root.right,res);
    }
}