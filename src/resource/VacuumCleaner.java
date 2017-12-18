package resource;

public class VacuumCleaner {

    private Node ess, esl, els, ell, dss, dsl, dls, dll;


    public VacuumCleaner() {
        createState();
        nearStates();
    }

    private void createState() {
        this.ess = new Node("ESS");
        this.esl = new Node("ESL");
        this.els = new Node("ELS");
        this.ell = new Node("ELL");
        this.dss = new Node("DSS");
        this.dsl = new Node("DSL");
        this.dls = new Node("DLS");
        this.dll = new Node("DLL");
    }

    private void nearStates() {
        ess.setAdjacencies(new Edge[]{
                new Edge(els,0),
                new Edge(dss,0),
                new Edge(ess,0)
        });

        els.setAdjacencies(new Edge[]{
                new Edge(dls,0),
                new Edge(els,0)
        });

        esl.setAdjacencies(new Edge[]{
                new Edge(ell,0),
                new Edge(dsl, 0),
                new Edge(esl,0)
        });

        ell.setAdjacencies(new Edge[]{
                new Edge(dll,0),
                new Edge(ell,0)
        });

        dss.setAdjacencies(new Edge[]{
                new Edge(dsl,0),
                new Edge(ess,0),
                new Edge(dss,0)
        });

        dls.setAdjacencies(new Edge[]{
                new Edge(dll,0),
                new Edge(els,0),
                new Edge(dls,0)
        });

        dsl.setAdjacencies(new Edge[]{
                new Edge(esl,0),
                new Edge(dsl,0)
        });

        dll.setAdjacencies(new Edge[]{
                new Edge(ell,0),
                new Edge(dll,0)
        });
    }

    public Node ess() {
        return ess;
    }

    public Node esl() {
        return esl;
    }

    public Node els() {
        return els;
    }

    public Node ell() {
        return ell;
    }

    public Node dss() {
        return dss;
    }

    public Node dsl() {
        return dsl;
    }

    public Node dls() {
        return dls;
    }

    public Node dll() {
        return dll;
    }

}
