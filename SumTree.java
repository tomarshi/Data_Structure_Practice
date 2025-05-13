public class SumTree {
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
    public static int sumTree(Node root) {
        if(root==null) {
            return 0;
        }
        int left=sumTree(root.left);
        int right=sumTree(root.right);
        int newLeft=root.left==null?0:root.left.data;
        int newRight=rppt.right==null?0:right.right.data;
        int data=root.data;
        root.data=left+newLeft+right+newRight;
        return data;
    }
}