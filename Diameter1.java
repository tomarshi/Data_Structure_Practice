public class Diameter1 {
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
    public static int height(Node root) {
        if(root==null) {
            return 0;
        }
        int left=height(root.left);
        int right=height(root.right);
        return Math.max(left, right)+1;
    }
    public static int diameter(Node root) {
        if(root==null) {
            return 0;
        }
        int left=diameter(root.left);
        int right=diameter(root.right);
        int leftHeight=height(root.left);
        int rightHeight=height(root.right);
        int selfDiameter=leftHeight+rightHeight+1;
        return Math.max(selfDiameter, Math.max(left, right));

    }
}