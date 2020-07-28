package revision.graphs;

public class GraphUser {
    public static void main(String[] args) {
//      Weighted graph Creation
//      WeightedGraph myTestWeightedGraph = new WeightedGraph(6);
//      createWeightedGraph(myTestGraph);

        Graph myTestGraph = new Graph(6);
        createGraph(myTestGraph);

        //BFS Traversal
        //myTestGraph.printBFS(2);

        //DFS Traversal
        //myTestGraph.printDFS(2);
    }

    static void createWeightedGraph(Graph myTestWeightedGraph) {

//        myTestWeightedGraph.addEdge(0, 1, 1);
//        myTestWeightedGraph.addEdge(0, 2, 2);
//        myTestWeightedGraph.addEdge(0, 3, 3);
//
//        myTestWeightedGraph.addEdge(1, 0, 1);
//        myTestWeightedGraph.addEdge(1, 5, 6);
//
//        myTestWeightedGraph.addEdge(2, 3, 5);
//        myTestWeightedGraph.addEdge(2, 0, 2);
//
//        myTestWeightedGraph.addEdge(3, 0, 3);
//        myTestWeightedGraph.addEdge(3, 2, 5);
//        myTestWeightedGraph.addEdge(3, 4, 7);
//
//        myTestWeightedGraph.addEdge(4, 3, 7);
//        myTestWeightedGraph.addEdge(4, 5, 9);
//
//        myTestWeightedGraph.addEdge(5, 1, 6);
//        myTestWeightedGraph.addEdge(5, 4, 9);
    }

    static void createGraph(Graph myTestGraph) {
        myTestGraph.addEdge(0, 1);
        myTestGraph.addEdge(0, 2);
        myTestGraph.addEdge(0, 3);

        myTestGraph.addEdge(1, 0);
        myTestGraph.addEdge(1, 5);

        myTestGraph.addEdge(2, 0);
        myTestGraph.addEdge(2, 3);

        myTestGraph.addEdge(3, 0);
        myTestGraph.addEdge(3, 2);
        myTestGraph.addEdge(3, 4);

        myTestGraph.addEdge(4, 3);
        myTestGraph.addEdge(4, 5);

        myTestGraph.addEdge(5, 1);
        myTestGraph.addEdge(5, 4);
    }
}
