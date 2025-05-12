public class TopView {
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
    static class Info {
        Node node;
        int hd;
        Info(Node node,int hd) {
            this.node=node;
            this.hd=hd;
        }
    }
    public static void topView(Node root) {
        Queue<Info> q=new LinkedList<>();
        Map<Integer,Node> map=new HashMap<>();
        int min,max=0;
        q.add(new Info(root, 0));
        q.add(null);
        while(!q.isEmpty()) {
            Info curr=q.remove();
            if(curr==null) {
                if(q.isEmpty()) {
                    break;
                }
                else {
                    q.add(null);
                }
            }
            else {
                if(!map.containsKey(curr.hd)) {
                    map.put(curr.hd, curr.node);
                }

                if(curr.node.left!=null) {
                    q.add(new Info(curr.node.left, curr.hd-1));
                    min=Math.min(min, curr.hd-1);
                }
                if(curr.node.right!=null) {
                    q.add(new Info(curr.node.right, curr.hd+1));
                    max=Math.max(max, curr.hd+1);
                }

            }
            for(int i=min;i<=max;i++) {
                    System.out.print(map.get(i).data+" ");
                
            }
        }
    }
}