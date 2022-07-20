package com.mycompany.mediaone.View.Employee;

import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.table.DefaultTableModel;
import com.mycompany.mediaone.Model.Employee;
import javax.swing.JOptionPane;

public final class Employee extends javax.swing.JPanel {

    DefaultTableModel model = null;
    ArrayList array = null;
    Vector vRow = null;
    Vector vData = null;
    Vector vTitle = null;
    Employee dao = null;
    ResultSet rs = null;
    ResultSetMetaData rsm = null;
    ButtonGroup bg = new ButtonGroup();
    ButtonGroup bg2 = new ButtonGroup();
    
    public Employee() {
        initComponents();
        bg.add(rdMan);
        bg.add(rdWoman);

        bg2.add(rdActive);
        bg2.add(rdNotActive);
        vTitle = new Vector();
        vData = new Vector();
        reload();
    }

    public boolean checkText() {
        boolean b = true;
        if (txtEmployeeName.getText().equals("") || txtAddress.getText().equals("") || txtBirthday.getText().equals("") || txtPhone.getText().equals("") || (rdActive.isSelected() == false && rdNotActive.isSelected() == false)) {
            b = false;
        }
        return b;
    }

    public void clearText() {
        txtAddress.setText("");
        txtBirthday.setText("");
        txtEmployeeID.setText("");
        txtEmployeeName.setText("");
        txtPassword.setText("");
        txtPhone.setText("");
        txtUsername.setText("");
        rdActive.setSelected(false);
        rdNotActive.setSelected(false);
        rdMan.setSelected(false);
        rdWoman.setSelected(false);
        cbRole.setSelectedIndex(0);

    }

