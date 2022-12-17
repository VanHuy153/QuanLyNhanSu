/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.BanController;
import controller.Ban_NhanSuController;
import controller.PhongController;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.BanModel;
import model.Ban_NhanSuModel;
import model.PhongModel;

/**
 *
 * @author admin
 */
public class SuaBan extends javax.swing.JFrame {

    ArrayList<BanModel> dsBan = new ArrayList<>();
    ArrayList<PhongModel> dsPhong = new ArrayList<>();
    java.awt.Frame bb;
    String id;
    PhongModel thuocPhong;
    BanModel banChinhSua;

    public SuaBan(String id, PhongModel thuocPhong, BanModel banChinhSua) throws IOException {
        initComponents();
        this.id = id;
        this.thuocPhong = thuocPhong;
        this.banChinhSua = banChinhSua;
        try {
            dsBan = BanController.ReadToFile();
            dsPhong = PhongController.ReadToFile();
        } catch (IOException ex) {

        }
        for (PhongModel p : dsPhong) {
            cbbox_dsPhong.addItem(p.getMaPhong() + " - " + p.getTenPhong());
        }
        if (thuocPhong != null) {
            cbbox_dsPhong.setSelectedIndex(dsPhong.indexOf(thuocPhong));
        }
        showResult();
    }

    public void showResult() {
        txt_MaBanMoi.setText(banChinhSua.getMaBan());
        txt_TenBanMoi.setText(banChinhSua.getTenBan());
        cbbox_dsPhong.setSelectedIndex(dsPhong.indexOf(banChinhSua.getThuocPhong()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_MaBanMoi = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_TenBanMoi = new javax.swing.JTextField();
        cbbox_dsPhong = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(txt_MaBanMoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 210, 30));

        jLabel4.setText("Mã ban mới");
        jLabel4.setToolTipText("");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 145, -1, -1));

        jLabel2.setText("Tên ban mới");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 185, -1, -1));
        getContentPane().add(txt_TenBanMoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 210, 30));

        cbbox_dsPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbox_dsPhongActionPerformed(evt);
            }
        });
        getContentPane().add(cbbox_dsPhong, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 210, 30));

        jLabel3.setText("Thuộc phòng");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 225, -1, -1));

        jButton1.setText("Sửa ban");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, -1, 30));

        jButton2.setText("Thoát");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, -1, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/man ngang.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbbox_dsPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbox_dsPhongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbbox_dsPhongActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ArrayList<BanModel> dsBanCheck = new ArrayList<>();
        dsBanCheck.addAll(dsBan);
        try {
            if (txt_TenBanMoi.getText().compareTo("") == 0 || txt_MaBanMoi.getText().compareTo("") == 0) {
                throw new IOException("Tên ban và mã ban không được để trống!");
            } else {
                dsBanCheck.remove(banChinhSua);
                BanModel newBan = new BanModel(txt_MaBanMoi.getText(), txt_TenBanMoi.getText(), dsPhong.get(cbbox_dsPhong.getSelectedIndex()));
                if (dsBanCheck.contains(newBan) == true) {
                    throw new IOException("Tên ban ho?c mã ban dã t?n t?i!");
                } else {
                    int viTri = dsBan.indexOf(banChinhSua);
                    ArrayList<Ban_NhanSuModel> list = Ban_NhanSuController.ReadToFile();
                    for (Ban_NhanSuModel bx : list) {
                        if (bx.getBan().equals(banChinhSua)) {
                            bx.setBan(newBan);
                        }
                    }
                    Ban_NhanSuController.WriteToFile(list);
                    dsBan.remove(banChinhSua);
                    dsBan.add(viTri, newBan);
                    BanController.WriteToFile(dsBan);
                    Ban_NhanSuController.SuaBan_NhanSuTheoBan(banChinhSua, newBan);
                    try {
                        XemBan f = new XemBan(id, thuocPhong);
                        f.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                        f.setLocationRelativeTo(null);
                        f.setResizable(false);
                        f.setVisible(true);
                        this.dispose();
                    } catch (IOException ex) {
                        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Thêm thất bại!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            XemBan f = new XemBan(id, thuocPhong);
            f.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            f.setLocationRelativeTo(null);
            f.setResizable(false);
            f.setVisible(true);
            this.dispose();
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbbox_dsPhong;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txt_MaBanMoi;
    private javax.swing.JTextField txt_TenBanMoi;
    // End of variables declaration//GEN-END:variables
}
