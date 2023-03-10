/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.LuongController;
import controller.Luong_NhanSuController;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Luong_NhanSuModel;
import model.LuongModel;
import model.NhanSuModel;

/**
 *
 * @author admin
 */
public class SuaLuongNhanVien extends javax.swing.JFrame {

    ArrayList<LuongModel> dsLuong = new ArrayList<>();
    ArrayList<Luong_NhanSuModel> dsLuong_NhanSu = new ArrayList<>();
    NhanSuModel nhanSuDuocChon, nhanSuCheckChon = null;
    DefaultTableModel model;
    java.awt.Frame bb;
    String id;
    int traVe;
    Luong_NhanSuModel nhanSuSua;

    public SuaLuongNhanVien(String id, Luong_NhanSuModel nhanSuSua, NhanSuModel nhanSuChon) throws IOException {
        initComponents();
        this.id = id;
        this.nhanSuSua = nhanSuSua;
        this.nhanSuCheckChon = nhanSuChon;
        try {
            dsLuong = LuongController.danh_sach_L();
            dsLuong_NhanSu = Luong_NhanSuController.ReadToFile();

        } catch (IOException ex) {
            System.out.println("Loi");
        }
        for (LuongModel b : dsLuong) {
            cbbox_dsLuong.addItem(b.getLoaiNS());
        }
        if (this.nhanSuSua != null) {
            this.nhanSuDuocChon = this.nhanSuSua.getNhanSu();
            cbbox_dsLuong.setSelectedIndex(dsLuong.indexOf(nhanSuSua.getLuong()));
        } else if (nhanSuCheckChon != null) {
            this.nhanSuDuocChon = nhanSuCheckChon;
        }
        txt_NhanSu.setText(nhanSuDuocChon.getMaNS() + " - " + nhanSuDuocChon.getHoTen() + " - " + nhanSuDuocChon.getChuyenNganh());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lable_thongBaoLoi = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txt_NhanSu = new javax.swing.JTextField();
        cbbox_dsLuong = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(lable_thongBaoLoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, -1, -1));

        jButton1.setText("S???a");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, -1, 30));

        jLabel3.setText("Lo???i nh??n vi??n");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

        txt_NhanSu.setEnabled(false);
        txt_NhanSu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_NhanSuActionPerformed(evt);
            }
        });
        getContentPane().add(txt_NhanSu, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 310, 30));

        cbbox_dsLuong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbox_dsLuongActionPerformed(evt);
            }
        });
        getContentPane().add(cbbox_dsLuong, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 310, 30));

        jLabel4.setText("Nh??n vi??n");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        jButton2.setText("Tho??t");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 240, -1, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/man ngang.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
            if (nhanSuDuocChon == null) {
                throw new IOException("Chua chon nhan su");
            }
            if (cbbox_dsLuong.getSelectedIndex() < 0) {
                throw new IOException("Chua chon luong");
            }
            Luong_NhanSuModel newLuong_NhanSu = new Luong_NhanSuModel(nhanSuDuocChon, dsLuong.get(cbbox_dsLuong.getSelectedIndex()));
            ArrayList<Luong_NhanSuModel> dsLuongNhanSuCheck = new ArrayList<>();
            dsLuongNhanSuCheck.addAll(dsLuong_NhanSu);
            dsLuongNhanSuCheck.remove(nhanSuSua);
            if (dsLuongNhanSuCheck.contains(newLuong_NhanSu) == true) {
                throw new IOException("Nh??n s? d?? ? trong luong!");
            } else {
                int viTri = dsLuong_NhanSu.indexOf(nhanSuSua);
                dsLuong_NhanSu.remove(nhanSuSua);
                if (viTri < 0) {
                    dsLuong_NhanSu.add(newLuong_NhanSu);
                } else {
                    dsLuong_NhanSu.add(viTri, newLuong_NhanSu);
                }
                Luong_NhanSuController.WriteToFile(dsLuong_NhanSu);
                try {
                    if (nhanSuCheckChon == null) {
                        QuanLyLuong f = new QuanLyLuong(id);
                        f.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                        f.setLocationRelativeTo(null);
                        f.setResizable(false);
                        f.setVisible(true);
                    } else {
                        ChiTietNhanSu f = new ChiTietNhanSu(id, nhanSuCheckChon.getMaNS(),"SLNV");
                        f.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                        f.setLocationRelativeTo(null);
                        f.setResizable(false);
                        f.setVisible(true);
                    }

                    this.dispose();
                } catch (IOException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Th??m th???t b???i!", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void cbbox_dsLuongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbox_dsLuongActionPerformed

    }//GEN-LAST:event_cbbox_dsLuongActionPerformed

    private void txt_NhanSuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_NhanSuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_NhanSuActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            if (nhanSuCheckChon != null) {
                ChiTietNhanSu f = new ChiTietNhanSu(id, nhanSuCheckChon.getMaNS(),"SLNV");
                f.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                f.setLocationRelativeTo(null);
                f.setResizable(false);
                f.setVisible(true);
            } else if (this.nhanSuSua != null) {
                QuanLyLuong f = new QuanLyLuong(id);
                f.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                f.setLocationRelativeTo(null);
                f.setResizable(false);
                f.setVisible(true);
            }

            this.dispose();
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbbox_dsLuong;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lable_thongBaoLoi;
    private javax.swing.JTextField txt_NhanSu;
    // End of variables declaration//GEN-END:variables
}
