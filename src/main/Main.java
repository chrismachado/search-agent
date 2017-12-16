package main;

import interfaces.AbstractAgent;
import resource.RomaniaMap;
import search.AgentBFS;
import search.AgentUCS;

public class Main {
    public static void main(String[] args) {

        RomaniaMap romania = new RomaniaMap();

        AbstractAgent agent = new AgentBFS(romania.arad(),romania.bucharest());

        agent.search();


    }
}
