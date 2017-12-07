package com;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Node arad = new Node(null, null, City.ARAD.name()); // start
        Node sibiu = new Node(null, null, City.SIBIU.name());
        Node fagaras = new Node(null, null, City.FAGARAS.name());
        Node bucharest = new Node(null, null, City.BUCHAREST.name()); // end


        arad.setNeighbor(new Node[]{sibiu});
        sibiu.setNeighbor(new Node[]{fagaras, arad});
        fagaras.setNeighbor(new Node[]{bucharest, sibiu});
        bucharest.setNeighbor(new Node[]{fagaras});


        List<Node> t = new ArrayList<Node>();
        System.out.println(t.get(0));



    }
}