    public void reload() {
        try {
            dao = EmployeeDAOImp.getInstance();
            rs = dao.getAllEmployee();
            rsm = rs.getMetaData();

            vTitle.clear();
            vData.clear();
            for (int i = 1; i <= rsm.getColumnCount(); i++) {
                vTitle.add(rsm.getColumnLabel(i));
            }

            while (rs.next()) {
                vRow = new Vector();
                for (int i = 1; i <= rsm.getColumnCount(); i++) {
                    vRow.add(rs.getString(i));
                }
                vData.add(vRow);
            }
            model = new DefaultTableModel();
            model.setDataVector(vData, vTitle);
            table.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(pnlEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtEmployeeID = new javax.swing.JTextField();
        txtEmployeeName = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        txtBirthday = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        rdMan = new javax.swing.JRadioButton();
        rdWoman = new javax.swing.JRadioButton();
        cbRole = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        rdActive = new javax.swing.JRadioButton();
        rdNotActive = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(1080, 654));
        setPreferredSize(new java.awt.Dimension(1080, 654));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        txtSearch.setText("input some information here...");
        txtSearch.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSearchFocusLost(evt);
            }
        });
        txtSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtSearchMouseClicked(evt);
            }
        });

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnAdd.setBackground(new java.awt.Color(102, 51, 255));
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Model/Images/1431349219_icon-person-add-24.png"))); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnEdit.setBackground(new java.awt.Color(255, 102, 51));
        btnEdit.setForeground(new java.awt.Color(255, 255, 255));
        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Model/Images/1431349243_user_profile_edit-24.png"))); // NOI18N
        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(102, 255, 102));
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Model/Images/1431349366_delete.png"))); // NOI18N
        btnDelete.setText("Active/Deactive");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jLabel1.setText("EmployeeID");

        jLabel2.setText("Employee Name");

        jLabel3.setText("Address");

        jLabel4.setText("Phone");

        jLabel5.setText("Birthday");

        jLabel6.setText("Sex");

        jLabel7.setText("Username");

        jLabel8.setText("Password");

        jLabel9.setText("Role");

        rdMan.setText("Man");

        rdWoman.setText("Woman");

        cbRole.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Quản Lý", "Thu Ngân", "Phục Vụ" }));
        cbRole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbRoleActionPerformed(evt);
            }
        });

        jLabel10.setText("Status");

        rdActive.setText("Active");

        rdNotActive.setText("Not Active");
        rdNotActive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdNotActiveActionPerformed(evt);
            }
        });

        jLabel11.setText("Task Manager");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtBirthday, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtEmployeeName, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(50, 50, 50)
                        .addComponent(txtEmployeeID, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel7))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(cbRole, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel10))
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txtUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                                                .addComponent(txtPassword))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addComponent(jLabel9)))
                                .addGap(13, 13, 13)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rdActive)
                                    .addComponent(rdNotActive)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rdMan)
                                .addGap(18, 18, 18)
                                .addComponent(rdWoman)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSearch))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 693, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtEmployeeID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(rdMan)
                    .addComponent(rdWoman)
                    .addComponent(btnSearch))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmployeeName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel8)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtBirthday, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(rdNotActive)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdActive)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents

    @SuppressWarnings("empty-statement")
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        if (checkText() == false) {
            JOptionPane.showMessageDialog(this, "You must fill enough information to do this");
        };
        Employee employee = new Employee();
        employee.setAddress(txtAddress.getText());
        employee.setBirthday(txtBirthday.getText());
        employee.setEmployeeID(Integer.parseInt(txtEmployeeID.getText()));
        employee.setEmployeename(txtEmployeeName.getText());
        employee.setPassword(txtPassword.getText());
        employee.setPhone(txtPhone.getText());
        employee.setRole(cbRole.getSelectedItem().toString());
        String sex = "Woman";
        if (rdMan.isSelected()) {
            sex = "Man";
        }
        employee.setSex(sex);
        int status = 0;
        if (rdActive.isSelected()) {
            status = 1;
        }
        employee.setStatus(status);
        employee.setUsername(txtUsername.getText());
        EmployeeDAOImp.getInstance().insertEmployee(employee);
        reload();
        clearText();
    }//GEN-LAST:event_btnAddActionPerformed

    @SuppressWarnings("empty-statement")
    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        if ("".equals(txtEmployeeID.getText())) {
            JOptionPane.showMessageDialog(this, "You must select a row in table to do this!");
        }
        if (checkText() == false) {
            JOptionPane.showMessageDialog(this, "You must fill enough information to do this");
        };
        Employee employee = new Employee();
        employee.setAddress(txtAddress.getText());
        employee.setBirthday(txtBirthday.getText());
        employee.setEmployeeID(Integer.parseInt(txtEmployeeID.getText()));
        employee.setEmployeename(txtEmployeeName.getText());
        employee.setPassword(txtPassword.getText());
        employee.setPhone(txtPhone.getText());
        employee.setRole(cbRole.getSelectedItem().toString());
        String sex = "Woman";
        if (rdMan.isSelected()) {
            sex = "Man";
        }
        employee.setSex(sex);
        int status = 0;
        if (rdActive.isSelected()) {
            status = 1;
        }
        employee.setStatus(status);
        employee.setUsername(txtUsername.getText());
        EmployeeDAOImp.getInstance().editEmployee(employee);
        reload();
        clearText();
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        if ("".equals(txtEmployeeID.getText())) {
            JOptionPane.showMessageDialog(this, "You must select a row in table to do this!");
        }
        Employee employee = new Employee();
        employee.setAddress(txtAddress.getText());
        employee.setBirthday(txtBirthday.getText());
        employee.setEmployeeID(Integer.parseInt(txtEmployeeID.getText()));
        employee.setEmployeename(txtEmployeeName.getText());
        employee.setPassword(txtPassword.getText());
        employee.setPhone(txtPhone.getText());
        employee.setRole(cbRole.getSelectedItem().toString());
        String sex = "Woman";
        if (rdMan.isSelected()) {
            sex = "Man";
        }
        employee.setSex(sex);
        int status = 0;
        if (rdActive.isSelected()) {
            status = 1;
        }
        employee.setStatus(status);
        employee.setUsername(txtUsername.getText());
        EmployeeDAOImp.getInstance().deleteEmployee(employee);
        reload();
        clearText();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txtSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSearchMouseClicked
        txtSearch.setText("");
    }//GEN-LAST:event_txtSearchMouseClicked

    private void txtSearchFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSearchFocusLost
        txtSearch.setText("Input some information here...");
    }//GEN-LAST:event_txtSearchFocusLost

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed

    }//GEN-LAST:event_btnSearchActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        txtEmployeeID.setText(table.getModel().getValueAt(table.getSelectedRow(), 0).toString());
        txtEmployeeName.setText(table.getModel().getValueAt(table.getSelectedRow(), 1).toString());
        txtAddress.setText(table.getModel().getValueAt(table.getSelectedRow(), 2).toString());
        txtPhone.setText(table.getModel().getValueAt(table.getSelectedRow(), 3).toString());
        txtBirthday.setText(table.getModel().getValueAt(table.getSelectedRow(), 4).toString());
        if (table.getModel().getValueAt(table.getSelectedRow(), 5).toString().trim().equals("Man")) {
            rdMan.setSelected(true);
        } else {
            rdWoman.setSelected(true);
        }
        switch (table.getModel().getValueAt(table.getSelectedRow(), 8).toString().trim()) {
            case "Quản Lý":
                cbRole.setSelectedIndex(0);
                break;
            case "Thu Ngân":
                cbRole.setSelectedIndex(1);
                break;
            case "Kiểm Hàng":
                cbRole.setSelectedIndex(2);
                break;
        }
        txtUsername.setText(table.getModel().getValueAt(table.getSelectedRow(), 6).toString());
        txtPassword.setText(table.getModel().getValueAt(table.getSelectedRow(), 7).toString());
        if (table.getModel().getValueAt(table.getSelectedRow(), 8).toString().trim().equals("1")) {
            rdActive.setSelected(true);
        } else {
            rdNotActive.setSelected(true);
        }
    }//GEN-LAST:event_tableMouseClicked

    private void rdNotActiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdNotActiveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdNotActiveActionPerformed

    private void cbRoleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbRoleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbRoleActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox cbRole;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdActive;
    private javax.swing.JRadioButton rdMan;
    private javax.swing.JRadioButton rdNotActive;
    private javax.swing.JRadioButton rdWoman;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtBirthday;
    private javax.swing.JTextField txtEmployeeID;
    private javax.swing.JTextField txtEmployeeName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables

    private static class ResultSet {

        public ResultSet() {
        }
    }

    private static class ResultSetMetaData {

        public ResultSetMetaData() {
        }
    }
}
