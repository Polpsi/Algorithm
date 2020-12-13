package lesson7;

public class Lesson7 {

    public static void main(String[] args) {
        Graph graph = new Graph(10);
        graph.addEdge(1, 2);
        graph.addEdge(0, 4);
        graph.addEdge(1, 3);
        graph.addEdge(1, 0);
        graph.addEdge(6, 2);
        graph.addEdge(9, 7);
        graph.addEdge(4, 9);
        graph.addEdge(5, 8);
        graph.addEdge(8, 1);
        graph.addEdge(3, 7);
        graph.addEdge(5, 6);

        BreadthFirstPaths bfp = new BreadthFirstPaths(graph, 2);
        System.out.println(bfp.hasPathTo(9));
        System.out.println(bfp.pathTo(9));

    }
}
