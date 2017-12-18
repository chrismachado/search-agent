package main;

import interfaces.AbstractAgent;
import resource.RomaniaMap;
import search.*;

public class Main {
    public static void main(String[] args) {

        RomaniaMap romania = new RomaniaMap();

        AbstractAgent agent = new AgentIDS(romania.oradea(),romania.craiova());

        agent.search();

    }
}
