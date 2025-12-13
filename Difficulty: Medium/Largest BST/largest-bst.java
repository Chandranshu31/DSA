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
    static int maxSize=0;
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
   

    // Return the size of the largest sub-tree which is also a BST
    static int largestBst(Node root) {
        maxSize=0;
        largestBST(root);
        return maxSize;
        
    }
    public static  info largestBST(Node root){
        if(root==null) return new info(true,0,Integer.MAX_VALUE,Integer.MIN_VALUE);
        info leftInfo=largestBST(root.left);
        info rightInfo=largestBST(root.right);
        
        int size=leftInfo.size+rightInfo.size+1;
        int min=Math.min(root.data,Math.min(leftInfo.min,rightInfo.min));
        int max=Math.max(root.data,Math.max(leftInfo.max,rightInfo.max));
        
        if(root.data<=leftInfo.max || root.data>=rightInfo.min){
            return new info(false,size,min,max);
        }
        if(leftInfo.isBST && rightInfo.isBST){
            maxSize=Math.max(size,maxSize);
            return new info(true,size,min,max);
        }
        return new info(false,size,min,max);
    }
}