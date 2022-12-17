/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.Ban_NhanSuController;
import controller.BanController;
import controller.NhanSuController;
import controller.PhongController;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Ban_NhanSuModel;
import model.BanModel;
import model.NhanSuModel;
import model.PhongModel;

/**
 *
 * @author admin
 */
public class ThemNhanSuVaoBan extends javax.swing.JFrame {

    ArrayList<PhongModel> dsPhong = new ArrayList<>();
    ArrayList<BanModel> dsBan = new ArrayList<>();
    ArrayList<BanModel> dsBanThuocPhong = new ArrayList<>();
    ArrayList<Ban_NhanSuModel> dsBan_NhanSu = new ArrayList<>();
    ArrayList<NhanSuModel> dsNhanSu = new ArrayList<>();
    ArrayList<NhanSuModel> dsNhanSu_Loc = new ArrayList<>();
    NhanSuModel nhanSuDuocChon = null;
    DefaultTableModel model;
    java.awt.Frame bb;
    String id;
    BanModel thuocBan;
    NhanSuModel nhanSuThem;

    public ThemNhanSuVaoBan(String id, BanModel thuocBan, NhanSuModel nhanSuThem) throws IOException {
        initComponents();
        this.id = id;
        this.thuocBan = thuocBan;
        this.nhanSuThem = nhanSuThem;
        try {
            dsPhong = PhongController.ReadToFile();
            dsBan = BanController.ReadToFile();
            dsBan_NhanSu = Ban_NhanSuController.ReadToFile();
            dsNhanSu = NhanSuController.ReadToFile();
            dsNhanSu_Loc.addAll(dsNhanSu);

        } catch (IOException ex) {
            System.out.println("Loi");
        }

        model = (DefaultTableModel) table_NhanSu.getModel();
        hienThiDsNhanSu();

        if (this.nhanSuThem != null) {
            nhanSuDuocChon = this.nhanSuThem;
            txt_NhanSu.setText(nhanSuDuocChon.getMaNS() + " - " + nhanSuDuocChon.getHoTen() + " - " + nhanSuDuocChon.getChuyenNganh());
        }

        for (PhongModel p : dsPhong) {
            cbbox_dsPhong.addItem(p.getMaPhong() + " - " + p.getTenPhong());
        }   
        if (thuocBan.getMaBan().equals("")) {
            if (thuocBan.getThuocPhong() == null) {
                cbbox_dsPhong.setSelectedIndex(0);
                dsBanThuocPhong = BanController.TimBanTheoPhong(dsBan, dsPhong.get(0));
                cbbox_dsBan.removeAllItems();
                for (BanModel b : dsBanThuocPhong) {
                    cbbox_dsBan.addItem(b.getMaBan() + " - " + b.getTenBan());
                }
            } else {
                cbbox_dsPhong.setSelectedIndex(dsPhong.indexOf(thuocBan.getThuocPhong()));
                dsBanThuocPhong = BanController.TimBanTheoPhong(dsBan, thuocBan.getThuocPhong());
                cbbox_dsBan.removeAllItems();
                for (BanModel b : dsBanThuocPhong) {
                    cbbox_dsBan.addItem(b.getMaBan() + " - " + b.getTenBan());
                }
                cbbox_dsBan.setSelectedIndex(0);
            }

        } else {
            cbbox_dsPhong.setSelectedIndex(dsPhong.indexOf(thuocBan.getThuocPhong()));
            dsBanThuocPhong = BanController.TimBanTheoPhong(dsBan, thuocBan.getThuocPhong());
            cbbox_dsBan.removeAllItems();
            for (BanModel b : dsBanThuocPhong) {
                cbbox_dsBan.addItem(b.getMaBan() + " - " + b.getTenBan());
            }
            cbbox_dsBan.setSelectedIndex(dsBanThuocPhong.indexOf(thuocBan));
        }
    }

    public void hienThiDsNhanSu() {
        model.setRowCount(0);
        for (NhanSuModel n : dsNhanSu_Loc) {
            model.addRow(new Object[]{
                n.getMaNS(), n.getHoTen(), n.getChuyenNganh()
            });
        }
    }

