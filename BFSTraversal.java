import java.util.ArrayList;

public class BFSTraversal {
    static class Edge {
        int src;
        int dest;
        int wt;
        Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }
    public static void createGraph(ArrayList<Edge> graph[]) {
        for(int i=0;i<graph.length;i++) {
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));
        graph[1].add(new Edge(1, 0, 2));
        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 7));
        graph[2].add(new Edge(2, 0, 4));
        graph[2].add(new Edge(2, 1, 1));
        graph[2].add(new Edge(2, 3, 3));
        graph[2].add(new Edge(2, 4, 5));
        graph[3].add(new Edge(3, 1, 7));
        graph[3].add(new Edge(3, 2, 3));
    }

public static void bfs(ArrayList<Edge> graph[]) {
    boolean vis[]=new boolean[graph.length];
    Queue<Integer> q=new LinkedList<>();
    q.add(0)
    while(!q.isEmpty()) {
        int curr=q.remove();
        if(!vis[curr]) {
            System.out.print(curr+" ");
            vis[curr]=true;
            for(int i=0;i<graph[curr].size();i++) {
                Edge e=graph[curr].get(i);
                    q.add(e.dest);

                
            }
        }
    }

}
}
