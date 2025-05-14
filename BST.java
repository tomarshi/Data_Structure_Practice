public class BST {
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
    public static void main(String[] args) {
        int nodes[]={5,3,1,-1,-1,4,-1,-1,7,6,-1,-1,8,-1,-1};
        Node root=null;
        for(int i=0;i<nodes.length;i++) {
            root=insert(root,nodes[i]);
        }
        System.out.println("Binary Search Tree created successfully.");
    }
}