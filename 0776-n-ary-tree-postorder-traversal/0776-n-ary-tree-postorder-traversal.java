/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
*/

class Solution {
    public List<Integer> postorder(Node root) {
        ArrayList<Integer> res = new ArrayList<>();
        post(root,res);
        return res;
    }
    public void post(Node root,ArrayList<Integer> res){
        if(root==null){
            return;
        }
        for(Node child: root.children){  // iterate over the list of children a single node has and call post for them
            post(child,res);
        }
        res.add(root.val);  // at the end add the value of root to list

     

    }
}