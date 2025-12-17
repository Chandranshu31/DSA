/*
class Node {
    int data;
    Node left, right;

    public Node(int val)
    {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    public ArrayList<Integer> merge(Node root1, Node root2) {
    
        ArrayList<Integer> list1= new ArrayList<Integer>();
         ArrayList<Integer> list2= new ArrayList<Integer>();
         inorder(root1,list1);
         inorder(root2,list2);
         ArrayList<Integer> merged= merge(list1,list2);
         return merged; // just return the merged sroted array
         
 

        
    }
    public void inorder(Node root, ArrayList<Integer> list){
        if(root==null) return;
        inorder(root.left,list);
        list.add(root.data);
        inorder(root.right,list);
    }
    public ArrayList<Integer> merge(ArrayList<Integer>list1, ArrayList<Integer>list2){
        int i=0,j=0;
        ArrayList<Integer> merged = new ArrayList<>();
        while(i<list1.size()&& j<list2.size()){
            if(list1.get(i)<=list2.get(j)){
                merged.add(list1.get(i));
                i++;
            }else{
                merged.add(list2.get(j));
                j++;
            }
        }
        while(i<list1.size()){
            merged.add(list1.get(i));
            i++;
        }
        while(j<list2.size()){
            merged.add(list2.get(j));
            j++;
        }
        return merged;
    }
}