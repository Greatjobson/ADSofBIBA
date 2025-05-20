package assignment4;

import java.util.*;

public class WeightedGraph<T> {
    private Map<Vertex<T>, List<Edge<T>>> adjList; // Добавлено поле

    public Map<Vertex<T>, List<Edge<T>>> getAdjList() {
        return adjList;
    }

    private boolean directed;

    public WeightedGraph() {
        adjList = new HashMap<>();
        directed = false;
    }

    // In WeightedGraph class
    public Set<Vertex<T>> getVertices() {
    return adjList.keySet();
}
    public WeightedGraph(boolean directed) {
        this();
        this.directed = directed;
    }

    public void addVertex(Vertex<T> vertex) {
        adjList.putIfAbsent(vertex, new ArrayList<>());
    }

    public void addEdge(T sourceData, T destinationData, double weight) {
        Vertex<T> source = new Vertex<>(sourceData);
        Vertex<T> destination = new Vertex<>(destinationData);
        addVertex(source);
        addVertex(destination);
        adjList.get(source).add(new Edge<>(source, destination, weight));
        if (!directed) {
            adjList.get(destination).add(new Edge<>(destination, source, weight));
        }
    }

    public void printGraph() {
        if (directed) {
            System.out.println("Directed Graph:");
            for (Map.Entry<Vertex<T>, List<Edge<T>>> entry : adjList.entrySet()) {
                Vertex<T> vertex = entry.getKey();
                List<Edge<T>> edges = entry.getValue();
                System.out.print(vertex + " -> ");
                if (edges == null || edges.isEmpty()) {
                    System.out.println(" ");
                } else {
                    for (Edge<T> edge : edges) {
                        System.out.print("(" + edge.getDestination() + " " + edge.getWeight() + "), ");
                    }
                    System.out.println();
                }
            }
        } else {
            System.out.println("Undirected graph: ");
            for (Map.Entry<Vertex<T>, List<Edge<T>>> entry : adjList.entrySet()) {
                Vertex<T> vertex = entry.getKey();
                List<Edge<T>> edges = entry.getValue();
                System.out.print(vertex + " -- ");
                for (Edge<T> edge : edges) {
                    System.out.print("(" + edge.getDestination() + " " + edge.getWeight() + "), ");
                }
                System.out.println();
            }
        }
    }
}