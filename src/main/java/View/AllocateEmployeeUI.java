//@author niffzy

package View;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle;
import javax.swing.border.*;
import Model.Allocate;
import Controller.AllocateController;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Model.SendNotificationToEmployee;

public class AllocateEmployeeUI extends javax.swing.JFrame {

    DefaultTableModel model;
    Allocate ObjEmployee;
    AllocateController ObjController;
    ArrayList<Allocate> EmployeeList;
    int index;

    public AllocateEmployeeUI() {
        initComponents();

        ObjController = new AllocateController();
        EmployeeList = new ArrayList<>();
        index = 0;
    }
SendNotificationToEmployee SNTC = new SendNotificationToEmployee();
    static int Index=0;
    
    String EName;
    String EID;
    String JobID;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    // Generated using JFormDesigner Evaluation license - Shadhujan
    private void initComponents() {
        jPanel1 = new JPanel();
        jPanel3 = new JPanel();
        jLabel3 = new JLabel();
        jLabel2 = new JLabel();
        jLabel4 = new JLabel();
        txtEName = new JTextField();
        txtEID = new JTextField();
        txtJobID = new JTextField();
        bAdd = new JButton();
        bUpdate = new JButton();
        jPanel5 = new JPanel();
        jLabel7 = new JLabel();
        btnGoBack = new JButton();
        jPanel7 = new JPanel();
        jScrollPane1 = new JScrollPane();
        jTable1 = new JTable();
        jPanel2 = new JPanel();

        //======== this ========
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        var contentPane = getContentPane();

        //======== jPanel1 ========
        {
            jPanel1.setBackground(new Color(0x2c2f33));
            jPanel1.setForeground(new Color(0x999999));
            jPanel1.setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder
            (0,0,0,0), "JF\u006frm\u0044es\u0069gn\u0065r \u0045va\u006cua\u0074io\u006e",javax.swing.border.TitledBorder.CENTER,javax.swing.border
            .TitledBorder.BOTTOM,new java.awt.Font("D\u0069al\u006fg",java.awt.Font.BOLD,12),java.awt
            .Color.red),jPanel1. getBorder()));jPanel1. addPropertyChangeListener(new java.beans.PropertyChangeListener(){@Override public void
            propertyChange(java.beans.PropertyChangeEvent e){if("\u0062or\u0064er".equals(e.getPropertyName()))throw new RuntimeException()
            ;}});

            //======== jPanel3 ========
            {
                jPanel3.setBackground(new Color(0x2c2f33));

                //---- jLabel3 ----
                jLabel3.setFont(new Font(Font.DIALOG, Font.BOLD, 18));
                jLabel3.setForeground(new Color(0xdfdfdf));
                jLabel3.setText("Employee Name");

                //---- jLabel2 ----
                jLabel2.setFont(new Font(Font.DIALOG, Font.BOLD, 18));
                jLabel2.setForeground(new Color(0xdfdfdf));
                jLabel2.setText("Employee ID");

                //---- jLabel4 ----
                jLabel4.setFont(new Font(Font.DIALOG, Font.BOLD, 18));
                jLabel4.setForeground(new Color(0xdfdfdf));
                jLabel4.setText("Job ID");

                //---- txtEName ----
                txtEName.setBackground(new Color(0x190032));
                txtEName.setFont(new Font(Font.DIALOG, Font.BOLD, 18));
                txtEName.setForeground(new Color(0xdfdfdf));
                txtEName.setBorder(new TitledBorder(""));
                txtEName.addActionListener(e -> txtENameActionPerformed(e));

                //---- txtEID ----
                txtEID.setBackground(new Color(0x190032));
                txtEID.setFont(new Font(Font.DIALOG, Font.BOLD, 18));
                txtEID.setForeground(new Color(0xdfdfdf));
                txtEID.setBorder(new TitledBorder(""));

                //---- txtJobID ----
                txtJobID.setBackground(new Color(0x190032));
                txtJobID.setFont(new Font(Font.DIALOG, Font.BOLD, 18));
                txtJobID.setForeground(new Color(0xdfdfdf));
                txtJobID.setBorder(new TitledBorder(""));

                //---- bAdd ----
                bAdd.setBackground(new Color(0x23272a));
                bAdd.setFont(new Font(Font.DIALOG, Font.BOLD, 14));
                bAdd.setForeground(new Color(0xdfdfdf));
                bAdd.setText("Allocate");
                bAdd.addActionListener(e -> bAddActionPerformed(e));

                //---- bUpdate ----
                bUpdate.setBackground(new Color(0x23272a));
                bUpdate.setFont(new Font(Font.DIALOG, Font.BOLD, 14));
                bUpdate.setForeground(new Color(0xdfdfdf));
                bUpdate.setText("Update");
                bUpdate.addActionListener(e -> bUpdateActionPerformed(e));

                GroupLayout jPanel3Layout = new GroupLayout(jPanel3);
                jPanel3.setLayout(jPanel3Layout);
                jPanel3Layout.setHorizontalGroup(
                    jPanel3Layout.createParallelGroup()
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup()
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(39, 39, 39)
                                    .addGroup(jPanel3Layout.createParallelGroup()
                                        .addComponent(txtEName, GroupLayout.PREFERRED_SIZE, 197, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtEID, GroupLayout.PREFERRED_SIZE, 197, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtJobID, GroupLayout.PREFERRED_SIZE, 197, GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGap(68, 68, 68)
                                    .addComponent(bAdd, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(bUpdate, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)))
                            .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
                jPanel3Layout.setVerticalGroup(
                    jPanel3Layout.createParallelGroup()
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtEName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtEID, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtJobID, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(bUpdate, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                                .addComponent(bAdd, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
                            .addContainerGap())
                );
            }

            //======== jPanel5 ========
            {
                jPanel5.setBackground(new Color(0x190032));

                //---- jLabel7 ----
                jLabel7.setBackground(Color.white);
                jLabel7.setFont(new Font(Font.DIALOG, Font.BOLD, 24));
                jLabel7.setForeground(Color.white);
                jLabel7.setText("Allocate Employees To Repair Jobs");

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
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(btnGoBack, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
                            .addGap(91, 91, 91)
                            .addComponent(jLabel7)
                            .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
                jPanel5Layout.setVerticalGroup(
                    jPanel5Layout.createParallelGroup()
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(btnGoBack)
                            .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                            .addContainerGap(24, Short.MAX_VALUE)
                            .addComponent(jLabel7, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
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
                            "Employee Name", "Employee ID", "Allocated Job ID"
                        }
                    ) {
                        Class<?>[] columnTypes = new Class<?>[] {
                            String.class, String.class, String.class
                        };
                        boolean[] columnEditable = new boolean[] {
                            false, false, false
                        };
                        @Override
                        public Class<?> getColumnClass(int columnIndex) {
                            return columnTypes[columnIndex];
                        }
                        @Override
                        public boolean isCellEditable(int rowIndex, int columnIndex) {
                            return columnEditable[columnIndex];
                        }
                    });
                    jTable1.setSelectionForeground(new Color(0x190032));
                    jTable1.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mouseClicked(MouseEvent e) {
                            jTable1MouseClicked(e);
                        }
                    });
                    jScrollPane1.setViewportView(jTable1);
                }

                GroupLayout jPanel7Layout = new GroupLayout(jPanel7);
                jPanel7.setLayout(jPanel7Layout);
                jPanel7Layout.setHorizontalGroup(
                    jPanel7Layout.createParallelGroup()
                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                            .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 323, GroupLayout.PREFERRED_SIZE)
                            .addGap(170, 170, 170))
                );
                jPanel7Layout.setVerticalGroup(
                    jPanel7Layout.createParallelGroup()
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                            .addGap(15, 15, 15))
                );
            }

            GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
            jPanel1.setLayout(jPanel1Layout);
            jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup()
                    .addComponent(jPanel5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel7, GroupLayout.PREFERRED_SIZE, 345, GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 12, Short.MAX_VALUE))
            );
            jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel7, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE))
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
            jPanel2.setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(
            0,0,0,0), "JFor\u006dDesi\u0067ner \u0045valu\u0061tion",javax.swing.border.TitledBorder.CENTER,javax.swing.border.TitledBorder
            .BOTTOM,new java.awt.Font("Dia\u006cog",java.awt.Font.BOLD,12),java.awt.Color.
            red),jPanel2. getBorder()));jPanel2. addPropertyChangeListener(new java.beans.PropertyChangeListener(){@Override public void propertyChange(java.
            beans.PropertyChangeEvent e){if("bord\u0065r".equals(e.getPropertyName()))throw new RuntimeException();}});

            GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
            jPanel2.setLayout(jPanel2Layout);
            jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup()
                    .addGap(0, 100, Short.MAX_VALUE)
            );
            jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup()
                    .addGap(0, 100, Short.MAX_VALUE)
            );
        }
    }// </editor-fold>//GEN-END:initComponents

    private void txtENameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtENameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtENameActionPerformed

    private void bUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bUpdateActionPerformed
        model = (DefaultTableModel) jTable1.getModel();
        if (jTable1.getSelectedRowCount() == 1) {
            EName = txtEName.getText();
            EID = txtEID.getText();
            JobID = txtJobID.getText();

            model.setValueAt(EName, jTable1.getSelectedRow(), 0);
            model.setValueAt(EID, jTable1.getSelectedRow(), 1);
            model.setValueAt(JobID, jTable1.getSelectedRow(), 2);
            
            ObjEmployee = ObjController.addVehicle(EID, EName, JobID);
            //
            if(ObjController.updateEmployeeInDatabase()){
                JOptionPane.showMessageDialog(rootPane, "Updated Succesfully", "Sucess", 0);

            }else{
                JOptionPane.showMessageDialog(rootPane, "Cannot Update to Database" , "Error", 0);
            }
               //

            JOptionPane.showMessageDialog(rootPane, "Changes Saved", "Sucess", JOptionPane.INFORMATION_MESSAGE);

        } else {
            if (jTable1.getSelectedRowCount() == 0) {
                JOptionPane.showMessageDialog(rootPane, "Table Is Empty", "Info", 0);
            } else {
                JOptionPane.showMessageDialog(rootPane, "Please Select Atleast One Row", "Info", 0);
            }
        }
    }//GEN-LAST:event_bUpdateActionPerformed

    private void bAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAddActionPerformed
        try {
            EName = txtEName.getText();
            EID = txtEID.getText();
            JobID = txtJobID.getText();

            //
            ObjEmployee = ObjController.addVehicle(EID, EName, JobID);
            if(ObjController.addEmployeeToDatabase()){
                JOptionPane.showMessageDialog(rootPane, "Added Succesfully", "Sucess", 0);

            }else{
                JOptionPane.showMessageDialog(rootPane, "Cannot insert to Database" , "Error", 0);
            }
               //

            model = (DefaultTableModel) jTable1.getModel();
            model.addRow(new Object[]{
                EName,
                EID,
                JobID,});

            EmployeeList.add(ObjEmployee);
            index++;

            JOptionPane.showMessageDialog(rootPane, "Allocated An Employee - " + index, "Sucess", JOptionPane.INFORMATION_MESSAGE);
    
           
                SNTC.SendNotificationToEmployee();
                JOptionPane.showMessageDialog(this, "Notification Sent To Employee via Email", "Employee  Management", JOptionPane.INFORMATION_MESSAGE);
            

            
            
            
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(rootPane, "Invalid User Input", "Error", 0);
        }
    }//GEN-LAST:event_bAddActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        model = (DefaultTableModel) jTable1.getModel();

        String tblEName = model.getValueAt(jTable1.getSelectedRow(), 0).toString();
        String tblEID = model.getValueAt(jTable1.getSelectedRow(), 1).toString();
        String tblJobID = model.getValueAt(jTable1.getSelectedRow(), 2).toString();

        txtEName.setText(tblEName);
        txtEID.setText(tblEID);
        txtJobID.setText(tblJobID);

    }//GEN-LAST:event_jTable1MouseClicked

    private void btnGoBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoBackActionPerformed
        ManageEmployeeUI MRJUI = new ManageEmployeeUI();
        MRJUI.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnGoBackActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new AllocateEmployeeUI().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JPanel jPanel1;
    private JPanel jPanel3;
    private JLabel jLabel3;
    private JLabel jLabel2;
    private JLabel jLabel4;
    private JTextField txtEName;
    private JTextField txtEID;
    private JTextField txtJobID;
    private JButton bAdd;
    private JButton bUpdate;
    private JPanel jPanel5;
    private JLabel jLabel7;
    private JButton btnGoBack;
    private JPanel jPanel7;
    private JScrollPane jScrollPane1;
    private JTable jTable1;
    private JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
