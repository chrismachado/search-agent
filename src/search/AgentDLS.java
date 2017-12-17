package search;

import interfaces.AbstractAgent;
import resource.Edge;
import resource.Node;

import java.util.*;

public class AgentDLS implements AbstractAgent{

    private int limit;
    private Node source,goals;
    private Stack<Node> stack;
    private Set<Node> visited;
    private boolean found;


    public AgentDLS (Node source, Node goals, int limit){
        this.source = source;
        this.goals = goals;
        this.limit = limit;
        this.found = false;
        this.stack = new Stack<Node>();
        this.visited = new HashSet<Node>();
    }

    @Override
    public void search(){
        this.stack.push(source);
        Node current;

        while(!stack.empty() && !found){
            current = stack.pop();
            visited.add(current);

            if (current.depth(current)<=limit){
                if (current.equals(goals))
                    found = true;

                for(Edge e: current.getAdjacencies()){
                    Node child = e.getTarget();

                    if (!stack.contains(child) && !visited.contains(child)){
                        child.setParent(current);
                        stack.push(child);
                    }
                }

            }else {
                System.out.println("Goal Node not found within depth limit");
                break;
            }
        }

        if (found)
            printPath(goals);
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


