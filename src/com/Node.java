package com;

public class Node {

    private Node parent = null;
    private Node[] sons = null, neighbor;
    private String name = "";
    //private int cust = 0;


    public Node(Node parent, Node[] sons, String name) {
        this.parent = parent;
        this.sons = sons;
        this.name = name;
    }

//    public int height(Node node) {
//        if(node == null) return 0;
//        else return 1 + Math.max(height(node.left), height(node.right));
//    }


    public Node getParent() {
        return parent;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }

    public Node[] getSons() {
        return sons;
    }

    public void setSons(Node[] sons) {
        this.sons = sons;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Node[] getNeighbor() {
        return neighbor;
    }

    public void setNeighbor(Node[] neighbor) {
        this.neighbor = neighbor;
    }
}
