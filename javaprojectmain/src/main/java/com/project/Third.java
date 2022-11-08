
package com.project;


public class Third extends javax.swing.JFrame {

    /*Creating third form*/
    public Third() {
        initComponents();
    }
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPanel3 = new javax.swing.JPanel();
        txtReceivecalc = new javax.swing.JTextField();
        lblTotalPayment = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        lblMonthlyPayment = new javax.swing.JLabel();
        txtRecievemonthly = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlPanel3.setBackground(new java.awt.Color(255, 255, 153));
        pnlPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtReceivecalc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtReceivecalcActionPerformed(evt);
            }
        });
        pnlPanel3.add(txtReceivecalc, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 79, 154, 38));

        lblTotalPayment.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTotalPayment.setText("            Total Payment");
        pnlPanel3.add(lblTotalPayment, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 25, 154, 36));

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        pnlPanel3.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 253, 118, -1));

        lblMonthlyPayment.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblMonthlyPayment.setText("Monthly Payment");
        pnlPanel3.add(lblMonthlyPayment, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 143, -1, -1));
        pnlPanel3.add(txtRecievemonthly, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 181, 154, 38));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Desktop\\1092698_adobespark.png")); // NOI18N
        pnlPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 360));

        getContentPane().add(pnlPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 360));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtReceivecalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtReceivecalcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtReceivecalcActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed

  
    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Third.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Third.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Third.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Third.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Third().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblMonthlyPayment;
    private javax.swing.JLabel lblTotalPayment;
    private javax.swing.JPanel pnlPanel3;
    public static javax.swing.JTextField txtReceivecalc;
    public static javax.swing.JTextField txtRecievemonthly;
    // End of variables declaration//GEN-END:variables
}
