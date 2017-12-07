package com;

import java.util.ArrayList;
import java.util.List;

public class AgentDFS implements AbstractAgent {
    private List<Node> fringe = new ArrayList<Node>();
    private List<Node> solution = null;
    private Tree tree = new Tree();

    @Override
    public List<Node> search(Node start, Node goal) {
        fringe.add(start);
        Node current = null;

        while(fringe != null) {
            current = extractFringe();

            if(current.getName() == goal.getName()) {
                while(current.getParent() != null) {
                    solution.add(current.getParent());
                    current = current.getParent();
                }
                return solution;
            } else
                tree.insert(current, null);
                fringe = expand(current.getNeighbor());
        }

        return solution;
    }

    /**
     * Este método atualiza a borda com os nós vizinhos de um nó visitado
     *
     * @return retorna a nova borda
    * */
    private List<Node> expand(Node[] nodes) {
        List<Node> newFringe = new ArrayList<Node>();

        for (Node node : nodes)
            newFringe.add(node);

        for (int i = 0; i < fringe.size(); i++)
            newFringe.add(fringe.get(i));

        return newFringe;
    }

    /**
     * Remove um elemento da borda
     *
     * @return o elemento retirado da borda
     */
    private Node extractFringe() {
        return fringe.remove(0);
    }


}
