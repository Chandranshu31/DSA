class Solution {
    // Function to find the nodes that are common in both BST.
    public static ArrayList<Integer> findCommon(Node r1, Node r2) {
        TreeSet<Integer> r1Nodes = new TreeSet<>();
        TreeSet<Integer> r2Nodes= new TreeSet<>();
        inorder(r1,r1Nodes);
        inorder(r2,r2Nodes);
      //  HashSet<Integer> r2Set= new HashSet<>();
       // for(int num: r2Nodes){
         //   r2Set.add(num);
        //}
        
        ArrayList<Integer> res = new ArrayList<>();
        for(int num:r1Nodes){
            if(r2Nodes.contains(num)) res.add(num);
        }
        return res;
        
        
    }
    public static void inorder(Node root, TreeSet<Integer> res){
        if(root==null) return ;
        inorder(root.left,res);
        res.add(root.data);
        inorder(root.right,res);
    }
}