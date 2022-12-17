/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.TaiKhoanController;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import model.AccountModel;

/**
 *
 * @author .K
 */
public final class ChiTietTaiKhoan extends javax.swing.JFrame {

    /**
     * Creates new form ChiTietTaiKhoan
     */
    String id;

    public ChiTietTaiKhoan(String id) throws IOException {
        this.id = id;
        initComponents();
        khoitao();
    }

    public void khoitao() throws IOException {
        ArrayList<AccountModel> listAc = new ArrayList<>();
        listAc = TaiKhoanController.danh_sach_TK();
        AccountModel accountModel = new AccountModel(id);
        accountModel = listAc.get(listAc.indexOf(accountModel));
        txt_tenTK.setText(accountModel.getUsername());
        txt_chucVu.setText(accountModel.getChucvu());
        txt_ten.setText(accountModel.getTen());
        if (accountModel.getChucvu().equals("Quản Trị Viên")) {
            btn_xemDS.setEnabled(true);
        } else {
            btn_xemDS.setEnabled(false);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txt_tenTK = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_chucVu = new javax.swing.JTextField();
        btn_suaMK = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txt_ten = new javax.swing.JTextField();
        btn_troVe = new javax.swing.JButton();
        btn_xemDS = new javax.swing.JButton();
        layout = new javax.swing.JLabel();
        layout1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Tên Tài Khoản :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 91, 26));

        txt_tenTK.setEditable(false);
        getContentPane().add(txt_tenTK, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 180, 26));

        jLabel3.setLabelFor(txt_chucVu);
        jLabel3.setText("Họ Tên :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 91, 26));

        txt_chucVu.setEditable(false);
        getContentPane().add(txt_chucVu, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 180, 26));

        btn_suaMK.setText("Đổi Mật Khẩu");
        btn_suaMK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_suaMKActionPerformed(evt);
            }
        });
        getContentPane().add(btn_suaMK, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 240, 160, -1));

        jLabel4.setLabelFor(txt_chucVu);
        jLabel4.setText("Chức Vụ :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 91, 26));

        txt_ten.setEditable(false);
        getContentPane().add(txt_ten, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 180, 26));

        btn_troVe.setText("Trở Về");
        btn_troVe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_troVeActionPerformed(evt);
            }
        });
        getContentPane().add(btn_troVe, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 290, 160, -1));

        btn_xemDS.setText("Xem Danh Sách Tài Khoản Nhân Viên");
        btn_xemDS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xemDSActionPerformed(evt);
            }
        });
        getContentPane().add(btn_xemDS, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, 260, -1));

        layout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/man ngang.png"))); // NOI18N
        getContentPane().add(layout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        layout1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/man ngang.png"))); // NOI18N
        getContentPane().add(layout1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_troVeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_troVeActionPerformed
        // TODO add your handling code here:
        Main f;
        try {
            f = new Main(id);
            f.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            f.setLocationRelativeTo(null);
            f.setResizable(false);
            f.setVisible(true);
            this.dispose();
        } catch (IOException ex) {
            Logger.getLogger(ChiTietTaiKhoan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_troVeActionPerformed

    private void btn_suaMKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_suaMKActionPerformed
        SuaMatKhau f;
        try {
            f = new SuaMatKhau(id);
            f.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            f.setLocationRelativeTo(null);
            f.setResizable(false);
            f.setVisible(true);
            this.dispose();
        } catch (IOException ex) {
            Logger.getLogger(ChiTietTaiKhoan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_suaMKActionPerformed

    private void btn_xemDSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xemDSActionPerformed
        // TODO add your handling code here:
        DanhSachTK f;
        try {
            f = new DanhSachTK(id);
            f.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            f.setLocationRelativeTo(null);
            f.setResizable(false);
            f.setVisible(true);
            this.dispose();
        } catch (IOException ex) {
            Logger.getLogger(ChiTietTaiKhoan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_xemDSActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_suaMK;
    private javax.swing.JButton btn_troVe;
    private javax.swing.JButton btn_xemDS;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel layout;
    private javax.swing.JLabel layout1;
    private javax.swing.JTextField txt_chucVu;
    private javax.swing.JTextField txt_ten;
    private javax.swing.JTextField txt_tenTK;
    // End of variables declaration//GEN-END:variables
}
