public class HasPath {
    static class Edge {
        int src;
        int dest;
        int wt;
        Edge(int src,int dest,int wt) {
            this.src=src;
            this.dest=dest;
            this.wt=wt;
        }
    }
    public static void createGraph(ArrayList<Edge>graph[],int V) {
        for(int i=0;i<V;i++) {
            graph[i]= new ArrayList<>();
        }
        graph[0].add(new Edge(0,1,2));
        graph[0].add(new Edge(0,2,4));
        graph[1].add(new Edge(1,0,2));
        graph[1].add(new Edge(1,3,7));
        graph[2].add(new Edge(2,0,4));
        graph[2].add(new Edge(2,3,3));
        graph[3].add(new Edge(3,1,7));
        graph[3].add(new Edge(3,2,3));
    }
    public static boolean hasPath(ArrayList<Edge> graph[],int src,int dest,boolean vis[]) {
        if(src==dest) {
            return  true;
        }
       for(int i=0;i<graph[src].size();i++) {
            Edge e= graph[src].get(i);
            if(!vis[e.dest]&&hasPath(graph,e.dest,dest,vis)) {
                return true;
            }
             
        }
        return false;
    }
}