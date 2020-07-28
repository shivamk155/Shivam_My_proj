package graphs.adjacency.list;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class GraphImpl {
    LinkedList[] graph;
    int v;

    public GraphImpl(int v) {
        this.v = v;

        graph = new LinkedList[v];

        for (int i = 0; i < v; i++)
            graph[i] = new LinkedList();
    }

    public void printBFS(){

    }

    public void printDFS(){

    }

    public void DFSUtil(){

    }


}

