// class Node
// {
//     int data;
//     Node left, right;

//     public Node(int d)
//     {
//         data = d;
//         left = right = null;
//     }
// }

class Solution {
    static int maxBST=0;
    static class info{
        boolean isBST;
        int size;
        int min;
        int max;
        public info(boolean isBST, int size, int min, int max){
            this.isBST=isBST;
            this.size=size;
            this.min=min;
            this.max=max;
        }
    }
    public static info findLargestBST(Node root){
        if(root==null) return new info(true,0,Integer.MAX_VALUE,Integer.MIN_VALUE);
        
        info leftInfo=findLargestBST(root.left);
        info rightInfo=findLargestBST(root.right);
        
        // now we have left Info and right info
        int size=leftInfo.size+rightInfo.size+1;
        int min=Math.min(root.data,Math.min(leftInfo.min,rightInfo.min));
        int max=Math.max(root.data,Math.max(leftInfo.max,rightInfo.max));
        
        // nowchck wether root is bst or not
        if(root.data<=leftInfo.max || root.data>=rightInfo.min){
            return new info(false,size,min,max);
        }
        // now we have checked that it is a bstnow update maxsize if left and right subtree of root are also bsts
        if(leftInfo.isBST&& rightInfo.isBST){
            maxBST=Math.max(maxBST,size);
            return new info(true,size,min,max);
        }
        // if not
        return new info(false,size,min,max);
    }

    // Return the size of the largest sub-tree which is also a BST
    static int largestBst(Node root) {
        // Write your code here
        maxBST=0;
        findLargestBST(root);
        return maxBST;
        
    }
}