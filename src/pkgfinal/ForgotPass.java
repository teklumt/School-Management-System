
package pkgfinal;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Teklu Moges
 */
public class ForgotPass extends javax.swing.JFrame {

    /**
     * Creates new form ForgotPass
     */
    double a = Math.random();
    double Gcode = Math.round(a * 10000);
    AdminDatabase adminDB;

    public ForgotPass() {
        initComponents();
        jLabel2.setVisible(false);
        txtcode.setVisible(false);
        jButton2.setVisible(false);

        // Initialize your AdminDatabase instance
        adminDB = AdminDatabase.getInstance();
    }
     /* This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtcode = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtAdp = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Forgot Admin Password\n");
        setMinimumSize(new java.awt.Dimension(405, 425));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 2, 24)); // NOI18N
        jLabel1.setText("Enter ID :");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 30, 148, 38);

        txtid.setFont(new java.awt.Font("Monotype Corsiva", 2, 24)); // NOI18N
        getContentPane().add(txtid);
        txtid.setBounds(210, 30, 186, 34);

        jButton1.setFont(new java.awt.Font("Monotype Corsiva", 2, 24)); // NOI18N
        jButton1.setText("Get Code");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(270, 150, 109, 37);

        jLabel2.setFont(new java.awt.Font("Monotype Corsiva", 2, 24)); // NOI18N
        jLabel2.setText("Enter Code :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 210, 109, 22);

        txtcode.setFont(new java.awt.Font("Monotype Corsiva", 2, 24)); // NOI18N
        txtcode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcodeActionPerformed(evt);
            }
        });
        getContentPane().add(txtcode);
        txtcode.setBounds(190, 210, 183, 34);

        jButton2.setFont(new java.awt.Font("Monotype Corsiva", 2, 24)); // NOI18N
        jButton2.setText("Submit");
        jButton2.setMinimumSize(new java.awt.Dimension(500, 370));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(150, 300, 93, 37);

        jButton3.setFont(new java.awt.Font("Monotype Corsiva", 2, 24)); // NOI18N
        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(20, 350, 75, 37);

        jButton4.setFont(new java.awt.Font("Monotype Corsiva", 2, 24)); // NOI18N
        jButton4.setText("EXIT");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(310, 350, 81, 37);

        jLabel6.setFont(new java.awt.Font("Monotype Corsiva", 2, 24)); // NOI18N
        jLabel6.setText("Enter Admin Password :");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(10, 100, 220, 30);

        txtAdp.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtAdp);
        txtAdp.setBounds(260, 100, 130, 30);
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 0, 410);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Untitled1.png"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 470, 420);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String id = txtid.getText();
        String adpass = txtAdp.getText();

        if (adpass.equals("1234")) {
            try {
                if (adminDB.isIdExists(id)) {
                    JOptionPane.showMessageDialog(this, Gcode + "\n" + "Please Enter This Code");
                    jLabel2.setVisible(true);
                    txtcode.setVisible(true);
                    jButton2.setVisible(true);
                    
                } else {
                    JOptionPane.showMessageDialog(this, "Incorrect ID");
                    txtid.setText("");
                    txtAdp.setText("");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Incorrect Admin Password");
            txtid.setText("");
            txtAdp.setText("");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         double code = Double.parseDouble(txtcode.getText());

        if (code == Gcode) {
            // Verification successful, allow the user to change the password
            new ChangeAdminPass2().setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Enter correct Code");
            txtcode.setText("");
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtcodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcodeActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        new AdminLogin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
       JOptionPane.showMessageDialog(this,"Thank You For Using");
        System.exit(0);
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ForgotPass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ForgotPass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ForgotPass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ForgotPass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ForgotPass().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPasswordField txtAdp;
    private javax.swing.JPasswordField txtcode;
    private javax.swing.JTextField txtid;
    // End of variables declaration//GEN-END:variables
}