public class BSTMirroring {
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
    public static Node mirror(Node root) {
        if(root==null) {
            return null;
        }
        int left=mirror(root.left);
        int right=mirror(root.right);
        root.left=right;
        root.right=left;
        return root;

    }
}