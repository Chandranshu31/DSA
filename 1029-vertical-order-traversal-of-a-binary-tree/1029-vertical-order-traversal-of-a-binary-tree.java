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
    public class info {
        int hd;
        TreeNode node;
        public info(int hd, TreeNode node){
            this.hd = hd;
            this.node = node;
        }
    }

    public List<List<Integer>> verticalTraversal(TreeNode root) {
        if(root == null) return new ArrayList<>(); // fixed

        
        TreeMap<Integer, ArrayList<Integer>> map = new TreeMap<>();
        Queue<info> q = new LinkedList<>();
        q.add(new info(0, root));

        while(!q.isEmpty()) {
            int size = q.size();
            // temp map to store nodes at the same level for sorting by value and this would also insure the sorting by row that is same hd the one apepars at op would be first
            HashMap<Integer, ArrayList<Integer>> levelMap = new HashMap<>();

            for(int i = 0; i < size; i++) {
                info curr = q.remove();

                levelMap.putIfAbsent(curr.hd, new ArrayList<>());
                levelMap.get(curr.hd).add(curr.node.val);

                if(curr.node.left != null) q.add(new info(curr.hd - 1, curr.node.left));
                if(curr.node.right != null) q.add(new info(curr.hd + 1, curr.node.right));
            }

            // merge levelMap into main map
            for(int hd : levelMap.keySet()) {
                Collections.sort(levelMap.get(hd)); // sort nodes at same level & hd
                map.putIfAbsent(hd, new ArrayList<>());
                map.get(hd).addAll(levelMap.get(hd));
            }
        }

        List<List<Integer>> res = new ArrayList<>();
        for(List<Integer> list : map.values()) {
            res.add(list);
        }

        return res;
    }
}
