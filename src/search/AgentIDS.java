package search;

import interfaces.AbstractAgent;
import resource.Node;

import java.util.List;

public class AgentIDS implements AbstractAgent{
    private Node goals, source;

    public AgentIDS(Node source, Node goals){
        this.source = source;
        this.goals = goals;
    }

    @Override
    public void search(){
        int i;
        for (i=0;;i++){
            AgentDLS agent = new AgentDLS(source,goals,i);
            agent.search();
        }
    }

    @Override
    public List<Node> printPath(Node target) {
        return null;
    }
}
