package com;

public class Tree {

    private Node root = null;


    /**
     * Inserir nós na árvore, caso não haja nenhum, o nó raiz é modificado
     *
     * @param node Nó que será inserido na árvore
     */
    public void insert(Node node, Node parent) {
        if(root == null) {
            root = node;
            return;
        }

        node.setParent(parent);
        parent.addSon(node);

    }

}
