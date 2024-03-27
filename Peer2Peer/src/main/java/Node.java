
import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.net.*;
import java.util.LinkedList;

public class Node implements Runnable {

    private ServerSocket listenSocket;
    private Socket sendSocket;
    private Socket receiveSocket;
    private Node successor;
    private Node node;
    private int port;
    private JTextArea messageArea;
    private JTextField field;

    private NodesGUI nodeGUI;
    private Message message;

    public Node(int port, Node successor, JTextArea messageArea, NodesGUI nodeGUI) {
        this.successor = successor;
        this.port = port;
        this.messageArea = messageArea;
        this.nodeGUI = nodeGUI;

        try {
            listenSocket = new ServerSocket(port);
            System.out.println("Listening for messages on port: " + port);
            if (successor != null) {
                sendSocket = new Socket("localhost", successor.getPort());
            }
        } catch (IOException e) {
            System.out.println("Error connecting: " + e.getMessage());
        }

        new Thread(this).start();
    }

    public Node(int port, JTextArea messageArea, NodesGUI nodeGUI) {
        this.port = port;
        this.messageArea = messageArea;
        this.nodeGUI = nodeGUI;

        try {
            listenSocket = new ServerSocket(port);
            System.out.println("Listening for messages on port: " + port);
        } catch (IOException e) {
            System.out.println("Error connecting: " + e.getMessage());
        }

        new Thread(this).start();
    }

    @Override
    public void run() {
        try {
            while (true) {
                Socket socket = listenSocket.accept();
                ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
                Message message = (Message) in.readObject();

                // Process received message
                if (message.isPublic()) {
                    // Broadcast the message to all nodes
                    Node currentNode = node; // Start from the current node
                    do {
                        if (currentNode != null) {
                            currentNode.messageArea.append(message.getContent() + "\n");
                        }
                        if (currentNode.nodeGUI != null) {
                            currentNode.nodeGUI.appendMessageToChat(message.getContent());
                        }
                        currentNode = currentNode.getSuccessor();
                    } while (currentNode != node);
                } else {
                    if (message.getReceiver() == this) {
                        if (messageArea != null) {
                            messageArea.append(message.getContent() + "\n");
                        }
                        if (nodeGUI != null) {
                            nodeGUI.appendMessageToChat(message.getContent());
                        }
                    } else {
                        sendMessage(message, successor.getPort());
                        // Forward message to successor for private messages
                        // sendMessage(message ,socket);
                    }
                }
                in.close();
                socket.close();
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error receiving message: " + e.getMessage());
        } finally {
            try {
                listenSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        Node currentNode = node; // Start from the current node
        do {
            currentNode.messageArea.append(message.getContent() + "\n");
            if (currentNode.nodeGUI != null) {
                currentNode.nodeGUI.appendMessageToChat(message.getContent());
            }
            currentNode = currentNode.getSuccessor();
        } while (currentNode != node);
    }

    // function recieve message(check lw this node is the reciever if yes dec, print
    // )
    // if not send it to its successor
    public void sendMessage(Message message, int pport) {

        System.out.println(sendSocket.getLocalPort());
        try {
            Socket s = new Socket("localhost", pport);
            if (sendSocket != null) {
                ObjectOutputStream out = new ObjectOutputStream(s.getOutputStream());
                out.writeObject(message);
                // out.flush();
                out.close();
            }
        } catch (IOException e) {
            System.out.println("Error sending message: " + e.getMessage());
        }
    }

    public void recievemessage(Message message) {
        try {
            if (receiveSocket != null) {
                ObjectInputStream in = new ObjectInputStream(receiveSocket.getInputStream());
                Message receivedMessage = (Message) in.readObject();
                // Process the received message, for example, append it to the chat
                // Assuming nodeGUI is an instance of NodesGUI where you display the chat
                nodeGUI.appendMessageToChat(receivedMessage.getContent());
                in.close();
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error receiving message: " + e.getMessage());
        }
    }

    public int getPort() {
        return port;
    }

    public Node getSuccessor() {
        return successor;
    }

    public void setSuccessor(Node successor) {
        this.successor = successor;
    }

    public Socket getSendSocket() {
        return sendSocket;
    }
}
