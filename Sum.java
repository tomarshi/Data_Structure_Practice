public class Sum {
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
    public static int findSum(Node root) {
        if(root==null) {
            return 0;
        }
        int left=findSum(root.left);
        int right=findSum(root.right);
        return left+right+root.data;
    }
}