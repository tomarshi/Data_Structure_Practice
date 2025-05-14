public class BSTSearch {
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
    public static boolean search(Node root,int key) {
        if(root==null) {
            return false;
        }
        if(root.data==key) {
            return true;
        }
        if(root.data>key) {
            return search(root.left,key);
        }
        else {
            return search(root.right,key);
        }
        return false;
    }
    public static void main(String[] args) {
        int nodes[]={5,3,1,-1,-1,4,-1,-1,7,6,-1,-1,8,-1,-1};
        Node root=null;
        for(int i=0;i<nodes.length;i++) {
            root=insert(root,nodes[i]);
        }
        int key=4;
        boolean found=search(root,key);
        if(found) {
            System.out.println("Key "+key+" found in the BST.");
        } else {
            System.out.println("Key "+key+" not found in the BST.");
        }
    }
}