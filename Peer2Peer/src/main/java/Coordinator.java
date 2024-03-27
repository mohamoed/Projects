import java.util.LinkedList;
import java.util.List;

public class Coordinator {

  private static final int DEFAULT_PORT = 5000;
  private List<Node> NodeList;

  private Node firstNode;
  private HeadGUI coordinatorGUI; // Reference to the GUI class

  public Coordinator(Node firstNode, HeadGUI coordinatorGUI) {
    this.firstNode = firstNode;
    this.coordinatorGUI = coordinatorGUI;
    this.NodeList = new LinkedList<>();
    NodeList.add(firstNode);

  }

  public Coordinator(HeadGUI coordinatorGUI) {
    Node firstNode = new Node(DEFAULT_PORT, null, null, null);
    this.firstNode = firstNode;
    // Since it's the only node, it is its own successor
    firstNode.setSuccessor(firstNode);
    this.coordinatorGUI = coordinatorGUI;
    this.NodeList = new LinkedList<>();
    NodeList.add(firstNode);
  }

  public void addNode(Node newNode) {
    if (firstNode == null) {
      firstNode = newNode;
      firstNode.setSuccessor(newNode);
    } else {
      Node current = firstNode;
      while (current.getSuccessor() != firstNode) {
        current = current.getSuccessor();
      }
      current.setSuccessor(newNode);
      newNode.setSuccessor(firstNode);
    }
    // Manually update GUI
    NodeList.add(newNode);
    updateGUI();
  }

  public void removeNode(Node leavingNode) {
    if (leavingNode == firstNode) {
      Node current = firstNode;
      while (current.getSuccessor() != firstNode) {
        current = current.getSuccessor();
      }
      current.setSuccessor(leavingNode.getSuccessor());
      if (current == leavingNode) {
        firstNode = null;
      } else {
        firstNode = leavingNode.getSuccessor();
      }
    } else {
      Node predecessor = firstNode;
      while (predecessor.getSuccessor() != leavingNode) {
        predecessor = predecessor.getSuccessor();
      }
      predecessor.setSuccessor(leavingNode.getSuccessor());
    }
    NodeList.remove(leavingNode);
    // Manually update GUI
    updateGUI();
  }

  private void updateGUI() {
    if (coordinatorGUI != null) {
      // Call methods in the GUI class to update the node list display
      coordinatorGUI.updateNodeList();
    }
  }

  public Node getFirstNode() {
    return firstNode;
  }

  public Node getNodeByPort(int port) {
    for (Node node : NodeList) {
      if (node.getPort() == port) {
        return node;
      }
    }
    return null;
  }

}