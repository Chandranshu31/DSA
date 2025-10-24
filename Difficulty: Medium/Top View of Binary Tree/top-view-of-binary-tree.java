/*
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
*/

class Solution {
    public static class info{
        int hd;
        Node node;
        public info(int hd, Node node){
            this.hd=hd;
            this.node=node;
        }
    }
    // Function to return a list of nodes visible from the top view
    // from left to right in Binary Tree.
    static ArrayList<Integer> topView(Node root) {
        if(root==null) return new ArrayList<>();
        
        TreeMap<Integer,Node> map = new TreeMap<>();
        Queue<info> q = new LinkedList<>();
        q.add(new info(0,root));
        while(!q.isEmpty()){
            int levelSize=q.size();
            for(int i=0;i<levelSize;i++){
                info curr=q.remove();
                if(!map.containsKey(curr.hd)){
                    map.put(curr.hd,curr.node);
                }
                if(curr.node.left!=null){
                    q.add(new info(curr.hd-1,curr.node.left));
                }
                if(curr.node.right!=null){
                    q.add(new info(curr.hd+1,curr.node.right));
                }
            }
        }
         ArrayList<Integer> res = new ArrayList<>();
        for (Node n : map.values()) {
            res.add(n.data);
        }
        return res;
        
      
    
        
        
    }
}