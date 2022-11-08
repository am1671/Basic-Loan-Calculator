
package com.project;

/* @author Admin */
public class Second extends javax.swing.JFrame {

    /* Creates second form */
    public Second() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        pnlPanel2 = new javax.swing.JPanel();
        txtFinal = new javax.swing.JTextField();
        btnCalculate = new javax.swing.JButton();
        txtmonthly = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtYears = new javax.swing.JTextField();
        txtAmount = new javax.swing.JTextField();
        txtInterest = new javax.swing.JTextField();
        lblImg2 = new javax.swing.JLabel();

        jLabel1.setText("Amount");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Interest Rate-");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 141, 100, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Amount-");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 35, 80, 29));

        pnlPanel2.setBackground(new java.awt.Color(255, 255, 153));
        pnlPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtFinal.setBackground(new java.awt.Color(255, 255, 153));
        txtFinal.setBorder(null);
        pnlPanel2.add(txtFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, 63, -1));

        btnCalculate.setText("Calculate");
        btnCalculate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCalculateMouseClicked(evt);
            }
        });
        btnCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculateActionPerformed(evt);
            }
        });
        pnlPanel2.add(btnCalculate, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 300, 94, -1));

        txtmonthly.setBackground(new java.awt.Color(255, 255, 153));
        txtmonthly.setBorder(null);
        pnlPanel2.add(txtmonthly, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, 80, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("No. of years-");
        pnlPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 80, 30));
        pnlPanel2.add(txtYears, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, 105, 30));
        pnlPanel2.add(txtAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 37, 105, 30));
        pnlPanel2.add(txtInterest, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 105, 30));

        lblImg2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Desktop\\loanimg_adobespark.jpg")); // NOI18N
        pnlPanel2.add(lblImg2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 290, 120));

        getContentPane().add(pnlPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 370));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalculateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCalculateMouseClicked
        // calculations
        
        double loanamount = Double.parseDouble(txtAmount.getText());
        double rate = Double.parseDouble(txtInterest.getText());
        double years = Double.parseDouble(txtYears.getText());
        double totalamount = loanamount *(Math.pow((1 + rate / 100), years));
        double monthlypayment = totalamount/(12*years);
        
        // displaying in text fields of second
        
        txtFinal.setText(String.valueOf(totalamount));
        txtmonthly.setText(String.valueOf(monthlypayment));
       
        // displaying in text fields of third
        
        Third t1 = new Third();
        Third.txtReceivecalc.setText(this.txtFinal.getText());
        Third.txtRecievemonthly.setText(this.txtmonthly.getText());
        t1.setVisible(true);
        
        dispose(); 
    }//GEN-LAST:event_btnCalculateMouseClicked

    private void btnCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCalculateActionPerformed

 
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
            java.util.logging.Logger.getLogger(Second.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Second.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Second.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Second.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Second().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalculate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblImg2;
    private javax.swing.JPanel pnlPanel2;
    private javax.swing.JTextField txtAmount;
    public static javax.swing.JTextField txtFinal;
    private javax.swing.JTextField txtInterest;
    private javax.swing.JTextField txtYears;
    public static javax.swing.JTextField txtmonthly;
    // End of variables declaration//GEN-END:variables
}
