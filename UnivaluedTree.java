public class UnivaluedTree {
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
            indx++;
            if(nodes[indx]==-1) {
                return null;
            }
            Node newNode =new Node(nodes[indx]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);
            return newNode;
        }
    }
    public static boolean isUnivalued(Node root) {
        if(root==null) {
            return true;
        }
     if(root.left!=null&&root.data!=root.left.data) {
            return false;
        }
        if(root.right!=null&&root.data!=root.right.data) {
            return false;
        }
        boolean left=isUnivalued(root.left);
        boolean right=isUnivalued(root.right);
        return left&&right;
    }
}