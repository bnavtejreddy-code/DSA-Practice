import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Day11Graphs {

    // Stores the actual vertex values
    static ArrayList<Integer> vertices = new ArrayList<>();

    // Graph Edge
    static class Edge {

        int src;
        int dest;

        Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    // Static Graph
    public void createEdges(ArrayList<Edge>[] graph) {

        for(int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));

        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,3));

        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,3));
        graph[2].add(new Edge(2,4));

        graph[3].add(new Edge(3,1));
        graph[3].add(new Edge(3,2));
        graph[3].add(new Edge(3,4));

        graph[4].add(new Edge(4,2));
        graph[4].add(new Edge(4,3));
    }

    // Dynamic Undirected Graph
    public void addEdge(ArrayList<Edge>[] graph,
                        int src,
                        int dest){

        if(!vertices.contains(src)){
            vertices.add(src);
        }

        if(!vertices.contains(dest)){
            vertices.add(dest);
        }

        graph[vertices.indexOf(src)].add(new Edge(src,dest));
        graph[vertices.indexOf(dest)].add(new Edge(dest,src));
    }

    // Print Graph
    public void printGraph(ArrayList<Edge>[] graph){

        for(ArrayList<Edge> list : graph){

            if(list.isEmpty()){
                continue;
            }

            System.out.print(list.get(0).src + " -> ");

            for(Edge e : list){
                System.out.print("(" + e.src + "," + e.dest + ") ");
            }

            System.out.println();
        }
    }

    // Breadth First Search
    public void bfs(ArrayList<Edge>[] graph){

        boolean[] visited = new boolean[graph.length];

        Queue<Integer> q = new LinkedList<>();

        q.offer(0);
        visited[0] = true;

        System.out.print("BFS: ");

        while(!q.isEmpty()){

            int curr = q.poll();

            System.out.print(vertices.get(curr) + " ");

            for(Edge e : graph[curr]){

                int next = vertices.indexOf(e.dest);

                if(!visited[next]){
                    visited[next] = true;
                    q.offer(next);
                }
            }
        }

        System.out.println();
    }

    // Depth First Search
    public void dfs(ArrayList<Edge>[] graph,
                    int curr,
                    boolean[] visited){

        visited[curr] = true;

        System.out.print(vertices.get(curr) + " ");

        for(Edge e : graph[curr]){

            int next = vertices.indexOf(e.dest);

            if(!visited[next]){
                dfs(graph,next,visited);
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Day11Graphs graph = new Day11Graphs();

        int totalVertices = 4;

        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] adjList =
                new ArrayList[totalVertices];

        for(int i = 0; i < adjList.length; i++){
            adjList[i] = new ArrayList<>();
        }

        System.out.print("Enter number of edges: ");
        int edges = sc.nextInt();

        for(int i = 0; i < edges; i++){

            System.out.print("Source: ");
            int src = sc.nextInt();

            System.out.print("Destination: ");
            int dest = sc.nextInt();

            graph.addEdge(adjList,src,dest);
        }

        System.out.println("\nAdjacency List:");

        graph.printGraph(adjList);

        System.out.println();

        graph.bfs(adjList);

        System.out.print("DFS: ");

        boolean[] visited = new boolean[adjList.length];

        graph.dfs(adjList,0,visited);

        sc.close();
    }
}