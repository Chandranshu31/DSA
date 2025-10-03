/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> closestNodes(TreeNode root, List<Integer> queries) {
        List<Integer> trav= new ArrayList<>();
        inorder(root,trav);
        // now trav stores all bst nodes in a sorted order
        List<List<Integer>> res = new ArrayList<>();
        for(int query:queries){
            List<Integer> temp = new ArrayList<>();
            //int min=-1;
           // int max=-1;
            int largest=-1; // largest val in trav that is <=query
            int smallest=-1; // smallest val in trav that is >=query

            int l=0, r=trav.size()-1;
            while(l<=r){
                int mid=l+(r-l)/2;
                if(trav.get(mid) <=query){ // if <=
                    largest=trav.get(mid);  // update largest
                    l=mid+1; // go in right to find a bigger val with this condition
                }else{
                    r=mid-1;
                }
            }
            l=0;
            r=trav.size()-1;

            while(l<=r){
                int mid=l+(r-l)/2;
                if(trav.get(mid)>=query){
                    smallest=trav.get(mid);
                    r=mid-1;
                }else{
                    l=mid+1;
                }
            }
            temp.add(largest);
            temp.add(smallest);
            res.add(temp);

           
        }
        return res;
    }
    public void inorder(TreeNode root, List<Integer> list){
        if(root==null) return;
        inorder(root.left,list);
        list.add(root.val);
        inorder(root.right,list);
    }
}