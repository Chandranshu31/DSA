/*Complete The given function
The Node class is as follows:
class Node{
    int data;
    Node left,right;

    Node(int d)
     {
      data=d;
      left=null;
      right=null;
    }
}*/
class Solution {
    public ArrayList<Integer> extremeNodes(Node root) {
        if(root==null) return new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        ArrayList<Integer> res = new ArrayList<>();
        q.add(root);
        boolean rightToLeft=true;
        while(!q.isEmpty()){
            int levelSize=q.size();
            ArrayList<Integer> levelNodes = new ArrayList<>();
            
            for(int i=0;i<levelSize;i++){
                Node curr=q.remove();
                levelNodes.add(curr.data);
                if(curr.left!=null) q.add(curr.left);
                if(curr.right!=null) q.add(curr.right);
            }
            
            if(levelNodes.size()==1){
                res.add(levelNodes.get(0));
                //rightToLeft=!rightToLeft;
            }else{
                if(rightToLeft) res.add(levelNodes.get(levelNodes.size()-1));
                else res.add(levelNodes.get(0));
            }
            rightToLeft=!rightToLeft;
            
            
        }
        return res;
    }
}