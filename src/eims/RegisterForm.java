
package eims;

import java.sql.Statement;
import javax.swing.JOptionPane;
public class RegisterForm extends javax.swing.JFrame {

    public RegisterForm() {
        initComponents();
    }
    public NewDataCon con = new NewDataCon();
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        PFCPassword = new javax.swing.JPasswordField();
        PFPassword = new javax.swing.JPasswordField();
        txtUsername = new javax.swing.JTextField();
        btnCancel = new javax.swing.JButton();
        btnRegister1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(606, 370));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("Register");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 160, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Password");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Comfirm Password");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Username");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, -1, -1));
        jPanel1.add(PFCPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 200, 30));
        jPanel1.add(PFPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 200, 30));

        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });
        jPanel1.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 200, 30));

        btnCancel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, 100, -1));

        btnRegister1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnRegister1.setText("Register");
        btnRegister1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegister1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegister1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -3, 610, 370));

        setSize(new java.awt.Dimension(620, 377));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed

    }//GEN-LAST:event_txtUsernameActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        LoginForm.main(null);
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnRegister1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegister1ActionPerformed
       String Username = txtUsername.getText();
       String Password = String.valueOf(PFPassword.getPassword());
       String confirmpass = String.valueOf(PFCPassword.getPassword());
       
       if(Password.equals(confirmpass)){
           try{
               Statement s= con.myConnection().createStatement();
               s.execute("INSERT INTO tbuser(Username, Password) VALUES('"+Username+"','"+Password+"')");
           } catch (Exception e){
               JOptionPane.showMessageDialog(this, e);
           }
           JOptionPane.showMessageDialog(this, "Register successfuly!");
       }else{
           JOptionPane.showMessageDialog(this, "Please correct your password.!");
       }
    }//GEN-LAST:event_btnRegister1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField PFCPassword;
    private javax.swing.JPasswordField PFPassword;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnRegister1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
