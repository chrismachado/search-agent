package search;

import resource.Edge;
import resource.Node;

import java.util.*;

public class AgentUCS extends AgentBFS implements Comparator<Node> {

    private Node source, goals;
    private PriorityQueue<Node> queue;
    private Set<Node> explored;
    private boolean found;

    public AgentUCS(Node source, Node goals) {
        super();
        this.source = source;
        this.goals = goals;
        this.source.setPathCost(0);
        this.queue = new PriorityQueue<Node>(20,this::compare);
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

            for (Edge e : current.getAdjacencies()) {
                Node child = e.getTarget();
                int cost = e.getCost();
                child.setPathCost(current.getPathCost() + cost);

                if(!explored.contains(child) && !queue.contains(child)) {
                    child.setParent(current);
                    queue.add(child);
                } else if(queue.contains(child) &&
                        (child.getPathCost() < current.getPathCost())) {
                    child.setParent(current);
                    child.setPathCost(current.getPathCost() + cost);
                    queue.remove(child);
                    queue.add(child);
                }

            }

        } while(!queue.isEmpty());

        System.out.println("=============     PATH     =============");
        System.out.println(printPath(goals));
        System.out.println("========================================");
    }

    @Override
    public int compare(Node n1, Node n2) {
        if (n1.getPathCost() > n2.getPathCost()) return 1;

        if (n1.getPathCost() < n2.getPathCost()) return -1;

        return 0;
    }

    @Override
    public List<Node> printPath(Node target) {
        List<Node> path = new ArrayList<Node>();

        for(Node node = target; node != null; node = node.getParent())
            path.add(node);

        Collections.reverse(path);

        return path;
    }
}
