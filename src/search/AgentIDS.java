package search;

import resource.Node;

public class AgentIDS extends AgentDLS{

    public AgentIDS(Node source, Node goals) {
        super(source, goals, 0);
    }

    @Override
    public void search(){
        for (int iterate=0; !super.isFound() ; iterate++){
            AgentDLS agent = new AgentDLS(super.getSource(), super.getGoals(), iterate);
            agent.search();
        }
    }

}
