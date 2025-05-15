public class BST1MergeBST {
    static class Node {
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data=data;
        }
    }
    public static void inorder(Node root,ArrayList<Integer> arr) {
        if(root==null) {
            return;
        }
        inorder1(root.left,arr);
        arr.add(root.data);
        inorder1(root.right,arr);
    }
    public static Node mergerBST(Node root1,Node root2) {
        ArrayList<Integer> arr1=new ArrayList<>();
        ArrayList<Integer> arr2=new ArrayList<>();
        inorder(root1,arr1);
        inorder(root2,arr2);
        ArrayList<Integer> arr=new ArrayList<>();
        int i=0,j=0;
        while(i<arr1.size() && j<arr2.size()) {
            if(arr1.get(i)<arr2.get(j)) {
                arr.add(arr1.get(i));
                i++;
            } else {
                arr.add(arr2.get(j));
                j++;
            }
        }
        while(i<arr1.size()) {
            arr.add(arr1.get(i));
            i++;
        }
        while(j<arr2.size()) {
            arr.add(arr2.get(j));
            j++;
        }
        return createBST(arr,0,arr.size()-1);
    }
    public static Node createBST(ArrayList<Integer> arr,int si,int ei) {
        if(si>ei) {
            return null;
        }
        int mid=(si+ei)/2;
        Node root=new Node(arr.get(mid));
        root.left=createBST(arr,si,mid-1);
        root.right=createBST(arr,mid+1,ei);
        return root;
    }
    
    public static void main(String[] args) {
        Node root1=new Node(10);
        root1.left=new Node(5);
        root1.right=new Node(15);
        root1.left.left=new Node(1);
        root1.left.right=new Node(8);
        root1.right.right=new Node(7);
        
        Node root2=new Node(12);
        root2.left=new Node(6);
        root2.right=new Node(18);
        root2.left.left=new Node(3);
        root2.left.right=new Node(9);
    }
}