package main;

import interfaces.AbstractAgent;
import resource.RomaniaMap;
import search.*;

public class Main {
    public static void main(String[] args) {

        RomaniaMap romania = new RomaniaMap();

        AbstractAgent agent = new AgentDFS(romania.oradea(),romania.fagaras());

        agent.search();

    }
}
