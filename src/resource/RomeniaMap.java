package resource;

public class RomeniaMap {

    private Node arad, zerind, oradea, sibiu, fagaras, vilcea, pitesti, timisoara, lugoj, mehadia, drobeta, craiova, bucharest, giurgiu, urziceni, hirsova, eforie, vaslui, iasi, neamt;



    public RomeniaMap() {
        createCities();
        neighborRelationship();
    }

    private void createCities() {
        this.arad = new Node("Arad");
        this.zerind = new Node("Zerind");
        this.oradea = new Node("Oradea");
        this.sibiu = new Node("Sibiu");
        this.fagaras = new Node("Fagaras");
        this.vilcea = new Node("Reimnicu Vilcea");
        this.pitesti = new Node("Pitesti");
        this.timisoara = new Node("Timisoara");
        this.lugoj = new Node("Lugoj");
        this.mehadia = new Node("Mehadia");
        this.drobeta = new Node("Drobeta");
        this.craiova = new Node("Craiova");
        this.bucharest = new Node("Bucharest");
        this.giurgiu = new Node("Giurgiu");
        this.urziceni = new Node("Urziceni");
        this.hirsova = new Node("Hirsova");
        this.eforie = new Node("Eforie");
        this.vaslui = new Node("Vaslui");
        this.iasi = new Node("Iasi");
        this.neamt = new Node("Neamt");
    }

    private void neighborRelationship() {
        arad.setAdjacencies(new Edge[]{
                new Edge(zerind,75),
                new Edge(sibiu,140),
                new Edge(timisoara,118)
        });

        zerind.setAdjacencies(new Edge[]{
                new Edge(arad,75),
                new Edge(oradea,71)
        });

        oradea.setAdjacencies(new Edge[]{
                new Edge(zerind,71),
                new Edge(sibiu,151)
        });

        sibiu.setAdjacencies(new Edge[]{
                new Edge(arad,140),
                new Edge(fagaras,99),
                new Edge(oradea,151),
                new Edge(vilcea,80),
        });

        fagaras.setAdjacencies(new Edge[]{
                new Edge(sibiu,99),
                new Edge(bucharest,211)
        });

        vilcea.setAdjacencies(new Edge[]{
                new Edge(sibiu,80),
                new Edge(pitesti,97),
                new Edge(craiova,146)
        });

        pitesti.setAdjacencies(new Edge[]{
                new Edge(vilcea,97),
                new Edge(bucharest,101),
                new Edge(craiova,138)
        });

        timisoara.setAdjacencies(new Edge[]{
                new Edge(arad,118),
                new Edge(lugoj,111)
        });

        lugoj.setAdjacencies(new Edge[]{
                new Edge(timisoara,111),
                new Edge(mehadia,70)
        });

        mehadia.setAdjacencies(new Edge[]{
                new Edge(lugoj,70),
                new Edge(drobeta,75)
        });

        drobeta.setAdjacencies(new Edge[]{
                new Edge(mehadia,75),
                new Edge(craiova,120)
        });

        craiova.setAdjacencies(new Edge[]{
                new Edge(drobeta,120),
                new Edge(vilcea,146),
                new Edge(pitesti,138)
        });

        bucharest.setAdjacencies(new Edge[]{
                new Edge(pitesti,101),
                new Edge(giurgiu,90),
                new Edge(fagaras,211),
                new Edge(urziceni, 85)
        });

        giurgiu.setAdjacencies(new Edge[]{
                new Edge(bucharest,90)
        });

        urziceni.setAdjacencies(new Edge[]{
                new Edge(bucharest, 85),
                new Edge(hirsova, 98),
                new Edge(vaslui, 142)
        });
        hirsova.setAdjacencies(new Edge[]{
                new Edge(urziceni, 98),
                new Edge(eforie, 86)
        });
        eforie.setAdjacencies(new Edge[]{
                new Edge(hirsova, 86)
        });
        vaslui.setAdjacencies(new Edge[]{
                new Edge(urziceni, 142),
                new Edge(iasi, 92)
        });
        iasi.setAdjacencies(new Edge[]{
                new Edge(vaslui, 92),
                new Edge(neamt, 87)
        });
        neamt.setAdjacencies(new Edge[]{
                new Edge(iasi, 87)
        });
    }

    public Node arad() {
        return arad;
    }

    public Node zerind() {
        return zerind;
    }

    public Node oradea() {
        return oradea;
    }

    public Node sibiu() {
        return sibiu;
    }

    public Node fagaras() {
        return fagaras;
    }

    public Node vilcea() {
        return vilcea;
    }

    public Node pitesti() {
        return pitesti;
    }

    public Node timisoara() {
        return timisoara;
    }

    public Node lugoj() {
        return lugoj;
    }

    public Node mehadia() {
        return mehadia;
    }

    public Node drobeta() {
        return drobeta;
    }

    public Node craiova() {
        return craiova;
    }

    public Node bucharest() {
        return bucharest;
    }

    public Node giurgiu() {
        return giurgiu;
    }

    public Node urziceni() {
        return urziceni;
    }

    public Node hirsova() {
        return hirsova;
    }

    public Node eforie() {
        return eforie;
    }

    public Node vaslui() {
        return vaslui;
    }

    public Node iasi() {
        return iasi;
    }

    public Node neamt() {
        return neamt;
    }
}
