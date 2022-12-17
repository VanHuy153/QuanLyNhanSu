/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.LuongController;
import controller.Luong_NhanSuController;
import java.io.IOException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.LuongModel;

/**
 *
 * @author .K
 */
public class SuaLoaiNS extends javax.swing.JFrame {

    /**
     * Creates new form SuaLoaiNS
     */
    String id;
    LuongModel luong;

    public SuaLoaiNS(String id, LuongModel luong) throws IOException {
        this.id = id;
        this.luong = luong;
        initComponents();
        khoitao();
    }

    public void khoitao() throws IOException {
        ArrayList<LuongModel> listL = new ArrayList<>();
        listL = LuongController.danh_sach_L();
        luong = listL.get(listL.indexOf(luong));
        txt_loaiNS.setText(luong.getLoaiNS());
        txt_MLCS.setText(luong.getmLCS().toString());
        txt_HSL.setText(luong.getHSL().toString());
        txt_PC.setText(luong.getPhuCap().toString());
        txt_BH.setText(luong.getBaohiem().toString());
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
        txt_loaiNS = new javax.swing.JTextField();
        txt_MLCS = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_HSL = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_PC = new javax.swing.JTextField();
        txt_BH = new javax.swing.JTextField();
        btn_troVe = new javax.swing.JButton();
        btn_luu = new javax.swing.JButton();
        layout = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Loại NS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 91, 26));

        txt_loaiNS.setEnabled(false);
        txt_loaiNS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_loaiNSActionPerformed(evt);
            }
        });
        getContentPane().add(txt_loaiNS, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 180, 26));
        getContentPane().add(txt_MLCS, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 180, 26));

        jLabel4.setText("Mức Lương CS");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 91, 26));

        jLabel3.setText("Hệ Số Lương");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 91, 26));
        getContentPane().add(txt_HSL, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 180, 26));

        jLabel5.setText("Phụ Cấp");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 91, 26));

        jLabel6.setText("Bảo Hiểm");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 120, 26));
        getContentPane().add(txt_PC, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 180, 26));
        getContentPane().add(txt_BH, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 180, 26));

        btn_troVe.setText("Trở Về");
        btn_troVe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_troVeActionPerformed(evt);
            }
        });
        getContentPane().add(btn_troVe, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 360, 160, -1));

        btn_luu.setText("Lưu");
        btn_luu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_luuActionPerformed(evt);
            }
        });
        getContentPane().add(btn_luu, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, 150, -1));

        layout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/man ngang.png"))); // NOI18N
        getContentPane().add(layout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_loaiNSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_loaiNSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_loaiNSActionPerformed

    private void btn_troVeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_troVeActionPerformed
        XemLoaiNS f;
        try {
            f = new XemLoaiNS(id);
            f.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            f.setLocationRelativeTo(null);
            f.setResizable(false);
            f.setVisible(true);
            this.dispose();
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(SuaLoaiNS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_troVeActionPerformed

    private void btn_luuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_luuActionPerformed
        ArrayList<LuongModel> listL = new ArrayList<>();
        try {
            listL = LuongController.danh_sach_L();
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(SuaLoaiNS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        try {
            if (txt_loaiNS.getText().equals("")) {
                txt_loaiNS.requestFocus();
                throw new Exception("Tên tài khoản không được để trống!");
            }
            if (txt_HSL.getText().equals("")) {
                txt_HSL.requestFocus();
                throw new Exception("Họ tên không được để trống!");
            }
            if (txt_MLCS.getText().equals("")) {
                txt_MLCS.requestFocus();
                throw new Exception("Chức vụ không được để trống!");
            }
            if (txt_PC.getText().equals("")) {
                txt_PC.requestFocus();
                throw new Exception("Mật khẩu không được để trống!");
            }
            if (txt_BH.getText().equals("")) {
                txt_BH.requestFocus();
                throw new Exception("Xác nhận mật không được để trống!");
            }
            int index = listL.indexOf(luong);
            LuongModel a = new LuongModel(txt_loaiNS.getText());
            a.setmLCS(Double.parseDouble(txt_MLCS.getText()));
            a.setHSL(Double.parseDouble(txt_HSL.getText()));
            a.setPhuCap(Double.parseDouble(txt_PC.getText()));
            a.setBaohiem(Double.parseDouble(txt_BH.getText()));
            listL.remove(luong);
            listL.add(index, a);
            LuongController.WriteToFile(listL);
            Luong_NhanSuController.SuaLuong_NhanSuTheoLuong(luong, a);
            XemLoaiNS f;
            try {
                f = new XemLoaiNS(id);
                f.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                f.setLocationRelativeTo(null);
                f.setResizable(false);
                f.setVisible(true);
                this.dispose();
            } catch (IOException ex) {
                java.util.logging.Logger.getLogger(SuaLoaiNS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Thêm thất bại!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_luuActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_luu;
    private javax.swing.JButton btn_troVe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel layout;
    private javax.swing.JTextField txt_BH;
    private javax.swing.JTextField txt_HSL;
    private javax.swing.JTextField txt_MLCS;
    private javax.swing.JTextField txt_PC;
    private javax.swing.JTextField txt_loaiNS;
    // End of variables declaration//GEN-END:variables
}
