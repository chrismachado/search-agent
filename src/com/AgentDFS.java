package com;

import java.util.ArrayList;
import java.util.List;

public class AgentDFS implements Agent {
    private List<Node> fringe = new ArrayList<Node>();

    @Override
    public Node search(Node start, Node goal) {



        return null;
    }

    /**
     * Este método atualiza a borda com os nós vizinhos de um nó visitado
    * */
    private void expand(Node[] nodes) {
        List<Node> newFringe = new ArrayList<Node>();

        for (Node node : nodes)
            newFringe.add(node);

        for (int i = 0; i < fringe.size(); i++)
            newFringe.add(fringe.get(i));

        fringe = newFringe;
    }
}
