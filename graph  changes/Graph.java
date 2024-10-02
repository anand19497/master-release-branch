
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class Graph {

    public ArrayList<GraphNode> nodeList;

    public Graph(ArrayList<GraphNode> nodeList) {
        this.nodeList = nodeList;
    }

    public void addUndirectedEdge(int i, int j) {
        GraphNode first = nodeList.get(i);
        GraphNode second = nodeList.get(j);
        first.neighbours.add(second);
        second.neighbours.add(first);

    }

    void bfsVisit(GraphNode node) {
        LinkedList<GraphNode> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()) {
            GraphNode currentNode = queue.remove(0);
            currentNode.isVisited = true;
            System.out.print(currentNode.name +" ");
            ArrayList<GraphNode> neighbr = currentNode.neighbours;
            for (GraphNode iterateNode : neighbr) {
                if (!iterateNode.isVisited) {
                    queue.add(iterateNode);
                    iterateNode.isVisited = true;

                }
            }
        }
    }

    void bfs() {
        for (GraphNode node : nodeList) {
            if (!node.isVisited) {
                bfsVisit(node);
            }
        }
    }

    void dfsVisit(GraphNode node) {
        Stack<GraphNode> stack = new Stack<>();
        stack.push(node);
        while (!stack.isEmpty()) {
            GraphNode currentNode = stack.pop();
            currentNode.isVisited = true;
            System.out.print(currentNode.name + " ");
            ArrayList<GraphNode> neighbr = currentNode.neighbours;
            for (GraphNode iterateNode : neighbr) {
                if (!iterateNode.isVisited) {
                    stack.push(iterateNode);
                    iterateNode.isVisited = true;

                }
            }
        }
    }

    void dfs() {
        for (GraphNode node : nodeList) {
            if (!node.isVisited) {
                dfsVisit(node);
            }
        }
    }

    void makeNonVisted() {
        for (GraphNode node : nodeList) {
            if (node.isVisited) {
                node.isVisited = false;
            }

        }

    }
}
