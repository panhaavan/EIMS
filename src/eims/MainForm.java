
package eims;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MainForm extends javax.swing.JFrame {
    public MainForm() {
        initComponents();
        loadDataIntoTable();
    }
    NewDataCon con = new NewDataCon();
    private void loadDataIntoTable() {
        PreparedStatement p = null;
        ResultSet r = null;
        try {
            String query = "SELECT * FROM tbemployee";
            p = con.myConnection().prepareStatement(query);
            r = p.executeQuery();
            DefaultTableModel model = (DefaultTableModel) myTable.getModel();
            model.setRowCount(0);
            while (r.next()) {
                model.addRow(new Object[]{
                    r.getInt("id"),
                    r.getString("name"),
                    r.getDate("dob"),
                    r.getBigDecimal("salary"),
                    r.getString("contact"),
                    r.getString("gender"),
                    r.getString("position"),
                    r.getString("department"),
                    r.getString("dayoff"),
                    r.getInt("timework"),
                    r.getString("address")
                });
            }
        } catch (SQLException ex) {
            Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void ClearTextBox(){
        txtID.setText("");
        txtName.setText("");
        dcDOB.setDate(null);
        txtSalary.setText("");
        txtContact.setText("");
        rdM.setSelected(false);
        rdF.setSelected(false);
        txtPosition.setText("");
        txtDep.setText("");
        txtAddress.setText("");
        txtTimework.setText("");
        txtDayoff.setText("");
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel11 = new javax.swing.JLabel();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jRadioButton1 = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        myTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtPosition = new javax.swing.JTextField();
        txtDep = new javax.swing.JTextField();
        txtContact = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtID = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtSalary = new javax.swing.JTextField();
        rdF = new javax.swing.JRadioButton();
        rdM = new javax.swing.JRadioButton();
        dcDOB = new com.toedter.calendar.JDateChooser();
        txtTimework = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtDayoff = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btnExit = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        btnReport = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnRest1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        jLabel11.setText("jLabel11");

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 204), 6, true));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(153, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 6, true));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Address");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 170, 120, 30));

        myTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Date of Birth", "Salary", "Contact", "Sex", "Position", "Departement", "Day Off", "Time Work", "Address"
            }
        ));
        myTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                myTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(myTable);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 820, 130));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("ID");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 90, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Name");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 90, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Date of Birth");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 120, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Position");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, 120, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Salary");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 120, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("Sex");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 120, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setText("Departement");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 50, 120, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setText("Contact");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 120, 30));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setText("Time Work");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 130, 120, 30));

        txtPosition.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPosition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPositionActionPerformed(evt);
            }
        });
        jPanel2.add(txtPosition, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, 260, 30));

        txtDep.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtDep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDepActionPerformed(evt);
            }
        });
        jPanel2.add(txtDep, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 50, 260, 30));

        txtContact.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContactActionPerformed(evt);
            }
        });
        jPanel2.add(txtContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 260, 30));

        txtAddress.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressActionPerformed(evt);
            }
        });
        jPanel2.add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 170, 260, 30));

        txtID.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });
        jPanel2.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 260, 30));

        txtName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        jPanel2.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 260, 30));

        txtSalary.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtSalary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSalaryActionPerformed(evt);
            }
        });
        jPanel2.add(txtSalary, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 260, 30));

        rdF.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rdF.setText("Female");
        jPanel2.add(rdF, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, -1, 30));

        rdM.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rdM.setText("Male");
        jPanel2.add(rdM, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, -1, 30));
        jPanel2.add(dcDOB, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 260, 30));

        txtTimework.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtTimework.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimeworkActionPerformed(evt);
            }
        });
        jPanel2.add(txtTimework, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 130, 260, 30));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setText("Day Off");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 90, 120, 30));

        txtDayoff.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtDayoff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDayoffActionPerformed(evt);
            }
        });
        jPanel2.add(txtDayoff, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 90, 260, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 880, 400));

        jPanel3.setBackground(new java.awt.Color(102, 255, 255));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 6, true));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnExit.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        jPanel3.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 160, 40));

        btnAdd.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel3.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 160, 40));

        btnUpdate.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel3.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 160, 40));

        btnSearch.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        jPanel3.add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 160, 40));

        btnReport.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnReport.setText("Report");
        btnReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportActionPerformed(evt);
            }
        });
        jPanel3.add(btnReport, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 160, 40));

        btnDelete.setBackground(new java.awt.Color(255, 0, 51));
        btnDelete.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.setBorder(null);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel3.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 160, 40));

        btnRest1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnRest1.setText("Rest");
        btnRest1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRest1ActionPerformed(evt);
            }
        });
        jPanel3.add(btnRest1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 160, 40));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 120, 220, 400));

        jPanel4.setBackground(new java.awt.Color(0, 153, 153));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel4.setForeground(new java.awt.Color(242, 242, 242));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setText("Employee Information");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 540, 60));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1100, 110));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, 530));

        setSize(new java.awt.Dimension(1136, 538));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtPositionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPositionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPositionActionPerformed

    private void txtDepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDepActionPerformed

    private void txtContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContactActionPerformed

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressActionPerformed

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtSalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSalaryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSalaryActionPerformed

    private void txtTimeworkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimeworkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimeworkActionPerformed

    private void txtDayoffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDayoffActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDayoffActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        int confirmed = JOptionPane.showConfirmDialog(null, 
        "Are you sure you want to exit the application?", "Exit Confirmation",
        JOptionPane.YES_NO_OPTION);
        if (confirmed == JOptionPane.YES_OPTION) {
            LoginForm.main(null);
            this.dispose();
        }
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        PreparedStatement p = null;
        try{
            
            String sex = "";
            if(rdM.isSelected()){
                sex = "M";
            }
            else{
                sex = "F";
            }
            String query = "INSERT INTO tbemployee (id, name, dob, salary, contact, gender, position, department, address, timework, dayoff) " +
                     "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            p = con.myConnection().prepareStatement(query);
            p.setString(1, txtID.getText());
            p.setString(2, txtName.getText());
            p.setDate(3, new java.sql.Date(dcDOB.getDate().getTime())); // Convert util.Date to sql.Date
            p.setString(4, txtSalary.getText());
            p.setString(5, txtContact.getText());
            p.setString(6, sex);
            p.setString(7, txtPosition.getText());
            p.setString(8, txtDep.getText());
            p.setString(9, txtAddress.getText());
            p.setString(10, txtTimework.getText());
            p.setString(11, txtDayoff.getText());
            p.executeUpdate();
            loadDataIntoTable();
            JOptionPane.showMessageDialog(this, "Employee added successfully");
            ClearTextBox();
        } catch (SQLException ex) {
            Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportActionPerformed
        GenerateReport.main(null);
        this.dispose();
    }//GEN-LAST:event_btnReportActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        PreparedStatement p = null;
        ResultSet r = null;
        try {
            int option = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this employee?", "Confirmation", JOptionPane.YES_NO_OPTION);
            if (option == JOptionPane.YES_OPTION) {
                String query ="DELETE FROM tbemployee WHERE id=?";
                p = con.myConnection().prepareStatement(query);
                p.setString(1, txtID.getText());
                p.executeUpdate();
                loadDataIntoTable();
                JOptionPane.showMessageDialog(this, "Employee deleted successfully");
                ClearTextBox();
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        PreparedStatement p = null;
        try {
            String sex = "";
            if(rdM.isSelected()){
                sex = "M";
            }
            else{
                sex = "F";
            }
            String query = "UPDATE tbemployee SET name = ?, dob = ?, salary = ?, contact = ?, gender = ?, position = ?, department = ?, address = ?, timework = ?, dayoff = ? WHERE id = ?";
            p = con.myConnection().prepareStatement(query);
            
            p.setString(1, txtName.getText());
            p.setDate(2, new java.sql.Date(dcDOB.getDate().getTime())); // Convert util.Date to sql.Date
            p.setString(3, txtSalary.getText());
            p.setString(4, txtContact.getText());
            p.setString(5, sex);
            p.setString(6, txtPosition.getText());
            p.setString(7, txtDep.getText());
            p.setString(8, txtAddress.getText());
            p.setString(9, txtTimework.getText());
            p.setString(10, txtDayoff.getText());
            p.setInt(11, Integer.parseInt(txtID.getText()));

            p.executeUpdate();
            loadDataIntoTable();
            JOptionPane.showMessageDialog(this, "Employee updated successfully.");
            ClearTextBox();
        } catch (SQLException ex) {
            Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Error updating employee."); 
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        PreparedStatement p = null;
        ResultSet r = null;
        try {
            String id = txtID.getText().trim();
            String name = txtName.getText().trim();
            String contact = txtContact.getText().trim();
            
            String query = "SELECT * FROM tbemployee WHERE id = ?OR name LIKE ? OR contact = ?";
            p = con.myConnection().prepareStatement(query);

            p.setString(1, id);
            p.setString(2, "%"+name+"%");
            p.setString(3, "%"+contact+"+");
            System.out.println("Executing query: " + query); 

            r = p.executeQuery();
            DefaultTableModel model = (DefaultTableModel) myTable.getModel();
            model.setRowCount(0);
            while (r.next()) {
                model.addRow(new Object[]{
                    r.getInt("id"),
                    r.getString("name"),
                    r.getDate("dob"),
                    r.getBigDecimal("salary"),
                    r.getString("contact"),
                    r.getString("gender"),
                    r.getString("position"),
                    r.getString("department"),
                    r.getString("dayoff"),
                    r.getInt("timework"),
                    r.getString("address")
                });
            }
        } catch (SQLException ex) {
            Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Error searching for employee.");
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void myTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myTableMouseClicked

        int selectedRow = myTable.getSelectedRow();
        if (selectedRow >= 0) {
            DefaultTableModel model = (DefaultTableModel) myTable.getModel();
            txtID.setText(model.getValueAt(selectedRow, 0).toString());
            txtName.setText(model.getValueAt(selectedRow, 1).toString());
            dcDOB.setDate(java.sql.Date.valueOf(model.getValueAt(selectedRow, 2).toString())); // Assuming dcDOB is a JDateChooser
            txtSalary.setText(model.getValueAt(selectedRow, 3).toString());
            txtContact.setText(model.getValueAt(selectedRow, 4).toString());
            String sex = model.getValueAt(selectedRow, 5).toString();
                if (sex.equals("M")) {
                    rdM.setSelected(true);
                } else {
                    rdF.setSelected(true);
                }
            txtPosition.setText(model.getValueAt(selectedRow, 6).toString());
            txtDep.setText(model.getValueAt(selectedRow, 7).toString());
            txtDayoff.setText(model.getValueAt(selectedRow, 8).toString());
            txtTimework.setText(model.getValueAt(selectedRow, 9).toString());
            txtAddress.setText(model.getValueAt(selectedRow, 10).toString());
        } else {
            JOptionPane.showMessageDialog(this, "No row selected.");
        }
    }//GEN-LAST:event_myTableMouseClicked

    private void btnRest1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRest1ActionPerformed
        ClearTextBox();
    }//GEN-LAST:event_btnRest1ActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnReport;
    private javax.swing.JButton btnRest1;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private com.toedter.calendar.JDateChooser dcDOB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable myTable;
    private javax.swing.JRadioButton rdF;
    private javax.swing.JRadioButton rdM;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtContact;
    private javax.swing.JTextField txtDayoff;
    private javax.swing.JTextField txtDep;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPosition;
    private javax.swing.JTextField txtSalary;
    private javax.swing.JTextField txtTimework;
    // End of variables declaration//GEN-END:variables
}
