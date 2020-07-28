package revision.graphs;

import java.util.LinkedList;
import java.util.Queue;

public class Graph {
    int v;
    LinkedList<Integer> nodeList[];

    Graph(int vertices) {
        v = vertices;
        nodeList = new LinkedList[v];

        for (int i = 0; i < v; i++)
            nodeList[i] = new LinkedList<>();
    }

    void addEdge(int source, int destination) {
        nodeList[source].add(destination);
    }

    void printBFS(int start) {
        int[] arr = new int[v];

        for (int i = 0; i < v; i++)
            arr[i] = 0;

        Queue<Integer> que = new LinkedList<>();
        que.add(start);
        arr[start] = 1;

        System.out.println("BFS starting from " + start);

        while (!que.isEmpty()) {
            int i = que.poll();

            for (int k = 0; k < nodeList[i].size(); k++)
                if (arr[nodeList[i].get(k)] == 0) {
                    que.add(nodeList[i].get(k));
                    arr[nodeList[i].get(k)] = 1;
                }

            System.out.print(" " + i);
        }

        System.out.println("\n BFS Complete");
    }

    void printDFS(int start) {
        boolean[] elements = new boolean[v];

        printDFSUtil(start, elements);
    }

    private void printDFSUtil(int start, boolean[] elements) {

        System.out.print(" " + start);
        elements[start] = true;

        for (Integer i : nodeList[start])
            if (!elements[i])
                printDFSUtil(i, elements);

    }

}
