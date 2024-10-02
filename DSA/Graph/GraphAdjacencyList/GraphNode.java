
import java.util.ArrayList;

public class GraphNode {
    
    public String name;
    public int index ;
    public boolean isVisited=false;
    ArrayList<GraphNode> neighbours=new ArrayList<>();

    public GraphNode( String name,int index) {
        this.index = index;
        this.name = name;
    }

}
