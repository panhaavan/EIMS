
package eims;

import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoginForm extends javax.swing.JFrame {
    public LoginForm() {
        initComponents();   
    }
    NewDataCon con = new NewDataCon();
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        PFPassword = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        btnSinup = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 32, -1, -1));

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("Loging");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Username");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 100, -1));
        jPanel2.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 230, 30));
        jPanel2.add(PFPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 230, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Password");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 90, -1));

        btnSinup.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSinup.setText("Singup");
        btnSinup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSinupActionPerformed(evt);
            }
        });
        jPanel2.add(btnSinup, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, -1, -1));

        btnLogin.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel2.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, 100, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 370));

        setSize(new java.awt.Dimension(620, 377));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSinupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSinupActionPerformed
        RegisterForm.main(null);
        this.dispose();
    }//GEN-LAST:event_btnSinupActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
    
        PreparedStatement p = null;
        ResultSet r = null;
        try {
            String query = "SELECT Username, Password FROM tbuser WHERE Username = ? AND Password = ?";
            p = con.myConnection().prepareStatement(query);

            p.setString(1, txtUsername.getText());
            p.setString(2, new String(PFPassword.getPassword()));
            
            r = p.executeQuery();

            if (r.next()) {
                MainForm.main(null);
                this.dispose();
                //JOptionPane.showMessageDialog(this, "Login successful!");
            } else {
            JOptionPane.showMessageDialog(this, "Invalid Username or Password");
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_btnLoginActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        con.myConnection();
    }//GEN-LAST:event_formWindowOpened

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField PFPassword;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnSinup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
