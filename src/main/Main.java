package main;

import interfaces.AbstractAgent;
import resource.RomaniaMap;
import search.AgentBFS;
import search.AgentDFS;
import search.AgentDFSraw;
import search.AgentUCS;

public class Main {
    public static void main(String[] args) {

        RomaniaMap romania = new RomaniaMap();

        AbstractAgent agent = new AgentDFSraw(romania.oradea(),romania.craiova());

        agent.search();


    }
}
