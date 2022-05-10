/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GDAdmin;

/**
 *
 * @author HoaiAnh
 */
public class GD_Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public GD_Menu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnBack_106 = new javax.swing.JButton();
        btnExit_106 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtMa_106 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnChange_106 = new javax.swing.JButton();
        btnDel_106 = new javax.swing.JButton();
        btnRef_106 = new javax.swing.JButton();
        btnAdd_106 = new javax.swing.JButton();
        txtMa_107 = new javax.swing.JTextField();
        txtMa_108 = new javax.swing.JTextField();
        txtMa_109 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("QUẢN LÝ MENU");

        btnBack_106.setBackground(new java.awt.Color(255, 255, 255));
        btnBack_106.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        btnBack_106.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DoAnVat/icon/back.png"))); // NOI18N
        btnBack_106.setText("Quay lại");
        btnBack_106.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack_106ActionPerformed(evt);
            }
        });

        btnExit_106.setBackground(new java.awt.Color(255, 255, 255));
        btnExit_106.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        btnExit_106.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DoAnVat/icon/thoat.jpg"))); // NOI18N
        btnExit_106.setText("Thoát");
        btnExit_106.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExit_106ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(btnBack_106)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnExit_106, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(306, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(208, 208, 208))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnExit_106, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack_106, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel3.setBackground(new java.awt.Color(153, 255, 153));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("MÃ MÓN:");

        txtMa_106.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("TÊN MÓN:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("GIÁ BÁN:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("PHÂN LOẠI:");

        btnChange_106.setBackground(new java.awt.Color(255, 204, 204));
        btnChange_106.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        btnChange_106.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DoAnVat/icon/icedit.png"))); // NOI18N
        btnChange_106.setText("SỬA");
        btnChange_106.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChange_106ActionPerformed(evt);
            }
        });

        btnDel_106.setBackground(new java.awt.Color(255, 204, 204));
        btnDel_106.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        btnDel_106.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DoAnVat/icon/xoa.png"))); // NOI18N
        btnDel_106.setText("XÓA");
        btnDel_106.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDel_106ActionPerformed(evt);
            }
        });

        btnRef_106.setBackground(new java.awt.Color(255, 204, 204));
        btnRef_106.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        btnRef_106.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DoAnVat/icon/lm.png"))); // NOI18N
        btnRef_106.setText("LÀM MỚI");
        btnRef_106.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRef_106ActionPerformed(evt);
            }
        });

        btnAdd_106.setBackground(new java.awt.Color(255, 204, 204));
        btnAdd_106.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        btnAdd_106.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DoAnVat/icon/add.png"))); // NOI18N
        btnAdd_106.setText("THÊM");
        btnAdd_106.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdd_106ActionPerformed(evt);
            }
        });

        txtMa_107.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txtMa_108.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txtMa_109.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Món", "Tên Món", "Giá bán", "Phân loại"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(btnAdd_106)
                        .addGap(60, 60, 60)
                        .addComponent(btnChange_106)
                        .addGap(59, 59, 59)
                        .addComponent(btnDel_106, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(btnRef_106)
                        .addGap(59, 59, 59))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMa_109, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMa_106, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMa_107, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMa_108, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(170, 170, 170))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtMa_108, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtMa_107, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMa_106, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMa_109, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(40, 40, 40)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnChange_106, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd_106, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDel_106, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRef_106, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel3, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBack_106ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack_106ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBack_106ActionPerformed

    private void btnExit_106ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExit_106ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExit_106ActionPerformed

    private void btnChange_106ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChange_106ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_btnChange_106ActionPerformed

    private void btnDel_106ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDel_106ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_btnDel_106ActionPerformed

    private void btnRef_106ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRef_106ActionPerformed
        // TODO add your handling code here:
        //refresh();
    }//GEN-LAST:event_btnRef_106ActionPerformed

    private void btnAdd_106ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdd_106ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_btnAdd_106ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        
        // combo box cbb_106
    }//GEN-LAST:event_jTable1MouseClicked

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
            java.util.logging.Logger.getLogger(GD_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GD_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GD_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GD_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GD_Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd_106;
    private javax.swing.JButton btnBack_106;
    private javax.swing.JButton btnChange_106;
    private javax.swing.JButton btnDel_106;
    private javax.swing.JButton btnExit_106;
    private javax.swing.JButton btnRef_106;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtMa_106;
    private javax.swing.JTextField txtMa_107;
    private javax.swing.JTextField txtMa_108;
    private javax.swing.JTextField txtMa_109;
    // End of variables declaration//GEN-END:variables
}
