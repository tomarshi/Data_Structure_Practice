public class BST1LargestBST {
    static class Node {
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data=data;
        }
    }
    public static void inorder(Node root) {
        if(root==null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static void main(String[] args) {
        Node root=new Node(10);
        root.left=new Node(5);
        root.right=new Node(15);
        root.left.left=new Node(1);
        root.left.right=new Node(8);
        root.right.right=new Node(7);
        inorder(root);
    }
    static class Info {
        boolean isBST;
        int size;
        int min;
        int max;
        Info(boolean isBST,int size,int min,int max) {
            this.isBST=isBST;
            this.size=size;
            this.min=min;
            this.max=max;
        }
    }
    public static int maxBST=0;
    public static Info largestBST(Node root) {
        if(root==null) {
            return new Info(true,0,Integer.MAX_VALUE,Integer.MIN_VALUE);
        }
        Info left=largestBST(root.left);
        Info right=largestBST(root.right);
        int size=left.size+right.size+1;
        int min=Math.min(root.data,Math.min(left.min,right.min));
        int max=Math.max(root.data,Math.max(left.max,right.max));
        if(root.data<=left.min || root.data>=right.max) {
            return new Info(false,size,min,max);
        }
        if(left.isBST && right.isBST) {
            maxBST=Math.max(maxBST,size);
            return new Info(true,size,min,max);
        }
       
        return new Info(false,size,min,max);
    }   
}