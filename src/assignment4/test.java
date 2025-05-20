package assignment4;

public class test {

    public static void main(String[] args) {

        WeightedGraph<String> graph = new WeightedGraph<>(true);
        graph.addEdge("Almaty", "Astana", 2.1);
        graph.addEdge("Shymkent", "Atyrau", 7.8);
        graph.addEdge("Atyrau", "Astana", 7.1);
        graph.addEdge("Almaty", "Shymkent", 7.2);
        graph.addEdge("Shymkent", "Astana", 3.9);
        graph.addEdge("Astana", "Kostanay", 3.5);
        graph.addEdge("Shymkent", "Kyzylorda", 5.4);

        //checking the graph
        //graph.printGraph();
        System.out.println("_______________________________________________________");

        WeightedGraph<String> graph2 = new WeightedGraph<>(false);
        graph2.addEdge("Almaty", "Astana", 2.1);
        graph2.addEdge("Shymkent", "Atyrau", 7.8);
        graph2.addEdge("Atyrau", "Astana", 7.1);
        graph2.addEdge("Almaty", "Shymkent", 7.2);
        graph2.addEdge("Shymkent", "Astana", 3.9);
        graph2.addEdge("Astana", "Kostanay", 3.5);
        graph2.addEdge("Shymkent", "Kyzylorda", 5.4);

        //graph2.printGraph();
        System.out.println("_______________________________________________________");
        BreadthFirstSearch bfs = new BreadthFirstSearch<>(graph, "Almaty");
    }
}
