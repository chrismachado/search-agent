package main;

import interfaces.AbstractAgent;
import resource.Edge;
import resource.Node;
import resource.RomaniaMap;
import search.AgentUCS;

public class Main {
    public static void main(String[] args) {

        RomaniaMap romania = new RomaniaMap();

        AbstractAgent agent = new AgentUCS(romania.oradea(),romania.craiova());

        agent.search();
    }
}
