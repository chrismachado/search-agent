package main;

import interfaces.AbstractAgent;
import resource.RomaniaMap;
import resource.VacuumCleaner;
import search.*;

public class Main {
    public static void main(String[] args) {

        VacuumCleaner vc = new VacuumCleaner();

        AbstractAgent agent = new AgentDFS(vc.dss(),vc.dll());

        agent.search();

    }
}
