package assignment4;

public class Main {
    public static void outputPath(Search<String> search, String key) {
        Vertex<String> destination = new Vertex<>(key);

        if (!search.hasPathTo(destination)) {
            System.out.println("path not founded");
            return;
        }

        System.out.print("Path: ");
        for (Vertex<String> vertex : search.pathTo(destination)) {
            System.out.print(vertex + " -> ");
            try {
                Thread.sleep(500); // Задержка для имитации отслеживания
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("End");
    }
    public static void main(String[] args) {
        WeightedGraph<String> weightedGraph = new WeightedGraph<>(true);
        fillWithWeights(weightedGraph);



        System.out.println("--------------------------------");

        Search<String> dijkstraSearch = new DijkstraSearch<>(weightedGraph, "Almaty");
        outputPath(dijkstraSearch, "Kyzylorda");

        System.out.println("--------------------------------");


    }

    public static void fillWithWeights(WeightedGraph<String> graph) {
        graph.addEdge("Almaty", "Astana", 2.1);
        graph.addEdge("Shymkent", "Atyrau", 7.8);
        graph.addEdge("Atyrau", "Astana", 7.1);
        graph.addEdge("Almaty", "Shymkent", 7.2);
        graph.addEdge("Shymkent", "Astana", 3.9);
        graph.addEdge("Astana", "Kostanay", 3.5);
        graph.addEdge("Shymkent", "Kyzylorda", 5.4);
        System.out.println("BFS:");
        Search<String> bfs = new BreadthFirstSearch<>(graph, "Almaty");
        Main.outputPath(bfs, "Kyzylorda");
        Search<String> djk = new DijkstraSearch<>(graph, "Almaty");
        outputPath(djk, "Kyzylorda");
    }



}
