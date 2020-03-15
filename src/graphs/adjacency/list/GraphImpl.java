package graphs.adjacency.list;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class GraphImpl {

    LinkedList<Integer>[] graph;
    int v;

    GraphImpl(int v) {
        this.v = v;
        graph = new LinkedList[v];

        for (int i = 0; i < v; i++) {
            graph[i] = new LinkedList<Integer>();
        }
    }

    public void addEdge(int u, int v) {
        graph[u].add(v);
    }

    public void printBFS(int start) {
        boolean[] visitedNodes = new boolean[v];
        Queue<Integer> queue = new LinkedList<Integer>();

        queue.add(start);

        while (null != queue.peek()) {
            int k = queue.poll();
            visitedNodes[k] = true;
            System.out.println(k + " ");

            for (Integer i : graph[k]) {
                if (!visitedNodes[i]) {
                    visitedNodes[i] = true;
                    queue.add(i);
                }
            }
        }
    }

    public void printDFS(int start) {
        boolean[] visitedNodes = new boolean[v];

        visitedNodes[start] = true;
        printDFSUtil(start, visitedNodes);
    }

    public void printDFSUtil(int n, boolean[] visitedNodes) {

        System.out.println(n + " ");

        for (Integer i : graph[n]) {
            if (!visitedNodes[i]) {
                visitedNodes[i] = true;
                printDFSUtil(i, visitedNodes);
            }
        }

    }

}

