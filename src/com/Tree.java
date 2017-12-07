package com;

public class Tree {

    private Node root = null;


    /**
     * Inserir nós na árvore, caso não haja nenhum, o nó raiz é modificado
     *
     * @param node Nó que será inserido na árvore
     */
    public void insert(Node node, Node parent) {

        node.setParent(parent);
        parent.addSon(node);

    }

    public void insert(Node node) {
        if (root == null) root = node;
        else
            insert(node, root);

    }

}
