package assignment4;

import java.util.*;

public class BreadthFirstSearch<T> extends Search<T> {
    public BreadthFirstSearch(WeightedGraph<T> graph, T sourceData) {
        super(new Vertex<>(sourceData));
        bfs(graph, this.source);
    }

    private void bfs(WeightedGraph<T> graph, Vertex<T> source) {
        Queue<Vertex<T>> queue = new LinkedList<>();
        marked.add(source);
        queue.add(source);

        while (!queue.isEmpty()) {
            Vertex<T> current = queue.poll();
            System.out.println("Root Vertix: " + current); // Печать текущей вершины
            List<Edge<T>> edges = graph.getAdjList().get(current);

            if (edges != null) {
                for (Edge<T> edge : edges) {
                    Vertex<T> neighbor = edge.getDestination();
                    System.out.println("  |___(Neighbors: " + neighbor + " " + edge.getWeight() + ")"); // Печать соседей
                    if (!marked.contains(neighbor)) {
                        marked.add(neighbor);
                        edgeTo.put(neighbor, current);
                        queue.add(neighbor);
                    }
                }
            }
        }
    }
}