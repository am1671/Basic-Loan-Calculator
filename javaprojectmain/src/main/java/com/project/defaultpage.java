

package com.project;

/*@author admin */
public class defaultpage extends javax.swing.JFrame {

    /* Creates new form defaultpage */
    public defaultpage() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        txtName = new javax.swing.JTextField();
        cmbLoantype = new javax.swing.JComboBox<>();
        lblBank = new javax.swing.JLabel();
        cmbBank = new javax.swing.JComboBox<>();
        lblImg = new javax.swing.JLabel();
        pnlPanel1 = new javax.swing.JPanel();
        lblName = new javax.swing.JLabel();
        lblTypeofLoan = new javax.swing.JLabel();
        btnNext = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        lblBackground = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Loan Calculator");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(283, 67, 115, -1));

        cmbLoantype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Car Loan", "Home Loan", "Personal Loan" }));
        cmbLoantype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbLoantypeActionPerformed(evt);
            }
        });
        getContentPane().add(cmbLoantype, new org.netbeans.lib.awtextra.AbsoluteConstraints(283, 120, 115, -1));

        lblBank.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblBank.setText("Bank-");
        getContentPane().add(lblBank, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 171, 76, -1));

        cmbBank.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbBankActionPerformed(evt);
            }
        });
        getContentPane().add(cmbBank, new org.netbeans.lib.awtextra.AbsoluteConstraints(283, 167, 115, -1));
        getContentPane().add(lblImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 230, 297, 146));

        pnlPanel1.setBackground(new java.awt.Color(255, 255, 153));
        pnlPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnlPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblName.setText("Name-");
        pnlPanel1.add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 72, 76, 30));

        lblTypeofLoan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTypeofLoan.setText("Type of Loan-");
        pnlPanel1.add(lblTypeofLoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 120, 90, 27));

        btnNext.setBackground(new java.awt.Color(0, 51, 255));
        btnNext.setForeground(new java.awt.Color(51, 0, 255));
        btnNext.setText("Next");
        btnNext.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNextMouseClicked(evt);
            }
        });
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });
        pnlPanel1.add(btnNext, new org.netbeans.lib.awtextra.AbsoluteConstraints(363, 351, 77, -1));

        lblTitle.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        lblTitle.setText("Loan Calculator");
        pnlPanel1.add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 13, 110, 28));
        pnlPanel1.add(lblBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 460, 420));

        getContentPane().add(pnlPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 390));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnNextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNextMouseClicked
        // TODO add your handling code here:
        new Second().setVisible(true);
        dispose();
       
    }//GEN-LAST:event_btnNextMouseClicked

    private void cmbLoantypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbLoantypeActionPerformed
        // TODO add your handling code here:
        if(cmbLoantype.getSelectedItem().equals("Car Loan"))
        {
            cmbBank.removeAllItems();
            cmbBank.setSelectedItem(null);
            cmbBank.addItem("Axis Bank-9%");
            cmbBank.addItem("ICICI Bank-8.5%");
            cmbBank.addItem("Kotak Bank-9.5%");
            cmbBank.addItem("IndusInd Bank-8.75%");
        }
        else if(cmbLoantype.getSelectedItem().equals("Home Loan"))
        {
            cmbBank.removeAllItems();
            cmbBank.setSelectedItem(null);
            cmbBank.addItem("Axis Bank-5.75%");
            cmbBank.addItem("ICICI Bank-6.25%");
            cmbBank.addItem("Kotak Bank-6%");
            cmbBank.addItem("IndusInd Bank-6.5%");
        }
        else if(cmbLoantype.getSelectedItem().equals("Personal Loan"))
        {
            cmbBank.removeAllItems();
            cmbBank.setSelectedItem(null);
            cmbBank.addItem("Axis Bank-10%");
            cmbBank.addItem("ICICI Bank-12%");
            cmbBank.addItem("Kotak Bank-11%");
            cmbBank.addItem("IndusInd Bank-11.5%");
        }    
            
    }//GEN-LAST:event_cmbLoantypeActionPerformed

    private void cmbBankActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbBankActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbBankActionPerformed

    /*@param args the command line arguments */
    public static void main(String args[]) {
        
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(defaultpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(defaultpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(defaultpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(defaultpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new defaultpage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNext;
    private javax.swing.JComboBox<String> cmbBank;
    private javax.swing.JComboBox<String> cmbLoantype;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblBank;
    private javax.swing.JLabel lblImg;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblTypeofLoan;
    private javax.swing.JPanel pnlPanel1;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
