/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.TaiKhoanController;
import java.awt.List;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.AccountModel;

/**
 *
 * @author .K
 */
public final class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    String id;

    public Main(String id) throws IOException {
        this.id = id;
        initComponents();
        khoitao();
    }

    public void khoitao() throws IOException {
        ArrayList<AccountModel> listAc = new ArrayList<>();
        listAc = TaiKhoanController.danh_sach_TK();
        AccountModel accountModel = new AccountModel(id);
        accountModel = listAc.get(listAc.indexOf(accountModel));
        txt_xinchao.setText("Xin chào " + accountModel.getTen());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_phanChiaCV = new javax.swing.JButton();
        btn_tuyenDung = new javax.swing.JButton();
        btn_quanLyTTCN = new javax.swing.JButton();
        btn_quanLuong = new javax.swing.JButton();
        txt_xinchao = new javax.swing.JLabel();
        btn_chiTietAcc = new javax.swing.JButton();
        btn_logout = new javax.swing.JButton();
        layout = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_phanChiaCV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/phanChiaCongViec.png"))); // NOI18N
        btn_phanChiaCV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_phanChiaCVActionPerformed(evt);
            }
        });
        getContentPane().add(btn_phanChiaCV, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 410, 100));

        btn_tuyenDung.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/TuyenDung.png"))); // NOI18N
        btn_tuyenDung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tuyenDungActionPerformed(evt);
            }
        });
        getContentPane().add(btn_tuyenDung, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 410, 100));

        btn_quanLyTTCN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/quanLyTTCN.png"))); // NOI18N
        btn_quanLyTTCN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_quanLyTTCNActionPerformed(evt);
            }
        });
        getContentPane().add(btn_quanLyTTCN, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 510, 410, 100));

        btn_quanLuong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/QuanLyLuong.png"))); // NOI18N
        btn_quanLuong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_quanLuongActionPerformed(evt);
            }
        });
        getContentPane().add(btn_quanLuong, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 410, 100));
        getContentPane().add(txt_xinchao, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 280, 30));

        btn_chiTietAcc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/acc.jpg"))); // NOI18N
        btn_chiTietAcc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_chiTietAccActionPerformed(evt);
            }
        });
        getContentPane().add(btn_chiTietAcc, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, 40, 40));

        btn_logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/z3464303489287_3c9cece67503613973bb3bf51240549e.jpg"))); // NOI18N
        btn_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logoutActionPerformed(evt);
            }
        });
        getContentPane().add(btn_logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, 40, 40));

        layout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/main.png"))); // NOI18N
        getContentPane().add(layout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_quanLuongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_quanLuongActionPerformed
        // TODO add your handling code here:
        QuanLyLuong f;
        try {
            f = new QuanLyLuong(id);
            f.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            f.setLocationRelativeTo(null);
            f.setResizable(false);
            f.setVisible(true);
            this.dispose();
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_quanLuongActionPerformed

    private void btn_phanChiaCVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_phanChiaCVActionPerformed
        try {
            XemPhong f;
            f = new XemPhong(id);
            f.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            f.setLocationRelativeTo(null);
            f.setResizable(false);
            f.setVisible(true);
            this.dispose();
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_phanChiaCVActionPerformed

    private void btn_chiTietAccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_chiTietAccActionPerformed
        try {
            ChiTietTaiKhoan f;
            f = new ChiTietTaiKhoan(id);
            f.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            f.setLocationRelativeTo(null);
            f.setResizable(false);
            f.setVisible(true);
            this.dispose();
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_chiTietAccActionPerformed

    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed
        Login f = new Login();
        f.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setResizable(false);
        f.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_logoutActionPerformed

    private void btn_quanLyTTCNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_quanLyTTCNActionPerformed
        QuanLyThongTinNhanSu f;
        try {
            f = new QuanLyThongTinNhanSu(id);
            f.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            f.setLocationRelativeTo(null);
            f.setResizable(false);
            f.setVisible(true);
            this.dispose();
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_quanLyTTCNActionPerformed

    private void btn_tuyenDungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tuyenDungActionPerformed
                try {
            // TODO add your handling code here:
            TuyenDung f;
            f = new TuyenDung(id);
            f.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            f.setLocationRelativeTo(null);
            f.setResizable(false);
            f.setVisible(true);
            this.dispose();
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_tuyenDungActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Main().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_chiTietAcc;
    private javax.swing.JButton btn_logout;
    private javax.swing.JButton btn_phanChiaCV;
    private javax.swing.JButton btn_quanLuong;
    private javax.swing.JButton btn_quanLyTTCN;
    private javax.swing.JButton btn_tuyenDung;
    private javax.swing.JLabel layout;
    private javax.swing.JLabel txt_xinchao;
    // End of variables declaration//GEN-END:variables
}
