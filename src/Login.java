import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;
public class Login extends javax.swing.JFrame {
    public Login() {
        initComponents();
    }
    public void close()
    {
        WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        uname = new javax.swing.JTextField();
        signin = new javax.swing.JButton();
        pass = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 640));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(58, 51, 93,150));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(102, 102, 102)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(52, 117, 242));
        jLabel1.setFont(new java.awt.Font("Calisto MT", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 218, 56));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("WELCOME TO SATSAHEB AUTOPARTS");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 70));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/kabirji.jpg"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 110, 120));

        uname.setBackground(new java.awt.Color(204, 204, 255));
        uname.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        uname.setForeground(new java.awt.Color(0, 0, 255));
        uname.setText("Enter Username");
        uname.setAutoscrolls(false);
        uname.setVerifyInputWhenFocusTarget(false);
        uname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                unameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                unameFocusLost(evt);
            }
        });
        jPanel2.add(uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 180, 30));

        signin.setBackground(new java.awt.Color(204, 255, 51));
        signin.setFont(new java.awt.Font("Lucida Calligraphy", 0, 11)); // NOI18N
        signin.setText("Sign In");
        signin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signinActionPerformed(evt);
            }
        });
        jPanel2.add(signin, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 180, 30));

        pass.setBackground(new java.awt.Color(204, 204, 255));
        pass.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pass.setForeground(new java.awt.Color(0, 0, 255));
        pass.setText("Password");
        pass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passFocusLost(evt);
            }
        });
        pass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passKeyPressed(evt);
            }
        });
        jPanel2.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, 180, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 340, 410));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/login.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void passFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passFocusGained
        // TODO add your handling code here:
        if(pass.getText().equals("Password"))
        {
            pass.setText("");
        }
    }//GEN-LAST:event_passFocusGained

    private void passFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passFocusLost
        // TODO add your handling code here:
        if(pass.getText().equals(""))
        {
            pass.setText("Password");
        }
    }//GEN-LAST:event_passFocusLost

    private void signinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signinActionPerformed
        // TODO add your handling code here:
        String username = uname.getText();
        String password = pass.getText();
        if(username.equals("satsaheb") && password.equals("ratanji"))
        {
            JOptionPane.showMessageDialog(jPanel2, "You are successfully logged in");
            MainPage window = new MainPage();
            window.setVisible(true);
        }
        else
        {
            JOptionPane.showMessageDialog(jPanel2, "Invalid Details!!!");
        }

    }//GEN-LAST:event_signinActionPerformed

    private void unameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_unameFocusLost
        // TODO add your handling code here:
        if(uname.getText().equals(""))
        {
            uname.setText("Enter Username");
        }
    }//GEN-LAST:event_unameFocusLost

    private void unameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_unameFocusGained
        // TODO add your handling code here:
        if(uname.getText().equals("Enter Username"))
        {
            uname.setText("");
        }
    }//GEN-LAST:event_unameFocusGained

    private void passKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            String username = uname.getText();
            String password = pass.getText();
            if(username.equals("satsaheb") && password.equals("ratanji"))
            {
                JOptionPane.showMessageDialog(jPanel2, "You are successfully logged in");
                MainPage window = new MainPage();
                window.setVisible(true);
            }
            else
            {
                JOptionPane.showMessageDialog(jPanel2, "Invalid Details!!!");
            }
        }
    }//GEN-LAST:event_passKeyPressed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField pass;
    private javax.swing.JButton signin;
    private javax.swing.JTextField uname;
    // End of variables declaration//GEN-END:variables
}
