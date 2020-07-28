package revision.graphs;

import java.util.LinkedList;

public class WeightedGraph {
    int v;
    LinkedList<WeightedGraphNode>[] nodeList;

    WeightedGraph(int size) {
        v = size;
        nodeList = new LinkedList[size];
        for (int i = 0; i < size; i++) {
            nodeList[i] = new LinkedList<>();
        }
    }

    void addEdge(int source, int destination, int weight) {
        nodeList[source].add(new WeightedGraphNode(destination, weight));
    }

    void printGraphBFS(){}

    void printGraphDFS(){}
}
