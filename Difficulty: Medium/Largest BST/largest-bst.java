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
        int max;
        int min;
        public info(boolean isBST, int size, int max, int min){
            this.isBST=isBST;
            this.size=size;
            this.max=max;
            this.min=min;
        }
    }

    // Return the size of the largest sub-tree which is also a BST
    static int largestBst(Node root) {
        // Write your code here
        maxBST=0;
        largestBST(root);
        return maxBST;
        
        
    }
    public static info largestBST(Node root){
        if(root==null) return new info(true,0,Integer.MIN_VALUE,Integer.MAX_VALUE);
        
        info leftInfo=largestBST(root.left);
        info rightInfo= largestBST(root.right);
        
        int size=leftInfo.size+rightInfo.size+1;
        int max=Math.max(root.data,Math.max(leftInfo.max,rightInfo.max));
        int min=Math.min(root.data,Math.min(leftInfo.min,rightInfo.min));
        
        if((root.data<=leftInfo.max) || (root.data>=rightInfo.min)){
            return new info(false,size,max,min);
        }
        
        if(leftInfo.isBST && rightInfo.isBST){
            maxBST=Math.max(maxBST,size);
            return new info(true,size,max,min);
        }
        return new info(false,size,max,min);
    
    }
}