package View;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle;
import javax.swing.border.*;
import Model.Supplier;
import Controller.SupplierController;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class   SupplierManagementUI extends javax.swing.JFrame {

    DefaultTableModel model;
    Supplier ObjSupplier;
    SupplierController ObjController;
    ArrayList<Supplier> SupplierList;
    int index;

    public SupplierManagementUI() {
        initComponents();
        ObjController = new SupplierController();
        SupplierList = new ArrayList<>();
        index = 0;
    }

    String SName;
    String SID;
    String Item;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    // Generated using JFormDesigner Evaluation license - Shadhujan
    private void initComponents() {
        jPanel1 = new JPanel();
        jPanel3 = new JPanel();
        jLabel3 = new JLabel();
        jLabel2 = new JLabel();
        txtSName = new JTextField();
        jLabel4 = new JLabel();
        txtSID = new JTextField();
        txtItem = new JTextField();
        bUpdate = new JButton();
        bDelete = new JButton();
        bAdd = new JButton();
        jPanel5 = new JPanel();
        jLabel7 = new JLabel();
        btnGoBack = new JButton();
        jPanel7 = new JPanel();
        jScrollPane1 = new JScrollPane();
        jTable1 = new JTable();
        jPanel4 = new JPanel();
        jLabel1 = new JLabel();
        txtSearch = new JTextField();
        bSearch = new JButton();
        jPanel2 = new JPanel();

        //======== this ========
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        var contentPane = getContentPane();

        //======== jPanel1 ========
        {
            jPanel1.setBackground(new Color(0x2c2f33));
            jPanel1.setBorder(new BevelBorder(BevelBorder.RAISED));
            jPanel1.setForeground(new Color(0x999999));
            jPanel1.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new
            javax. swing. border. EmptyBorder( 0, 0, 0, 0) , "JF\u006frmD\u0065sig\u006eer \u0045val\u0075ati\u006fn", javax
            . swing. border. TitledBorder. CENTER, javax. swing. border. TitledBorder. BOTTOM, new java
            .awt .Font ("Dia\u006cog" ,java .awt .Font .BOLD ,12 ), java. awt
            . Color. red) ,jPanel1. getBorder( )) ); jPanel1. addPropertyChangeListener (new java. beans.
            PropertyChangeListener( ){ @Override public void propertyChange (java .beans .PropertyChangeEvent e) {if ("\u0062ord\u0065r" .
            equals (e .getPropertyName () )) throw new RuntimeException( ); }} );

            //======== jPanel3 ========
            {
                jPanel3.setBackground(new Color(0x2c2f33));

                //---- jLabel3 ----
                jLabel3.setFont(new Font("Segoe UI", Font.BOLD, 18));
                jLabel3.setForeground(new Color(0xdfdfdf));
                jLabel3.setText("Supplier Name");

                //---- jLabel2 ----
                jLabel2.setFont(new Font("Segoe UI", Font.BOLD, 18));
                jLabel2.setForeground(new Color(0xdfdfdf));
                jLabel2.setText("Supplier ID");

                //---- txtSName ----
                txtSName.setBackground(new Color(0x190032));
                txtSName.setFont(new Font(Font.DIALOG, Font.BOLD, 18));
                txtSName.setForeground(new Color(0xdfdfdf));
                txtSName.setBorder(new TitledBorder(""));

                //---- jLabel4 ----
                jLabel4.setFont(new Font("Segoe UI", Font.BOLD, 18));
                jLabel4.setForeground(new Color(0xdfdfdf));
                jLabel4.setText("Vehicle Part Name");

                //---- txtSID ----
                txtSID.setBackground(new Color(0x190032));
                txtSID.setFont(new Font(Font.DIALOG, Font.BOLD, 18));
                txtSID.setForeground(new Color(0xdfdfdf));
                txtSID.setBorder(new TitledBorder(""));

                //---- txtItem ----
                txtItem.setBackground(new Color(0x190032));
                txtItem.setFont(new Font(Font.DIALOG, Font.BOLD, 18));
                txtItem.setForeground(new Color(0xdfdfdf));
                txtItem.setBorder(new TitledBorder(""));

                //---- bUpdate ----
                bUpdate.setBackground(new Color(0x23272a));
                bUpdate.setFont(new Font("Segoe UI", Font.BOLD, 14));
                bUpdate.setForeground(new Color(0xdfdfdf));
                bUpdate.setText("UPDATE");
                bUpdate.addActionListener(e -> bUpdateActionPerformed(e));

                //---- bDelete ----
                bDelete.setBackground(new Color(0x23272a));
                bDelete.setFont(new Font("Segoe UI", Font.BOLD, 14));
                bDelete.setForeground(new Color(0xdfdfdf));
                bDelete.setText("DELETE");
                bDelete.addActionListener(e -> bDeleteActionPerformed(e));

                //---- bAdd ----
                bAdd.setBackground(new Color(0x23272a));
                bAdd.setFont(new Font("Segoe UI", Font.BOLD, 14));
                bAdd.setForeground(new Color(0xdfdfdf));
                bAdd.setText("ADD");
                bAdd.addActionListener(e -> bAddActionPerformed(e));

                GroupLayout jPanel3Layout = new GroupLayout(jPanel3);
                jPanel3.setLayout(jPanel3Layout);
                jPanel3Layout.setHorizontalGroup(
                    jPanel3Layout.createParallelGroup()
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel3Layout.createParallelGroup()
                                .addComponent(jLabel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel3Layout.createParallelGroup()
                                .addComponent(txtItem, GroupLayout.PREFERRED_SIZE, 197, GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtSName, GroupLayout.PREFERRED_SIZE, 197, GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtSID, GroupLayout.PREFERRED_SIZE, 197, GroupLayout.PREFERRED_SIZE))
                            .addContainerGap())
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(35, 35, 35)
                            .addComponent(bAdd, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(bUpdate)
                            .addGap(18, 18, 18)
                            .addComponent(bDelete, GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                            .addGap(49, 49, 49))
                );
                jPanel3Layout.setVerticalGroup(
                    jPanel3Layout.createParallelGroup()
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(24, 24, 24)
                            .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(txtSName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtSID, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtItem, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(bUpdate)
                                .addComponent(bDelete)
                                .addComponent(bAdd))
                            .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
            }

            //======== jPanel5 ========
            {
                jPanel5.setBackground(new Color(0x190032));

                //---- jLabel7 ----
                jLabel7.setBackground(Color.white);
                jLabel7.setFont(new Font("Segoe UI", Font.BOLD, 24));
                jLabel7.setForeground(Color.white);
                jLabel7.setText("Manage Suppliers");

                //---- btnGoBack ----
                btnGoBack.setBackground(new Color(0x23272a));
                btnGoBack.setFont(new Font(Font.DIALOG, Font.ITALIC, 11));
                btnGoBack.setForeground(new Color(0xdfdfdf));
                btnGoBack.setText("Back");
                btnGoBack.addActionListener(e -> btnGoBackActionPerformed(e));

                GroupLayout jPanel5Layout = new GroupLayout(jPanel5);
                jPanel5.setLayout(jPanel5Layout);
                jPanel5Layout.setHorizontalGroup(
                    jPanel5Layout.createParallelGroup()
                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(btnGoBack, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
                            .addGap(230, 230, 230)
                            .addComponent(jLabel7)
                            .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
                jPanel5Layout.setVerticalGroup(
                    jPanel5Layout.createParallelGroup()
                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                            .addContainerGap(22, Short.MAX_VALUE)
                            .addGroup(jPanel5Layout.createParallelGroup()
                                .addComponent(btnGoBack)
                                .addComponent(jLabel7, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE))
                            .addContainerGap())
                );
            }

            //======== jPanel7 ========
            {
                jPanel7.setBackground(new Color(0x190032));

                //======== jScrollPane1 ========
                {

                    //---- jTable1 ----
                    jTable1.setBackground(new Color(0x190032));
                    jTable1.setBorder(new BevelBorder(BevelBorder.RAISED));
                    jTable1.setFont(new Font(Font.DIALOG, Font.BOLD, 12));
                    jTable1.setForeground(new Color(0xdfdfdf));
                    jTable1.setModel(new DefaultTableModel(
                        new Object[][] {
                        },
                        new String[] {
                            "Supplier Name", "Supplier ID", "Item"
                        }
                    ) {
                        Class<?>[] columnTypes = new Class<?>[] {
                            String.class, String.class, String.class
                        };
                        @Override
                        public Class<?> getColumnClass(int columnIndex) {
                            return columnTypes[columnIndex];
                        }
                    });
                    jTable1.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mouseClicked(MouseEvent e) {
                            jTable1MouseClicked(e);
                        }
                    });
                    jScrollPane1.setViewportView(jTable1);
                }

                //======== jPanel4 ========
                {
                    jPanel4.setBackground(new Color(0x2c2f33));

                    //---- jLabel1 ----
                    jLabel1.setFont(new Font("Segoe UI", Font.BOLD, 14));
                    jLabel1.setForeground(new Color(0xdfdfdf));
                    jLabel1.setText("Search By Supplier ID");

                    //---- txtSearch ----
                    txtSearch.setBackground(new Color(0x190032));
                    txtSearch.setFont(new Font(Font.DIALOG, Font.BOLD, 14));
                    txtSearch.setForeground(new Color(0xdfdfdf));
                    txtSearch.setBorder(new TitledBorder(""));

                    //---- bSearch ----
                    bSearch.setBackground(new Color(0x23272a));
                    bSearch.setFont(new Font("Segoe UI", Font.BOLD, 14));
                    bSearch.setForeground(new Color(0xdfdfdf));
                    bSearch.setText("Search");
                    bSearch.addActionListener(e -> bSearchActionPerformed(e));

                    GroupLayout jPanel4Layout = new GroupLayout(jPanel4);
                    jPanel4.setLayout(jPanel4Layout);
                    jPanel4Layout.setHorizontalGroup(
                        jPanel4Layout.createParallelGroup()
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 157, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSearch, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bSearch, GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                                .addGap(13, 13, 13))
                    );
                    jPanel4Layout.setVerticalGroup(
                        jPanel4Layout.createParallelGroup()
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(txtSearch, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bSearch))
                                .addGap(0, 10, Short.MAX_VALUE))
                    );
                }

                GroupLayout jPanel7Layout = new GroupLayout(jPanel7);
                jPanel7.setLayout(jPanel7Layout);
                jPanel7Layout.setHorizontalGroup(
                    jPanel7Layout.createParallelGroup()
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel7Layout.createParallelGroup()
                                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 410, GroupLayout.PREFERRED_SIZE)
                                .addComponent(jPanel4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
                jPanel7Layout.setVerticalGroup(
                    jPanel7Layout.createParallelGroup()
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jPanel4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
            }

            GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
            jPanel1.setLayout(jPanel1Layout);
            jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup()
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6))
                    .addComponent(jPanel5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );
            jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup()
                            .addComponent(jPanel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addComponent(jPanel1, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(null);

        //======== jPanel2 ========
        {
            jPanel2.setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder
            (0,0,0,0), "JF\u006frmD\u0065sig\u006eer \u0045val\u0075ati\u006fn",javax.swing.border.TitledBorder.CENTER,javax.swing.border
            .TitledBorder.BOTTOM,new java.awt.Font("Dia\u006cog",java.awt.Font.BOLD,12),java.awt
            .Color.red),jPanel2. getBorder()));jPanel2. addPropertyChangeListener(new java.beans.PropertyChangeListener(){@Override public void
            propertyChange(java.beans.PropertyChangeEvent e){if("\u0062ord\u0065r".equals(e.getPropertyName()))throw new RuntimeException()
            ;}});

            GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
            jPanel2.setLayout(jPanel2Layout);
            jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup()
                    .addGap(0, 400, Short.MAX_VALUE)
            );
            jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup()
                    .addGap(0, 300, Short.MAX_VALUE)
            );
        }
    }// </editor-fold>//GEN-END:initComponents

    private void bSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSearchActionPerformed
        try {
            String searchSupplier = txtSearch.getText();
            for (Supplier W : SupplierList) {
                if (W.getSID().contains(searchSupplier)) {
                    JOptionPane.showMessageDialog(rootPane, W.toString(), "Info ", 0);
                    return;
                }
            }
            JOptionPane.showMessageDialog(rootPane, "Supplier Details Not Found", "Info ", 0);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(rootPane, "Invalid User Input", "Error", 0);
        }
    }//GEN-LAST:event_bSearchActionPerformed

    private void bUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bUpdateActionPerformed
        model = (DefaultTableModel) jTable1.getModel();
        if (jTable1.getSelectedRowCount() == 1) {
            SName = txtSName.getText();
            SID = txtSID.getText();
            Item = txtItem.getText();

            model.setValueAt(SName, jTable1.getSelectedRow(), 0);
            model.setValueAt(SID, jTable1.getSelectedRow(), 1);
            model.setValueAt(Item, jTable1.getSelectedRow(), 2);

            JOptionPane.showMessageDialog(rootPane, "Updated a Supplier", "Sucess", JOptionPane.INFORMATION_MESSAGE);
        } else {
            if (jTable1.getSelectedRowCount() == 0) {
                JOptionPane.showMessageDialog(rootPane, "Table Is Empty", "Info", 0);
            } else {
                JOptionPane.showMessageDialog(rootPane, "Please Select Atleast One Row", "Info", 0);
            }
        }
    }//GEN-LAST:event_bUpdateActionPerformed

    private void bDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDeleteActionPerformed
        if (jTable1.getSelectedRowCount() == 1) {
            model.removeRow(jTable1.getSelectedRow());
            SupplierList.remove(index);
            JOptionPane.showMessageDialog(rootPane, "Deleted", "Sucess", JOptionPane.INFORMATION_MESSAGE);
            index--;
        } else {
            if (jTable1.getSelectedRowCount() == 0) {
                JOptionPane.showMessageDialog(rootPane, "Table Is Empty", "Info", 0);
            } else {
                JOptionPane.showMessageDialog(rootPane, "Please Select Atleast One Row", "Info", 0);
            }
        }


    }//GEN-LAST:event_bDeleteActionPerformed

    private void bAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAddActionPerformed
        try {
            SName = txtSName.getText();
            SID = txtSID.getText();
            Item = txtItem.getText();

            ObjSupplier = ObjController.addVehicle(SID, SName, Item);

            model = (DefaultTableModel) jTable1.getModel();
            model.addRow(new Object[]{
                SName,
                SID,
                Item,});

            SupplierList.add(ObjSupplier);
            index++;

            JOptionPane.showMessageDialog(rootPane, "Added a Supplier" + index, "Sucess", JOptionPane.INFORMATION_MESSAGE);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(rootPane, "Invalid User Input", "Error", 0);
        }
    }//GEN-LAST:event_bAddActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        model = (DefaultTableModel) jTable1.getModel();

        String tblSName = model.getValueAt(jTable1.getSelectedRow(), 0).toString();
        String tblSID = model.getValueAt(jTable1.getSelectedRow(), 1).toString();
        String tblItem = model.getValueAt(jTable1.getSelectedRow(), 2).toString();

        txtSName.setText(tblSName);
        txtSID.setText(tblSID);
        txtItem.setText(tblItem);

    }//GEN-LAST:event_jTable1MouseClicked

    private void btnGoBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoBackActionPerformed
        //BACK TO MAIN UI
        PaperClipsMainUI MainUI = new PaperClipsMainUI();
        MainUI.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnGoBackActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new SupplierManagementUI().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Shadhujan
    private JPanel jPanel1;
    private JPanel jPanel3;
    private JLabel jLabel3;
    private JLabel jLabel2;
    private JTextField txtSName;
    private JLabel jLabel4;
    private JTextField txtSID;
    private JTextField txtItem;
    private JButton bUpdate;
    private JButton bDelete;
    private JButton bAdd;
    private JPanel jPanel5;
    private JLabel jLabel7;
    private JButton btnGoBack;
    private JPanel jPanel7;
    private JScrollPane jScrollPane1;
    private JTable jTable1;
    private JPanel jPanel4;
    private JLabel jLabel1;
    private JTextField txtSearch;
    private JButton bSearch;
    private JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
