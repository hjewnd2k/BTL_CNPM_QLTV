/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qltv.GUI;

import javax.swing.ImageIcon;

/**
 *
 * @author Lenovo L340
 */
public class MainForm extends javax.swing.JFrame {

    private DocGiaMannagement mTheMuon;
    private TaiLieuManagment mTaiLieu;
    private PhieuMuonTraMannagement mphieumuon;
    private TraTaiLieuManagent mTraTL;
    /**
     * Creates new form MainForm
     */
    public MainForm() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        jButton1 = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        mnu_qltv = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JToolBar.Separator();
        mnu_qltl = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JToolBar.Separator();
        mnu_muon = new javax.swing.JButton();
        jSeparator7 = new javax.swing.JToolBar.Separator();
        mnuTra = new javax.swing.JButton();
        jSeparator8 = new javax.swing.JToolBar.Separator();
        jButton3 = new javax.swing.JButton();
        tplMainBoard = new javax.swing.JTabbedPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnuFile_Exit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnu_MannagmentTheTV = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        mnu_MannagmentTaiLieu = new javax.swing.JMenuItem();
        mnu_muontra = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuItem7 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBar1.setRollover(true);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qltv/icon_java/Login-icon-32.png"))); // NOI18N
        jButton1.setText("Đăng Xuất");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton1);
        jToolBar1.add(jSeparator4);

        mnu_qltv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qltv/icon_java/10207-man-student-light-skin-tone-icon-32.png"))); // NOI18N
        mnu_qltv.setText("Quản Lý Đọc Giả");
        mnu_qltv.setFocusable(false);
        mnu_qltv.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mnu_qltv.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        mnu_qltv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnu_qltvActionPerformed(evt);
            }
        });
        jToolBar1.add(mnu_qltv);
        jToolBar1.add(jSeparator6);

        mnu_qltl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qltv/icon_java/Actions-document-edit-icon-32.png"))); // NOI18N
        mnu_qltl.setText("Quản Lý Tài Liệu");
        mnu_qltl.setFocusable(false);
        mnu_qltl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mnu_qltl.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        mnu_qltl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnu_qltlActionPerformed(evt);
            }
        });
        jToolBar1.add(mnu_qltl);
        jToolBar1.add(jSeparator5);

        mnu_muon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qltv/icon_java/Actions-view-choose-icon-24.png"))); // NOI18N
        mnu_muon.setText("Mượn Tài Liệu");
        mnu_muon.setFocusable(false);
        mnu_muon.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mnu_muon.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        mnu_muon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnu_muonActionPerformed(evt);
            }
        });
        jToolBar1.add(mnu_muon);
        jToolBar1.add(jSeparator7);

        mnuTra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qltv/icon_java/Person-Male-Light-icon-24.png"))); // NOI18N
        mnuTra.setText("Trả Tài Liệu");
        mnuTra.setFocusable(false);
        mnuTra.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mnuTra.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        mnuTra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuTraActionPerformed(evt);
            }
        });
        jToolBar1.add(mnuTra);
        jToolBar1.add(jSeparator8);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qltv/icon_java/Actions-help-about-icon-32.png"))); // NOI18N
        jButton3.setText("Giới thiệu");
        jButton3.setFocusable(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton3);

        jMenu1.setText("Hệ Thống");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qltv/icon_java/logout-icon-16.png"))); // NOI18N
        jMenuItem1.setText("Đăng Xuất");
        jMenu1.add(jMenuItem1);
        jMenu1.add(jSeparator1);

        mnuFile_Exit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        mnuFile_Exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qltv/icon_java/Button-Close-icon-16.png"))); // NOI18N
        mnuFile_Exit.setText("Thoát");
        mnuFile_Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuFile_ExitActionPerformed(evt);
            }
        });
        jMenu1.add(mnuFile_Exit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Quản Lý");

        mnu_MannagmentTheTV.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_MASK));
        mnu_MannagmentTheTV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qltv/icon_java/10207-man-student-light-skin-tone-icon-16.png"))); // NOI18N
        mnu_MannagmentTheTV.setText("Quản Lý Đọc Giả");
        mnu_MannagmentTheTV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnu_MannagmentTheTVActionPerformed(evt);
            }
        });
        jMenu2.add(mnu_MannagmentTheTV);
        jMenu2.add(jSeparator2);

        mnu_MannagmentTaiLieu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Y, java.awt.event.InputEvent.CTRL_MASK));
        mnu_MannagmentTaiLieu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qltv/icon_java/Actions-document-edit-icon-16.png"))); // NOI18N
        mnu_MannagmentTaiLieu.setText("Quản Lý Tài Liệu");
        mnu_MannagmentTaiLieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnu_MannagmentTaiLieuActionPerformed(evt);
            }
        });
        jMenu2.add(mnu_MannagmentTaiLieu);

        mnu_muontra.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        mnu_muontra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qltv/icon_java/Actions-view-choose-icon-24.png"))); // NOI18N
        mnu_muontra.setText("Mượn Tài Liệu");
        mnu_muontra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnu_muontraActionPerformed(evt);
            }
        });
        jMenu2.add(mnu_muontra);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qltv/icon_java/Person-Male-Light-icon-16.png"))); // NOI18N
        jMenuItem2.setText("Trả Tài Liệu");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Trợ Giúp");

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qltv/icon_java/Actions-help-about-icon-16.png"))); // NOI18N
        jMenuItem6.setText("Nội Dung");
        jMenu3.add(jMenuItem6);
        jMenu3.add(jSeparator3);

        jMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qltv/icon_java/Help-icon-16.png"))); // NOI18N
        jMenuItem7.setText("Giới Thiệu");
        jMenu3.add(jMenuItem7);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 699, Short.MAX_VALUE)
            .addComponent(tplMainBoard)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tplMainBoard, javax.swing.GroupLayout.DEFAULT_SIZE, 367, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuFile_ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuFile_ExitActionPerformed
        System.exit(0);

    }//GEN-LAST:event_mnuFile_ExitActionPerformed

    private void mnu_MannagmentTheTVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnu_MannagmentTheTVActionPerformed
        if (mTheMuon == null){
        mTheMuon = new DocGiaMannagement();
        ImageIcon icon = new ImageIcon(getClass().getResource("/qltv/icon_java/10207-man-student-light-skin-tone-icon-16.png"));
        tplMainBoard.addTab("Quản lý đọc giả", icon, mTheMuon, "Quản lý đọc giả");
        }
        tplMainBoard.setSelectedComponent(mTheMuon);
    }//GEN-LAST:event_mnu_MannagmentTheTVActionPerformed

    private void mnu_qltvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnu_qltvActionPerformed
        if (mTheMuon == null){
        mTheMuon = new DocGiaMannagement();
        ImageIcon icon = new ImageIcon(getClass().getResource("/qltv/icon_java/10207-man-student-light-skin-tone-icon-16.png"));
        tplMainBoard.addTab("Quản lý đọc giả", icon, mTheMuon, "Quản lý đọc giả");
        }
        tplMainBoard.setSelectedComponent(mTheMuon);
    }//GEN-LAST:event_mnu_qltvActionPerformed

    private void mnu_MannagmentTaiLieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnu_MannagmentTaiLieuActionPerformed
        if (mTaiLieu == null){
        mTaiLieu = new TaiLieuManagment();
        ImageIcon icon = new ImageIcon(getClass().getResource("/qltv/icon_java/Actions-document-edit-icon-16.png"));
        tplMainBoard.addTab("Quản lý tài liệu", icon, mTaiLieu, "Quản lý tài liệu");
        }
        tplMainBoard.setSelectedComponent(mTaiLieu);
    }//GEN-LAST:event_mnu_MannagmentTaiLieuActionPerformed

    private void mnu_qltlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnu_qltlActionPerformed
        if (mTaiLieu == null){
        mTaiLieu = new TaiLieuManagment();
        ImageIcon icon = new ImageIcon(getClass().getResource("/qltv/icon_java/Actions-document-edit-icon-16.png"));
        tplMainBoard.addTab("Quản lý tài liệu", icon, mTaiLieu, "Quản lý tài liệu");
        }
        tplMainBoard.setSelectedComponent(mTaiLieu);
    }//GEN-LAST:event_mnu_qltlActionPerformed

    private void mnu_muonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnu_muonActionPerformed
        if (mphieumuon == null){
        mphieumuon = new PhieuMuonTraMannagement();
        ImageIcon icon = new ImageIcon(getClass().getResource("/qltv/icon_java/Actions-view-choose-icon-24.png"));
        tplMainBoard.addTab("Mượn Trả Tài Liệu", icon, mphieumuon, "Mượn Trả Tài Liệu");
        }
        tplMainBoard.setSelectedComponent(mphieumuon);
    }//GEN-LAST:event_mnu_muonActionPerformed

    private void mnu_muontraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnu_muontraActionPerformed
         if (mphieumuon == null){
        mphieumuon = new PhieuMuonTraMannagement();
        ImageIcon icon = new ImageIcon(getClass().getResource("/qltv/icon_java/Actions-view-choose-icon-24.png"));
        tplMainBoard.addTab("Mượn Trả Tài Liệu", icon, mphieumuon, "Mượn Trả Tài Liệu");
        }
        tplMainBoard.setSelectedComponent(mphieumuon);
    }//GEN-LAST:event_mnu_muontraActionPerformed

    private void mnuTraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuTraActionPerformed
        if (mTraTL == null){
        mTraTL = new TraTaiLieuManagent();
        ImageIcon icon = new ImageIcon(getClass().getResource("/qltv/icon_java/Person-Male-Light-icon-24.png"));
        tplMainBoard.addTab("Trả Tài Liệu", icon, mTraTL, "Trả Tài Liệu");
        }
        tplMainBoard.setSelectedComponent(mTraTL);
    }//GEN-LAST:event_mnuTraActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        if (mTraTL == null){
        mTraTL = new TraTaiLieuManagent();
        ImageIcon icon = new ImageIcon(getClass().getResource("/qltv/icon_java/Person-Male-Light-icon-24.png"));
        tplMainBoard.addTab("Trả Tài Liệu", icon, mTraTL, "Trả Tài Liệu");
        }
        tplMainBoard.setSelectedComponent(mTraTL);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JToolBar.Separator jSeparator5;
    private javax.swing.JToolBar.Separator jSeparator6;
    private javax.swing.JToolBar.Separator jSeparator7;
    private javax.swing.JToolBar.Separator jSeparator8;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JMenuItem mnuFile_Exit;
    private javax.swing.JButton mnuTra;
    private javax.swing.JMenuItem mnu_MannagmentTaiLieu;
    private javax.swing.JMenuItem mnu_MannagmentTheTV;
    private javax.swing.JButton mnu_muon;
    private javax.swing.JMenuItem mnu_muontra;
    private javax.swing.JButton mnu_qltl;
    private javax.swing.JButton mnu_qltv;
    private javax.swing.JTabbedPane tplMainBoard;
    // End of variables declaration//GEN-END:variables
}