public class BST1SortedArray {
    public static Node createBST(int arr[],int si,int ei) {
        if(si>ei) {
            return null;
        }
        int mid=(si+ei)/2;
        Node root=new Node(arr[mid]);
        root.left=createBST(arr,si,mid-1);
        root.right=createBST(arr,mid+1,ei);
        return root;
    }
        int mid=(se+ei)/2;
        Node root=new Node(arr[mid]);
        root.left=createBST(arr,si,mid-1);
        root.right=createBST(arr,mid+1,ei);
        return root;
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
        int arr[]={1,2,3,4,5,6,7};
        Node root=createBST(arr,0,arr.length-1);
        inorder(root);
    }
}