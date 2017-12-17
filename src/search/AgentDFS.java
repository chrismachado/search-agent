package search;

import interfaces.AbstractAgent;
import resource.Edge;
import resource.Node;

import java.util.*;


public class AgentDFS implements AbstractAgent {

    private Node source, goals;
    private Stack<Node> stack;
    private Set<Node> explored;
    private boolean found;

    public AgentDFS(Node source, Node goals) {
        this.source = source;
        this.goals = goals;
        this.stack = new Stack<Node>();
        this.explored = new HashSet<Node>();
        this.found = false;
    }

    @Override
    public void search() {
        this.stack.push(source);
        Node current;
        do {
            current = stack.pop();
            explored.add(current);

            if (current.getValue().equals(goals.getValue()))
                found = true;

            for (Edge e : current.getAdjacencies()) {
                Node child = e.getTarget();

                if (!explored.contains(child) && !stack.contains(child)) {
                    child.setParent(current);
                    stack.push(child);
                }
            }
        } while (!stack.isEmpty() && !found);

        System.out.println("=============     PATH     =============");
        System.out.println(printPath(goals));
        System.out.println("========================================");

    }

    @Override
    public List<Node> printPath(Node target) {
        List<Node> path = new ArrayList<Node>();

        for (Node node = target; node != null; node = node.getParent())
            path.add(node);

        Collections.reverse(path);

        return path;
    }


}
