package search;

import interfaces.AbstractAgent;
import resource.Edge;
import resource.Node;

import java.util.*;


public class AgentBFS implements AbstractAgent {

    private Node source, goals;
    private Queue<Node> queue;
    private Set<Node> explored;
    private boolean found;

    protected AgentBFS(Node source, Node goals, Set<Node> explored, boolean found) {
        this.source = source;
        this.goals = goals;
        this.explored = explored;
        this.found = found;
    }

    public AgentBFS(Node source, Node goals) {
        this.source = source;
        this.goals = goals;
        this.queue = new LinkedList<Node>();
        this.explored = new HashSet<Node>();
        this.found = false;
    }

    @Override
    public void search() {
        this.queue.add(source);
        Node current;
        do {
            current = queue.poll();
            explored.add(current);

            if(current.getValue().equals(goals.getValue()))
                found = true;

            for(Edge e : current.getAdjacencies()) {
                Node child = e.getTarget();

                if (!explored.contains(child) && !queue.contains(child)) {
                    child.setParent(current);
                    queue.add(child);
                }
            }
        } while(!queue.isEmpty() && !found);

        System.out.println("=============     PATH     =============");
        System.out.println(printPath(goals));
        System.out.println("========================================");

    }

    @Override
    public List<Node> printPath(Node target) {
        List<Node> path = new ArrayList<Node>();

        for(Node node = target; node != null; node = node.getParent())
            path.add(node);

        Collections.reverse(path);

        return path;
    }

    protected Node getSource() {
        return source;
    }

    protected Node getGoals() {
        return goals;
    }

    protected Set<Node> getExplored() {
        return explored;
    }

    protected boolean isFound() {
        return found;
    }

    protected void setFound(boolean found) {
        this.found = found;
    }
}
