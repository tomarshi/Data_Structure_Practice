public class DFSTraversal {
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
    public static void dfs(ArrayList<Edge> graph[],int curr,int vis[]) {
        System.out.print(curr+" ");
        vis[curr]=true;
        for(int i=0;i<graph[curr].size();i++) {
            Edge e=graph[curr].get(i);
            if(!vis[e.dest]) {
                dfs(graph,e.dest,vis);
            }
        }
    }
    public static void main(String[] args) {
        int V=5;
        ArrayList<Edge> graph[]=new ArrayList[V];
        createGraph(graph);
        
        int vis[]=new int[V];
        
        dfs(graph,0,vis);
    }
}