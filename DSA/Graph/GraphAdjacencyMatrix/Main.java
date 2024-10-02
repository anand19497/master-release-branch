import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        ArrayList<GraphNode> nodeList = new ArrayList<>();
        nodeList.add(new GraphNode("A", 0));
        nodeList.add(new GraphNode("B", 1));
        nodeList.add(new GraphNode("C", 2));
        nodeList.add(new GraphNode("D", 3));

        Graph g = new Graph(nodeList);
        g.addUndirectedEdge(0, 1);
        g.addUndirectedEdge(0, 2);
        g.addUndirectedEdge(1, 3);
        g.addUndirectedEdge(2, 3);
        System.out.println(g);
//        ArrayList<GraphNode>  neighbour=  g.getNeighbour(new GraphNode("A", 0));
//       String name = neighbour.get(0).name;
//        int index = neighbour.get(0).index;
//
//        System.out.println(index+ "  "+ name);

        g.bfs();
        g.resetVisited();
        System.out.println();
        g.dfs();



    }
}