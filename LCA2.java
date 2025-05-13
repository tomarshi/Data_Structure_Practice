public class LCA1 {
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
    public static Node lca(Node root,int n1,int n2) {
        if(root==null) {
            return null;
        }
        if(root.data==n1||root.data==n2) {
            return root;
        }
        NNode left=lca(root.left,n1,n2);
        NNode right=lca(root.right,n1,n2);
        if(left==null) {
            return right;
        }
        if(right==null) {
            return left;
        }
        return root;
    }
}