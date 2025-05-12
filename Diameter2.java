public class Diameter2 {
     static class Node {
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static class BinaryTree {
        static int indx=0;
        public static Node buildTree(int nodes[]) {
            idx++;
            if(nodes[idx]==-1) {
                return null;
            }
            Node newNode =new Node(nodes[idx]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);
            return newNode;
        }
    }
    static class Info {
        int dia;
        int ht;
        Diameter2(int dia,int ht) {
            this.dia=dia;
            this.ht=ht;
        }
    }
    public static int diameter(Node root) {
        if(root==null) {
            return new Info(0, 0);
        }
        Info left=diameter(root.left);
        Info right=diameter(root.right);
        int dia=Math.max(left.ht+right.ht+1, Math.max(left.dia, right.dia));
        int ht=Math.max(left.ht, right.ht)+1;
        return new Info(dia, ht);
    }
}