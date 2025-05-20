package assignment4;

import java.util.*;

public class DijkstraSearch<T> extends Search<T> {
    private final Map<Vertex<T>, Double> distTo;

    public DijkstraSearch(WeightedGraph<T> graph, T sourceData) {
        super(new Vertex<>(sourceData));
        distTo = new HashMap<>();
        for (Vertex<T> vertex : graph.getVertices()) {
            distTo.put(vertex, Double.POSITIVE_INFINITY);
        }
        distTo.put(this.source, 0.0);

        if (!graph.getVertices().contains(this.source)) {
            throw new IllegalArgumentException("Source vertex not found in the graph");
        }

        dijkstra(graph, this.source);
    }

    private void dijkstra(WeightedGraph<T> graph, Vertex<T> source) {
        PriorityQueue<Vertex<T>> pq = new PriorityQueue<>(Comparator.comparingDouble(distTo::get));
        pq.add(source);

        while (!pq.isEmpty()) {
            Vertex<T> current = pq.poll();

            List<Edge<T>> edges = graph.getAdjList().get(current);
            if (edges != null) {
                for (Edge<T> edge : edges) {
                    Vertex<T> neighbor = edge.getDestination();
                    double newDist = distTo.get(current) + edge.getWeight();

                    if (newDist < distTo.get(neighbor)) {
                        distTo.put(neighbor, newDist);
                        edgeTo.put(neighbor, current);

                        pq.remove(neighbor); // Удаляем перед повторным добавлением
                        pq.add(neighbor);
                    }
                }
            }
        }
    }

    public double getDistanceTo(Vertex<T> v) {
        return distTo.getOrDefault(v, Double.POSITIVE_INFINITY);
    }
}