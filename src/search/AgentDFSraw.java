package search;

import interfaces.AbstractAgent;
import resource.Edge;
import resource.Node;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;


public class AgentDFSraw implements AbstractAgent {

    private Node source, goals;
    private Stack<Node> stack;
    private boolean found;

    public AgentDFSraw(Node source, Node goals) {
        this.source = source;
        this.goals = goals;
        this.stack = new Stack<Node>();
        this.found = false;
    }

    protected AgentDFSraw(Node source, Node goals, Stack<Node> stack, boolean found) {
        this.source = source;
        this.goals = goals;
        this.stack = stack;
        this.found = found;
    }

    @Override
    public void search() {
        this.stack.push(source);
        Node current;
        do {
            current = stack.pop();

            if (current.getValue().equals(goals.getValue()))
                found = true;

            for (Edge e : current.getAdjacencies()) {
                Node child = e.getTarget();
                stack.push(child);
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

    public Node getSource() {
        return source;
    }

    public void setSource(Node source) {
        this.source = source;
    }

    public Node getGoals() {
        return goals;
    }

    public void setGoals(Node goals) {
        this.goals = goals;
    }

    public Stack<Node> getStack() {
        return stack;
    }

    public void setStack(Stack<Node> stack) {
        this.stack = stack;
    }

    public boolean isFound() {
        return found;
    }

    public void setFound(boolean found) {
        this.found = found;
    }
}
