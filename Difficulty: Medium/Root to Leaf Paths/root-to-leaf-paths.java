/*

Definition for Binary Tree Node
class Node
{
    int data;
    Node left;
    Node right;

    Node(int data)
    {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Solution {
    public static ArrayList<ArrayList<Integer>> Paths(Node root) {
        // code here
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        dfs(root,res,new ArrayList<>());
        return res;
    }
    public static void dfs(Node root, ArrayList<ArrayList<Integer>> res , ArrayList<Integer> path){
        if(root==null) return;
        path.add(root.data);
        if(root.left==null && root.right==null) res.add(new ArrayList<>(path));
        dfs(root.left,res,path);
        dfs(root.right,res,path);
        path.remove(path.size()-1);
    }
}