    public void timKiemDsNhanSu() {
        dsNhanSu_Loc.clear();

        String keywordChuyennganh = text_KeywordChuyenNganh.getText();
        String keywordTen = text_KeywordTen.getText();
        String keywordMa = text_KeywordMa.getText();

        for (NhanSuModel n : dsNhanSu) {
            if (n.getMaNS().toLowerCase().contains(keywordMa.toLowerCase())
                    && n.getHoTen().toLowerCase().contains(keywordTen.toLowerCase())
                    && n.getChuyenNganh().toLowerCase().contains(keywordChuyennganh.toLowerCase())) {
                dsNhanSu_Loc.add(n);
            }
        }
        hienThiDsNhanSu();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        lable_thongBaoLoi = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_NhanSu = new javax.swing.JTextField();
        cbbox_dsPhong = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cbbox_dsBan = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_NhanSu = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        text_KeywordChuyenNganh = new javax.swing.JTextField();
        text_KeywordMa = new javax.swing.JTextField();
        text_KeywordTen = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        cb_ChucVu = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(lable_thongBaoLoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, -1, -1));

        jButton1.setText("Thêm nhân sự vào ban");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 350, -1, 30));

        jLabel2.setText("Chức vụ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 285, -1, -1));

        jLabel3.setText("Phòng");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 185, -1, -1));

        txt_NhanSu.setEnabled(false);
        txt_NhanSu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_NhanSuActionPerformed(evt);
            }
        });
        getContentPane().add(txt_NhanSu, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 310, 30));

        cbbox_dsPhong.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbbox_dsPhongItemStateChanged(evt);
            }
        });
        cbbox_dsPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbox_dsPhongActionPerformed(evt);
            }
        });
        getContentPane().add(cbbox_dsPhong, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 310, 30));

        jLabel4.setText("Nhân viên");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        cbbox_dsBan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbox_dsBanActionPerformed(evt);
            }
        });
        getContentPane().add(cbbox_dsBan, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 310, 30));

        jLabel5.setText("Ban");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 235, -1, -1));

        table_NhanSu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Mã", "Họ Tên", "Chuyên ngành"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_NhanSu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                table_NhanSuMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(table_NhanSu);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 40, 500, 270));

        jLabel6.setText("Tìm chuyên ngành");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 330, -1, -1));

        jLabel7.setText("Tìm kiếm mã");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 330, -1, -1));

        jLabel8.setText("Tìm kiếm tên");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 330, -1, -1));

        text_KeywordChuyenNganh.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                text_KeywordChuyenNganhKeyReleased(evt);
            }
        });
        getContentPane().add(text_KeywordChuyenNganh, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 350, 160, 30));

        text_KeywordMa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_KeywordMaActionPerformed(evt);
            }
        });
        text_KeywordMa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                text_KeywordMaKeyReleased(evt);
            }
        });
        getContentPane().add(text_KeywordMa, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 350, 160, 30));

        text_KeywordTen.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                text_KeywordTenKeyReleased(evt);
            }
        });
        getContentPane().add(text_KeywordTen, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 350, 160, 30));

        jButton3.setText("Thoát");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, -1, 30));

        cb_ChucVu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Trưởng phòng", "Phó phòng", "Trưởng ban", "Phó ban", "Giảng viên" }));
        getContentPane().add(cb_ChucVu, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 310, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/man ngang trang.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
            if (txt_NhanSu.getText().equals("") && nhanSuDuocChon == null) {
                throw new IOException("Chua chon nhan su");
            }
            if (cbbox_dsPhong.getSelectedIndex() < 0) {
                throw new IOException("Chua chon phong");
            }
            if (cbbox_dsBan.getSelectedIndex() < 0) {
                throw new IOException("Chua chon ban");
            }
            if (cb_ChucVu.getSelectedIndex() < 0) {
                throw new IOException("Chua chon chuc vu");
            }
            Ban_NhanSuModel newBan_NhanSu = new Ban_NhanSuModel(nhanSuDuocChon, dsBanThuocPhong.get(cbbox_dsBan.getSelectedIndex()), cb_ChucVu.getSelectedItem().toString());
            if (dsBan_NhanSu.contains(newBan_NhanSu) == true) {
                throw new IOException("Nhân s? dã ? trong ban!");
            }
            if (newBan_NhanSu.getChucVu().compareToIgnoreCase("Trưởng phòng") == 0 || newBan_NhanSu.getChucVu().compareToIgnoreCase("Trưởng ban") == 0) {
                for (BanModel ban : dsBanThuocPhong) {
                    for (Ban_NhanSuModel ban_NhanSu : Ban_NhanSuController.TimNhanSuTheoBan(dsBan_NhanSu, ban)) {
                        if (ban_NhanSu.getChucVu().compareToIgnoreCase("Trưởng phòng") == 0 && newBan_NhanSu.getChucVu().compareToIgnoreCase("Trưởng phòng") == 0) {
                            throw new IOException("Phòng " + ban.getThuocPhong().getTenPhong() + " dã có tru?ng phòng!");
                        }
                        if (ban.equal(newBan_NhanSu.getBan()) && ban_NhanSu.getChucVu().compareToIgnoreCase("Trưởng ban") == 0 && newBan_NhanSu.getChucVu().compareToIgnoreCase("Trưởng ban") == 0) {
                            throw new IOException("Ban " + ban.getTenBan() + " dã có tru?ng ban!");
                        }
                    }
                }
            }
            if (dsBan_NhanSu.contains(newBan_NhanSu) == true) {
                throw new IOException("Nhân s? dã ? trong ban!");
            }

            dsBan_NhanSu.add(newBan_NhanSu);
            Ban_NhanSuController.WriteToFile(dsBan_NhanSu);
            try {
                XemNhanSuTrongBan f = new XemNhanSuTrongBan(id, thuocBan, null);
                f.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                f.setLocationRelativeTo(null);
                f.setResizable(false);
                f.setVisible(true);
                this.dispose();
            } catch (IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Thêm thất bại!", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void cbbox_dsPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbox_dsPhongActionPerformed

    }//GEN-LAST:event_cbbox_dsPhongActionPerformed

    private void cbbox_dsBanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbox_dsBanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbbox_dsBanActionPerformed

    private void txt_NhanSuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_NhanSuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_NhanSuActionPerformed

    private void text_KeywordMaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_KeywordMaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_KeywordMaActionPerformed

    private void text_KeywordMaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text_KeywordMaKeyReleased
        timKiemDsNhanSu();
    }//GEN-LAST:event_text_KeywordMaKeyReleased

    private void text_KeywordTenKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text_KeywordTenKeyReleased
        timKiemDsNhanSu();
    }//GEN-LAST:event_text_KeywordTenKeyReleased

    private void text_KeywordChuyenNganhKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text_KeywordChuyenNganhKeyReleased
        timKiemDsNhanSu();
    }//GEN-LAST:event_text_KeywordChuyenNganhKeyReleased

    private void table_NhanSuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_NhanSuMousePressed
        nhanSuDuocChon = dsNhanSu_Loc.get(table_NhanSu.getSelectedRow());
        txt_NhanSu.setText(nhanSuDuocChon.getMaNS() + " - " + nhanSuDuocChon.getHoTen() + " - " + nhanSuDuocChon.getChuyenNganh());
    }//GEN-LAST:event_table_NhanSuMousePressed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            XemNhanSuTrongBan f = new XemNhanSuTrongBan(id, thuocBan, nhanSuDuocChon);
            f.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            f.setLocationRelativeTo(null);
            f.setResizable(false);
            f.setVisible(true);
            this.dispose();
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void cbbox_dsPhongItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbbox_dsPhongItemStateChanged
        dsBanThuocPhong = BanController.TimBanTheoPhong(dsBan, dsPhong.get(cbbox_dsPhong.getSelectedIndex()));
        cbbox_dsBan.removeAllItems();
        for (BanModel b : dsBanThuocPhong) {
            cbbox_dsBan.addItem(b.getMaBan() + " - " + b.getTenBan());
        }        // TODO add your handling code here:
    }//GEN-LAST:event_cbbox_dsPhongItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cb_ChucVu;
    private javax.swing.JComboBox<String> cbbox_dsBan;
    private javax.swing.JComboBox<String> cbbox_dsPhong;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lable_thongBaoLoi;
    private javax.swing.JTable table_NhanSu;
    private javax.swing.JTextField text_KeywordChuyenNganh;
    private javax.swing.JTextField text_KeywordMa;
    private javax.swing.JTextField text_KeywordTen;
    private javax.swing.JTextField txt_NhanSu;
    // End of variables declaration//GEN-END:variables
}