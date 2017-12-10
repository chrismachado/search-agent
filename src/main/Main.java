package main;

import interfaces.AbstractAgent;
import resource.Edge;
import resource.Node;
import resource.RomeniaMap;
import search.AgentUCS;

public class Main {
    public static void main(String[] args) {

        RomeniaMap romenia = new RomeniaMap();

        AbstractAgent agent = new AgentUCS(romenia.oradea(),romenia.craiova());

        agent.search();
    }
}
