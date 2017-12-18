package resource;

public class Node {

    private final String value;
    private int pathCost;
    private Edge[] adjacencies;
    private Node parent;

    public int depth(Node node){
        int depth = 0;
        while (node.getParent()!=null){
            node=node.getParent();
            depth++;
        }
        return depth;
    }

    public Node(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public int getPathCost() {
        return pathCost;
    }

    public void setPathCost(int pathCost) {
        this.pathCost = pathCost;
    }

    public Edge[] getAdjacencies() {
        return adjacencies;
    }

    public void setAdjacencies(Edge[] adjacencies) {
        this.adjacencies = adjacencies;
    }

    public Node getParent() {
        return parent;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }

    @Override
    public String toString() {
        return this.value ;
    }
}
