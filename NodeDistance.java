public class NodeDistance {
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
    public static Node lca(Node root,nint n1,int n2) {
        if(root==null) {
            return null;
        }
        if(root.data==n1||root.data==n2) {
            return root;
        }
        Node left=lca(root.left,n1,n2);
        Node right=lca(root.right,n1,n2);
        if(left==null) {
            return right;
        }
        if(right==null) {
            return left;
        }
        return root;
    }
    public static int minDistance(Node rott,int n1,int n2) {
        Node lca=lca(root,n1,n2);
        int d1=distance(lca,n1);
        int d2=distance(lca,n2);
        return d1+d2;
    }
    public static int distance(Node root,int n) {
        if(root==null) {
            return -1;
        }
        if(root.data==n) {
            return 0;
        }
        int left=distance(root.left,n);
        int right=distance(root.right,n);
        if(left==-1&&right==-1) {
            return -1;
        }
        else if(left==-1) {
            return right+1;
        }
       else {
            return left+1;
        }
       }
    }
