public class Subtree {
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
    public static boolean isSubtree(Node root,Node subRoot) {
        if(root==null) {
            return false;
        }
        if(root.data==subRoot.data) {
            if(isIdentical(root,subRoot)) {
                return true;
            }
        }
        boolean left=isSubtree(root.left,subRoot);
        boolean right=isSubtree(root.right,subRoot);
        return left||right;
    }
    public static boolean isIdentical(Node node,Node subRoot) {
        if(node==null&&subRoot==null) {
            return true;
        }
        else if(node==null||subRoot==null||node.data!=subRoot.data) {
            return false;
        }
        if(!isIdentical(node.left,subRoot.left)) {
            return false;
        }
        if(!isIdentical(node.right,subRoot.right)) {
            return false;
        }
        return true;
    }
}