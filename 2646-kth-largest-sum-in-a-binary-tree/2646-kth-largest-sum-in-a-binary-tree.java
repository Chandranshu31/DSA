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
    public long kthLargestLevelSum(TreeNode root, int k) {
        if(root==null) return 0;
        Queue<TreeNode> q = new LinkedList<>();
       // long levelSum=0;
        ArrayList<Long> list = new ArrayList<>();
        q.add(root);
        while(!q.isEmpty()){
            int levelSize=q.size();
            long levelSum=0;
            for(int i=0;i<levelSize;i++){
                TreeNode curr=q.remove();
                levelSum+=curr.val;
                if(curr.left!=null) q.add(curr.left);
                if(curr.right!=null) q.add(curr.right);
            }
            list.add(levelSum);
        }
        Collections.sort(list);
        if(k<=list.size()){
            return list.get(list.size()-k);
        }else{
            return -1;
        }
        
    }
} 

/** can also be done using a PQ
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
 /* 
class Solution {
    public long kthLargestLevelSum(TreeNode root, int k) {
        if(root==null) return 0;
        Queue<TreeNode> q = new LinkedList<>();
       // long levelSum=0;
        PriorityQueue<Long> pq = new PriorityQueue<>(Collections.reverseOrder());
        q.add(root);
        while(!q.isEmpty()){
            int levelSize=q.size();
            long levelSum=0;
            for(int i=0;i<levelSize;i++){
                TreeNode curr=q.remove();
                levelSum+=curr.val;
                if(curr.left!=null) q.add(curr.left);
                if(curr.right!=null) q.add(curr.right);
            }
            pq.add(levelSum);
        }
       // Collections.sort(list);
        if(k<=pq.size()){
            long res=-1;
            for(int i=0;i<k;i++){
                res=pq.remove();
            }
            return res;
        }else{
            return -1;
        }
        
    }
} */