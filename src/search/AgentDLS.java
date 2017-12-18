package search;

import interfaces.AbstractAgent;
import resource.Edge;
import resource.Node;

import java.util.*;

public class AgentDLS implements AbstractAgent{

    private int limit;
    private Node source,goals;
    private Stack<Node> stack;
    private Set<Node> explored;
    private static boolean found;


    public AgentDLS (Node source, Node goals, int limit){
        this.source = source;
        this.goals = goals;
        this.limit = limit;
        this.found = false;
        this.stack = new Stack<Node>();
        this.explored = new HashSet<Node>();
    }

    @Override
    public void search(){
        this.stack.push(source);
        Node current;

        do {
            current = stack.pop();
            explored.add(current);

            if (current.equals(goals))
                found = true;

            for(Edge e: current.getAdjacencies()){
                Node child = e.getTarget();
                if (!stack.contains(child) && !explored.contains(child)){
                    child.setParent(current);
                    if (child.depth(child)<=limit)
                        stack.push(child);
                }
            }
            System.out.println(stack);
        } while(!stack.isEmpty() && !found);

        if (found){
            System.out.println("=============     PATH(Limit = "+ limit +")     =============");
            System.out.println(printPath(goals));
            System.out.println("=========================================================");
        }else {
            System.out.println("Goal node : "+ goals +" not found within depth limit");
        }
    }

    @Override
    public List<Node> printPath(Node target) {
        List<Node> path = new ArrayList<Node>();

        for (Node node = target; node != null; node = node.getParent())
            path.add(node);

        Collections.reverse(path);

        return path;

    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
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

    public Set<Node> getExplored() {
        return explored;
    }

    public void setExplored(Set<Node> explored) {
        this.explored = explored;
    }

    public boolean isFound() {
        return found;
    }

    public void setFound(boolean found) {
        this.found = found;
    }
}


