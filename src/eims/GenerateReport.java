
package eims;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.table.DefaultTableModel;


public class GenerateReport extends javax.swing.JFrame {
    public GenerateReport() {
        initComponents();
        loadDataIntoTable();
        Total();
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
                    r.getString("gender"),
                    r.getDate("dob"),
                    r.getBigDecimal("salary"),
                    r.getString("contact"),
                });
            }
        } catch (SQLException ex) {
            Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtSalary = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtMale = new javax.swing.JTextField();
        txtFemale = new javax.swing.JTextField();
        txtEmployee = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        myTable = new javax.swing.JTable();

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setText("Information Employee(Report)");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, 170, -1));

        jLabel6.setText("Report ID:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, -1));

        jTextField4.setText("jTextField1");
        jPanel2.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, -1, -1));

        jLabel7.setText("Report Date:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, -1));

        jTextField5.setText("jTextField1");
        jPanel2.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, -1, -1));

        jLabel8.setText("Report By: ");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, -1));

        jTextField6.setText("jTextField1");
        jPanel2.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, -1, -1));

        jButton2.setText("Add New");
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 80, -1, -1));

        jLabel14.setText("jLabel14");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 153, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 255), 6));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel10.setText("Toltal:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setText("Employee");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setText("Salary");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 420, -1, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel17.setText("Female");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 420, -1, -1));

        txtSalary.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtSalary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSalaryActionPerformed(evt);
            }
        });
        jPanel1.add(txtSalary, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 410, 130, 40));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel18.setText("Male");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 370, -1, -1));

        txtMale.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaleActionPerformed(evt);
            }
        });
        jPanel1.add(txtMale, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 360, 130, 40));

        txtFemale.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFemaleActionPerformed(evt);
            }
        });
        jPanel1.add(txtFemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 410, 130, 40));

        txtEmployee.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmployeeActionPerformed(evt);
            }
        });
        jPanel1.add(txtEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 360, 130, 40));

        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 410, 120, -1));

        jPanel4.setBackground(new java.awt.Color(0, 153, 153));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setText("Information Employee");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, -1, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1050, 120));

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        myTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Sex", "Date of Birth", "Salary", "Contact"
            }
        ));
        myTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                myTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(myTable);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 200));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 1050, 200));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 500));

        setSize(new java.awt.Dimension(1086, 510));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void myTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myTableMouseClicked

    }//GEN-LAST:event_myTableMouseClicked

    private void txtEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmployeeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmployeeActionPerformed

    private void txtSalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSalaryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSalaryActionPerformed

    private void txtMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaleActionPerformed

    private void txtFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFemaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFemaleActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        MainForm.main(null);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed
   
    private void Total(){
        PreparedStatement p = null;
        ResultSet r = null;
        try {
            String query = "SELECT COUNT(*) AS totalEmployees, "
                    + "SUM(CASE WHEN gender = 'M' THEN 1 ELSE 0 END) AS totalMale, "
                    + "SUM(CASE WHEN gender = 'F' THEN 1 ELSE 0 END) AS totalFemale, "
                    + "SUM(salary) AS totalSalary "
                    + "FROM tbemployee";
            p = con.myConnection().prepareStatement(query);
            r = p.executeQuery();

            if (r.next()) {
                txtEmployee.setText(String.valueOf(r.getInt("totalEmployees")));
                txtMale.setText(String.valueOf(r.getInt("totalMale")));
                txtFemale.setText(String.valueOf(r.getInt("totalFemale")));
                txtSalary.setText(String.valueOf(r.getBigDecimal("totalSalary")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(GenerateReport.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GenerateReport().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTable myTable;
    private javax.swing.JTextField txtEmployee;
    private javax.swing.JTextField txtFemale;
    private javax.swing.JTextField txtMale;
    private javax.swing.JTextField txtSalary;
    // End of variables declaration//GEN-END:variables
}
