package main;

import interfaces.AbstractAgent;
import resource.Edge;
import resource.Node;
import resource.RomeniaMap;
import search.AgentUCS;

public class Main {
    public static void main(String[] args) {

        RomaniaMap romania = new RomaniaMap();

        AbstractAgent agent = new AgentUCS(romenia.oradea(),romenia.craiova());

        agent.search();
    }
}
