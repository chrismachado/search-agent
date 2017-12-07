package com;

import java.util.ArrayList;
import java.util.List;

public class AgentDFS implements AbstractAgent {
    private List<Node> fringe = new ArrayList<Node>();
    private List<Node> solution = new ArrayList<Node>();
    private Tree tree = new Tree();

    @Override
    public List<Node> search(Node start, Node goal) {
        fringe.add(start);
        Node current = null;


        while(fringe != null) {
            if(fringe == null) {
                System.out.println("Falha ao alcançar objetivo");
                return null;
            }

            if(current != null && current.getName() == goal.getName()) {
                System.out.println("Objetivo alcançado. Gerando caminho...");
                while(current != null) {
                    solution.add(current);
                    current = current.getParent();
                    System.out.println("This is current : " + current);
                    System.out.println("This is current's parent : " + current.getParent());
                }
                return solution;

            } else {
                current = extractFringe();
                fringe = expand(current.getNeighbor());

                // ========================================================
                //              ERRO A PARTIR DAQUI
                // ========================================================

                if (fringe.isEmpty())
                    tree.insert(fringe.get(0));
                else
                    tree.insert(fringe.get(0), current);
            }
            System.out.println(current.getName());
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
