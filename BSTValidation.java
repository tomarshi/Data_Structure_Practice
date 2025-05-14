public class BSTValidation {
     static class Node {
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data=data;
        }
    }
    public static Node insert(Node root,int val) {
        if(root==null) {
            root=new Node(val);
            return root;
        }
        if(root.data>val) {
            root.left=insert(root.left,val);
        } else {
            root.right=insert(root.right,val);
        }
        return root;
    }
    public static boolean isBST(Node root,Node min,Node max) {
        if(root==null) {
            return true;
        } 
        if(min!=null&&rott.data<=min.data) {
            return false;
        } 
        if(max!=null&&root.data>=max.data) {
            return false;
        }
        return isBST(root.left,min,root)&&isBST(root.right,root,max);  
}