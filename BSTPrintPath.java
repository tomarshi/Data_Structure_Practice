public classBSTPrintPath {
     static class Node {
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data=data;
        }
    }
    public static Node insert(Node root,int val) {
        if(root==null) {
            root=new Node(val);
            return root;
        }
        if(root.data>val) {
            root.left=insert(root.left,val);
        } else {
            root.right=insert(root.right,val);
        }
        return root;
    }
    public static void printPath(Node root,ArrayList<Integer> path) {
        if(root==null) {
            return;
        }
        path.add(root.data);
        if(root.left==null&&root.right==null) {
            for(int i=0;i<path.size();i++) {
                System.out.print(path.get(i)+" ");
            }
            System.out.println();
        }
        printPath(root.left,path);
        printPath(root.right,path);
        pat.reomove(path.size()-1);
    }
}