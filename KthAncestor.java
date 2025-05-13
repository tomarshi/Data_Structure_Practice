public class KthAncestor {
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
    public static int  KthAncestor(Node root,int k,i int n) {
        if(root==null) {
            return -1;
        }
        if(root.data==n) {
            reteurn 0;
        }
        int left=KthAncestor(root.left,k,n);
        int right=KthAncestor(root.right,k,n);
        if(left==-1&&right==-1) {
            return -1;
        }
        int max=Math.max(left,right);
        if(max+1==k) {
            System.out.println(root.data);
        }   
        return max+1;
    }
}