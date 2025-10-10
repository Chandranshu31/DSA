/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if(root==null) return null;
      //  root.next=null;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int levelSize=q.size();
            ArrayList<Node> levelNodes = new ArrayList<>();
            for(int i=0;i<levelSize;i++){
                Node curr=q.remove();
                levelNodes.add(curr);
                if(curr.left!=null) q.add(curr.left);
                if(curr.right!=null) q.add(curr.right);
            }
            if(levelNodes.size()==1){
                levelNodes.get(0).next=null;
            }else{
            
            for(int i=0;i<levelNodes.size()-1;i++){
                if(i==levelNodes.size()-1){
                    levelNodes.get(i).next=null;
                }
                levelNodes.get(i).next=levelNodes.get(i+1);
            }
            }

        }
        return root;
        
        
    }
}