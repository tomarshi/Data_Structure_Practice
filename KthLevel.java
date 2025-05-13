public class KthLevel {
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
    public static void printKthLevel(Node root,int level,int k) {
        if(root==null) {
            return;
        }
        if(level==k) {
            System.out.print(root.data+" ");
            return;
        }
        KthLevel(root.left,level+1,k);
        KthLevel(root.right,level+1,k);

    }
}