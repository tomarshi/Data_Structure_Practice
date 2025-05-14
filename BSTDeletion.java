public class BSTDeletion {
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
    public static Node delete(Node root,int val) {
        if(root.data>val) {
            root.left=delete(root.left,val);
        }
        else if(root.data<val) {
            root.right=delete(root.right,val);
        }
        else {
            if(root.left==null&&root.right==null) {
                return null;
            }
            if(root.lrft==null){
                return root.right;
            }
            else if(root.right==null) {
                return root.left;
            }
            Node IS=findIS(root.right);
            root.data=IS.data;
            root.right=delete(root.right,IS.data);
        }
        return root;
    }
    public static Node findIS(Node root) {
        while(root.left!=null) {
            root=root.left;
        }
        return root;
    }
}