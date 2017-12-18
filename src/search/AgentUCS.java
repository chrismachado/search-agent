package search;

import resource.Edge;
import resource.Node;

import java.util.*;

public class AgentUCS extends AgentBFS implements Comparator<Node> {

    private PriorityQueue<Node> queue;

    public AgentUCS(Node source, Node goals) {
        super(source, goals, new HashSet<>(), false);
        super.getSource().setPathCost(0);
        this.queue = new PriorityQueue<Node>(20,this::compare);
    }

    @Override
    public void search() {
        this.queue.add(super.getSource());
        Node current;
        do {
            current = queue.poll();
            super.getExplored().add(current);

            if(current.getValue().equals(super.getGoals().getValue()))
                super.setFound(true);

            for (Edge e : current.getAdjacencies()) {
                Node child = e.getTarget();
                int cost = e.getCost();
                child.setPathCost(current.getPathCost() + cost);

                if(!super.getExplored().contains(child) && !queue.contains(child)) {
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

        } while(!queue.isEmpty() && !super.isFound());

        if(super.isFound()) {
            System.out.println("=============     PATH     =============");
            System.out.println(printPath(super.getGoals()));
            System.out.println("========================================");
        } else {
            System.out.println("Goal node : "+ super.getGoals() +" not found within depth limit");
        }
    }

    @Override
    public int compare(Node n1, Node n2) {
        if (n1.getPathCost() > n2.getPathCost()) return 1;

        if (n1.getPathCost() < n2.getPathCost()) return -1;

        return 0;
    }
}
