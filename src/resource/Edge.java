package resource;

public class Edge {

    private int cost;
    private Node target;

    public Edge(Node target, int cost) {
        this.target = target;
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public Node getTarget() {
        return target;
    }

    public void setTarget(Node target) {
        this.target = target;
    }
}
