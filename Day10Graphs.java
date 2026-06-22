import java.util.ArrayList;

// Graph Representation using Adjacency List

public class Day10Graphs {

    static class Edge {

        int src;
        int dest;

        Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    public void createEdge(ArrayList<Edge>[] graph) {

        for(int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 2));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 3));
    }

    public void printGraph(ArrayList<Edge>[] graph) {

        for(int i = 0; i < graph.length; i++) {

            System.out.print(i + " -> ");

            for(Edge e : graph[i]) {
                System.out.print("(" + e.src + "," + e.dest + ") ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        Day10Graphs graph = new Day10Graphs();

        int vertices = 4;

        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] adjList = new ArrayList[vertices];

        graph.createEdge(adjList);

        graph.printGraph(adjList);
    }
}

/*

=====================================================
PRACTICE QUESTIONS
=====================================================

1. Spiral Matrix Traversal
   - Matrix
   - Boundary Traversal
   - Recursion / Iterative

2. Longest Valid Subarray
   - Sliding Window
   - Monotonic Deque
   - max - min <= K

3. Boats to Save People
   - Two Pointers
   - Sorting
   - Greedy

=====================================================
GRAPH THEORY
=====================================================

Graph Representation:

1. Adjacency Matrix
   int[][] graph

2. Adjacency List
   ArrayList<Edge>[] graph

Edge Structure:

class Edge{
    int src;
    int dest;
}

Example:

0 -> 1, 2
1 -> 2
2 -> 0, 3
3 -> 3

Adjacency List:

graph[0] = [(0,1), (0,2)]
graph[1] = [(1,2)]
graph[2] = [(2,0), (2,3)]
graph[3] = [(3,3)]

Next Topics:

1. BFS
2. DFS
3. Cycle Detection
4. Topological Sort
5. Dijkstra
6. Bellman Ford
7. MST (Prim's / Kruskal)

*/