public class BFS {
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
    public static void bfs(ArrayList<Edge>graph,int src) {
        Queue<Integer> q=new LinkedList<>();
        boolean visited[]=new boolean[graph.length];
        q.add(src);
        while(!q.isEmpty()) {
            int curr=q.remove();
            if(!visited[curr]) {
                System.out.print(curr+" ");
                visited[curr]=true;
                
                for(int i=0;i<graph[curr].size();i++) {
                    Edge e=graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }
}