import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mosmo
 */
public class HeadGUI extends javax.swing.JFrame {
    private Coordinator coordinator;

    /**
     * Creates new form HeadGUI
     */
    public HeadGUI() {
        this.coordinator = new Coordinator(this);
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        NodeTitle = new javax.swing.JLabel();
        OverallNode = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        NodeTable = new javax.swing.JTable();
        AddButton = new javax.swing.JButton();
        RemoveButton = new javax.swing.JButton();
        ChatButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Lucida Sans", 1, 36)); // NOI18N
        jLabel1.setText("Coordinator");

        NodeTitle.setFont(new java.awt.Font("Consolas", 3, 15)); // NOI18N
        NodeTitle.setText("Nodes :");

        OverallNode.setFont(new java.awt.Font("Consolas", 3, 14)); // NOI18N
        OverallNode.setText("1");

        NodeTable.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        NodeTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {
                        { null, null },
                        { null, null },
                        { null, null },
                        { null, null }
                },
                new String[] {
                        "ID", "Port"
                }));
        jScrollPane1.setViewportView(NodeTable);

        AddButton.setBackground(new java.awt.Color(204, 255, 204));
        AddButton.setFont(new java.awt.Font("Arial Nova", 1, 18)); // NOI18N
        AddButton.setText("Add");
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });

        RemoveButton.setBackground(new java.awt.Color(255, 153, 153));
        RemoveButton.setFont(new java.awt.Font("Arial Nova", 1, 18)); // NOI18N
        RemoveButton.setText("Remove");
        RemoveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveButtonActionPerformed(evt);
            }
        });

        ChatButton.setBackground(new java.awt.Color(197, 197, 239));
        ChatButton.setFont(new java.awt.Font("Arial Nova", 1, 18)); // NOI18N
        ChatButton.setText("Chat");
        ChatButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChatButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(ChatButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(144, 144, 144))
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(55, 55, 55)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                false)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(AddButton,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 125,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        Short.MAX_VALUE)
                                                                .addComponent(RemoveButton,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 145,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(jScrollPane1,
                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 333,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(37, 37, 37)
                                                .addComponent(NodeTitle)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(OverallNode, javax.swing.GroupLayout.PREFERRED_SIZE, 23,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(91, 91, 91)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 229,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(27, Short.MAX_VALUE)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addGap(17, 17, 17)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(NodeTitle)
                                        .addComponent(OverallNode))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 163,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ChatButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30,
                                        Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(AddButton)
                                        .addComponent(RemoveButton))
                                .addGap(24, 24, 24)));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ChatButtonActionPerformed(java.awt.event.ActionEvent evt) {
        int selectedRow = NodeTable.getSelectedRow();
        if (selectedRow != -1) {
            int port = (int) NodeTable.getValueAt(selectedRow, 1);
            Node nodeToShow = coordinator.getNodeByPort(port);
            if (nodeToShow != null) {
                int nodeId = getNodeId(nodeToShow); // Get the ID of the selected node
                LinkedList<NodeInfo> otherNodes = new LinkedList<>();
                Node current = coordinator.getFirstNode();
                int currentId = 1;
                do {
                    if (current != nodeToShow) {
                        otherNodes.add(new NodeInfo(currentId, current));
                    }
                    current = current.getSuccessor();
                    currentId++;
                } while (current != coordinator.getFirstNode());

                NodesGUI nodeGUI = new NodesGUI(nodeToShow, nodeId, otherNodes); // Pass nodeId to NodesGUI constructor
                nodeGUI.setTitle("Node " + nodeId); // Set the title to "Node" + nodeId
                nodeGUI.setVisible(true);
            } else {
                System.out.println("Node not found!"); // Debugging message
            }
        } else {
            System.out.println("No row selected!"); // Debugging message
        }

    }// GEN-LAST:event_ChatButtonActionPerformed

    private int getNodeId(Node node) {
        Node current = coordinator.getFirstNode();
        int nodeId = 1;
        do {
            if (current == node) {
                return nodeId;
            }
            current = current.getSuccessor();
            nodeId++;
        } while (current != coordinator.getFirstNode());
        return -1; // Node not found
    }

    private void ListButtonActionPerformed(java.awt.event.ActionEvent evt) {
        DefaultTableModel model = (DefaultTableModel) NodeTable.getModel();
        model.setRowCount(0);

        // Get all nodes from the coordinator and add them to the table
        Node current = coordinator.getFirstNode();
        int rowCount = 0;
        do {
            model.addRow(new Object[] { rowCount + 1, current.getPort() });
            rowCount++;
            current = current.getSuccessor();
        } while (current != coordinator.getFirstNode());

        // Update overall node count
        OverallNode.setText(Integer.toString(rowCount));
    }

    public void updateNodeList() {
        DefaultTableModel model = (DefaultTableModel) NodeTable.getModel();
        model.setRowCount(0);

        // Get all nodes from the coordinator and add them to the table
        Node current = coordinator.getFirstNode();
        int rowCount = 0;
        do {
            model.addRow(new Object[] { rowCount + 1, current.getPort() });
            rowCount++;
            current = current.getSuccessor();
        } while (current != coordinator.getFirstNode());

        // Update overall node count
        OverallNode.setText(Integer.toString(rowCount));
    }

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {
        int newPort = generateRandomPort();

        // Create the new node
        Node newNode = new Node(newPort, coordinator.getFirstNode(), null, null); // Pass null for NodesGUI

        // Add the new node to the coordinator
        coordinator.addNode(newNode);

        // Increment the overall node count
        int newCount = Integer.parseInt(OverallNode.getText()) + 1;
        OverallNode.setText(Integer.toString(newCount));

        // Refresh the node list in the GUI
        updateNodeList();

    }

    private int generateRandomPort() {
        return (int) (Math.random() * 10000) + 10000; // Random port in the range [10000, 20000)
    }

    private void RemoveButtonActionPerformed(java.awt.event.ActionEvent evt) {
        int selectedRow = NodeTable.getSelectedRow();
        if (selectedRow != -1) {
            // Get the port of the node to be removed
            int port = (int) NodeTable.getValueAt(selectedRow, 1);

            // Find the node with the corresponding port in the coordinator
            Node nodeToRemove = coordinator.getFirstNode();
            while (nodeToRemove.getPort() != port) {
                nodeToRemove = nodeToRemove.getSuccessor();
                if (nodeToRemove == coordinator.getFirstNode()) {
                    // If the node is not found, exit the method
                    return;
                }
            }

            // Remove the node with the corresponding port from the coordinator
            coordinator.removeNode(nodeToRemove);

            // Refresh the node list in the GUI
            updateNodeList();
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HeadGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HeadGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HeadGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HeadGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HeadGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JButton ChatButton;
    private javax.swing.JTable NodeTable;
    private javax.swing.JLabel NodeTitle;
    private javax.swing.JLabel OverallNode;
    private javax.swing.JButton RemoveButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
