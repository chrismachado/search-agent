package search;

import resource.Edge;
import resource.Node;

import java.util.*;


public class AgentDFS extends AgentDFSraw {

    private Set<Node> explored;

    public AgentDFS(Node source, Node goals) {
        super(source, goals, new Stack<Node>(), false);
        this.explored = new HashSet<Node>();
    }

    @Override
    public void search() {
        super.getStack().push(super.getSource());
        Node current;
        do {
            current = super.getStack().pop();
            explored.add(current);

            if (current.getValue().equals(super.getGoals().getValue()))
                super.setFound(true);

            for (Edge e : current.getAdjacencies()) {
                Node child = e.getTarget();

                if (!explored.contains(child) && !super.getStack().contains(child)) {
                    child.setParent(current);
                    super.getStack().push(child);
                }
            }
        } while (!super.getStack().isEmpty() && !super.isFound());

        System.out.println("=============     PATH     =============");
        System.out.println(printPath(super.getGoals()));
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
