import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class Graph {
    ArrayList<GraphNode> node = new ArrayList<>();
    int[][] adjacencyMatrix;

    public Graph(ArrayList<GraphNode> node) {
        this.node = node;
        this.adjacencyMatrix = new int[node.size()][node.size()];

    }

    public void addUndirectedEdge(int i, int j) {
        adjacencyMatrix[i][j] = 1;
        adjacencyMatrix[j][i] = 1;
    }

    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("   ");
        for (int i = 0; i < node.size(); i++) {
            s.append(node.get(i).name + " ");
        }
        s.append("\n");
        for (int i = 0; i < node.size(); i++) {
            s.append(node.get(i).name + ": ");
            for (int j : adjacencyMatrix[i]) {
                s.append((j) + " ");
            }
            s.append("\n");
        }
        return s.toString();
    }

    public ArrayList<GraphNode> getNeighbour(GraphNode node1) {

        ArrayList<GraphNode> neighbour = new ArrayList<>();
        for (int i = 0; i < adjacencyMatrix.length; i++) {
            if (adjacencyMatrix[node1.index][i] == 1) {
                neighbour.add(node.get(i));
            }

        }
        return neighbour;
    }

    public void bfsMain(GraphNode node) {

        LinkedList<GraphNode> queue = new LinkedList<>();
        queue.add(node);
        System.out.println("bfs print");
        while (!queue.isEmpty()) {
            GraphNode currentNode = queue.remove(0);
            currentNode.isVisited = true;

            System.out.print(currentNode.name + " ");
            ArrayList<GraphNode> neighbours = getNeighbour(currentNode);
            for (GraphNode neighbour : neighbours) {
                if (!neighbour.isVisited) {
                    queue.add(neighbour);
                    neighbour.isVisited = true;
                }
            }
        }
    }

    public void bfs() {
        for (GraphNode NodeNew : node) {
            if (!NodeNew.isVisited) {
                bfsMain(NodeNew);
            }
        }
    }

    public void dfsVisit(GraphNode newNode){
        Stack<GraphNode> stack=new Stack<>();
        stack.push(newNode);
        System.out.println("dfs print");
        while(!stack.isEmpty()) {
            GraphNode currentNode= stack.pop();
            currentNode.isVisited = true;

            System.out.print(currentNode.name + " ");
            ArrayList<GraphNode> neighbours = getNeighbour(currentNode);
            for(GraphNode neighbour: neighbours) {
               if(!neighbour.isVisited){
                   stack.push(neighbour);
                   neighbour.isVisited=true;
               }
            }
        }
    }

    public void dfs(){
        for ( GraphNode newNode1: node){
            if(!newNode1.isVisited){
                dfsVisit(newNode1);
            }
        }
    }

    public void resetVisited() {
        for (GraphNode node : this.node) {
            node.isVisited = false;
        }
    }
}
