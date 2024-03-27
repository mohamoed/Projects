public class NodeInfo {
    private int id;
    private Node node;

    public NodeInfo(int id, Node node) {
        this.id = id;
        this.node = node;
    }

    public int getId() {
        return id;
    }

    public Node getNode() {
        return node;
    }

    public int getPort() {
        return node.getPort();
    }
}
