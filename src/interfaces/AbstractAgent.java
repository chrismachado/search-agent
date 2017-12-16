package interfaces;

import resource.Node;

import java.util.List;

public interface AbstractAgent {
    public void search();
    public List<Node> printPath(Node target);
}
