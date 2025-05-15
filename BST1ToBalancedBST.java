public class BST1ToBalancedBST {
    static class Node {
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data=data;
        }

    }
    public static void inOrder(Node root,ArrayList<Integer> arr) {
        if(root==null) {
            return;
        }
        inOrder(root.left,arr);
        arr.add(root.data);
        inOrder(root.right,arr);
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
    public static Node balanceBST(Node root) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr(root,arr);
        root= createBST(arr,0,arr.size()-1);
        return root;
    }

}