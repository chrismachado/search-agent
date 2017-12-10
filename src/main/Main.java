package main;

import interfaces.AbstractAgent;
import resource.Edge;
import resource.Node;
import search.AgentUCS;

public class Main {
    public static void main(String[] args) {



        Node n1 = new Node("Arad");
        Node n2 = new Node("Zerind");
        Node n3 = new Node("Oradea");
        Node n4 = new Node("Sibiu");
        Node n5 = new Node("Fagaras");
        Node n6 = new Node("Reimnicu Vilcea");
        Node n7 = new Node("Pitesti");
        Node n8 = new Node("Timesoara");
        Node n9 = new Node("Lugoj");
        Node n10 = new Node("Mehadia");
        Node n11 = new Node("Drobeta");
        Node n12 = new Node("Craiova");
        Node n13 = new Node("Bucharest");
        Node n14 = new Node("Giurgiu");

        n1.setAdjacencies(new Edge[]{
                new Edge(n2,75),
                new Edge(n4,140),
                new Edge(n8,118)
        });

        n2.setAdjacencies(new Edge[]{
                new Edge(n1,75),
                new Edge(n3,71)
        });

        n3.setAdjacencies(new Edge[]{
                new Edge(n2,71),
                new Edge(n4,151)
        });

        n4.setAdjacencies(new Edge[]{
                new Edge(n1,140),
                new Edge(n5,99),
                new Edge(n3,151),
                new Edge(n6,80),
        });

        n5.setAdjacencies(new Edge[]{
                new Edge(n4,99),
                new Edge(n13,211)
        });

        n6.setAdjacencies(new Edge[]{
                new Edge(n4,80),
                new Edge(n7,97),
                new Edge(n12,146)
        });

        n7.setAdjacencies(new Edge[]{
                new Edge(n6,97),
                new Edge(n13,101),
                new Edge(n12,138)
        });

        n8.setAdjacencies(new Edge[]{
                new Edge(n1,118),
                new Edge(n9,111)
        });

        n9.setAdjacencies(new Edge[]{
                new Edge(n8,111),
                new Edge(n10,70)
        });

        n10.setAdjacencies(new Edge[]{
                new Edge(n9,70),
                new Edge(n11,75)
        });

        n11.setAdjacencies(new Edge[]{
                new Edge(n10,75),
                new Edge(n12,120)
        });

        n12.setAdjacencies(new Edge[]{
                new Edge(n11,120),
                new Edge(n6,146),
                new Edge(n7,138)
        });

        n13.setAdjacencies(new Edge[]{
                new Edge(n7,101),
                new Edge(n14,90),
                new Edge(n5,211)
        });

        n14.setAdjacencies(new Edge[]{
                new Edge(n13,90)
        });

        AbstractAgent agent = new AgentUCS(n1,n13);
        agent.search();
    }
}
