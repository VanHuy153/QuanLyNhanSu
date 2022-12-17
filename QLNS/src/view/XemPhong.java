/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.BanController;
import controller.Ban_NhanSuController;
import controller.PhongController;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import javax.swing.table.DefaultTableModel;
import model.BanModel;
import model.Ban_NhanSuModel;
import model.PhongModel;

/**
 *
 * @author admin
 */
public class XemPhong extends javax.swing.JFrame {

    ArrayList<PhongModel> dsPhong = new ArrayList<>();
    ArrayList<BanModel> dsBan = new ArrayList<>();
    ArrayList<Ban_NhanSuModel> dsBan_NhanSu = new ArrayList<>();
    DefaultTableModel model;
    java.awt.Frame bb;
    BanController banController;
    String id;

    public XemPhong(String id) throws IOException {
        initComponents();
        this.id = id;
        try {
            dsPhong = PhongController.ReadToFile();
            dsBan = BanController.ReadToFile();
            dsBan_NhanSu = Ban_NhanSuController.ReadToFile();
        } catch (IOException ex) {

        }
        model = (DefaultTableModel) tableDanhSachPhong.getModel();
        showresult();
    }

    public void showresult() {
        model.setRowCount(0);
        int dem = 1;
        for (PhongModel s : dsPhong) {
            model.addRow(new Object[]{
                dem++, s.getMaPhong(), s.getTenPhong(), BanController.TimBanTheoPhong(dsBan, s).size()
            });
        }
    }

    public void XoaBanTheoPhong(PhongModel phongXoa) {
        try {
            for (int i = 0; i < dsBan.size(); i++) {
                if (dsBan.get(i).getThuocPhong().equals(phongXoa)) {
                    for (int j = 0; j < dsBan_NhanSu.size(); j++) {
                        if (dsBan_NhanSu.get(j).getBan().equals(dsBan.get(i))) {
                            dsBan_NhanSu.remove(dsBan_NhanSu.get(j));
                            j--;
                        }
                    }
                    
                    dsBan.remove(dsBan.get(i));
                    i--;
                }
            }
            BanController.WriteToFile(dsBan);
            Ban_NhanSuController.WriteToFile(dsBan_NhanSu);
        } catch (IOException e) {
            System.out.println("Loi a");
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

        jScrollPane2 = new javax.swing.JScrollPane();
        tableDanhSachPhong = new javax.swing.JTable();
        btn_Them = new javax.swing.JButton();
        btn_Sua = new javax.swing.JButton();
        btn_Xoa = new javax.swing.JButton();
        trove = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableDanhSachPhong.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã phòng", "Tên phòng", "Số ban"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tableDanhSachPhong);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 590, 230));

        btn_Them.setText("Thêm phòng");
        btn_Them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ThemActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Them, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 110, -1));

        btn_Sua.setText("Sửa");
        btn_Sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SuaActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Sua, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 390, -1, -1));

        btn_Xoa.setText("Xóa");
        btn_Xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_XoaActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Xoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 390, -1, -1));

        trove.setText("Thoát");
        trove.setToolTipText("");
        trove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                troveActionPerformed(evt);
            }
        });
        getContentPane().add(trove, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 390, -1, -1));

        jButton1.setText("Xem phòng");
        jButton1.setToolTipText("");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 390, -1, -1));

        jButton2.setText("Xem tất cả phòng ban");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 40, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/man ngang.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ThemActionPerformed
        try {
            ThemPhong f = new ThemPhong(id);
            f.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            f.setLocationRelativeTo(null);
            f.setResizable(false);
            f.setVisible(true);
            this.dispose();
        } catch (IOException ex) {
            Logger.getLogger(XemPhong.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_ThemActionPerformed

    private void btn_SuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SuaActionPerformed
        // TODO add your handling code here:
        try {
            if (tableDanhSachPhong.getSelectedRow() < 0) {
                JOptionPane.showMessageDialog(rootPane, "Ban chua chon phong");
            } else {
                int a = tableDanhSachPhong.getSelectedRow();
                SuaPhong f = new SuaPhong(id, a);
                f.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                f.setLocationRelativeTo(null);
                f.setResizable(false);
                f.setVisible(true);
                this.dispose();
            }
        } catch (IOException ex) {
            Logger.getLogger(XemPhong.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_SuaActionPerformed

    private void btn_XoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_XoaActionPerformed
        try {
            int index = tableDanhSachPhong.getSelectedRow();
            if (index == -1) {
                throw new IOException("Bạn chưa chọn phòng muốn xoá!");
            }
            if (JOptionPane.showConfirmDialog(null, "Bạn có chắc muốn xoá phòng " + dsPhong.get(index).getTenPhong() + " ?", "Cảnh báo", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                PhongModel phongXoa = dsPhong.get(index);
                dsPhong.remove(index);
                PhongController.WriteToFile(dsPhong);
                XoaBanTheoPhong(phongXoa);

            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Xoa thất bại!", JOptionPane.ERROR_MESSAGE);
        } finally {
            showresult();
        }

    }//GEN-LAST:event_btn_XoaActionPerformed

    private void troveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_troveActionPerformed
        Main f;
        try {
            f = new Main(id);
            f.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            f.setLocationRelativeTo(null);
            f.setResizable(false);
            f.setVisible(true);
            this.dispose();
        } catch (IOException ex) {
            Logger.getLogger(XemPhong.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_troveActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            if (tableDanhSachPhong.getSelectedRow() < 0) {
                JOptionPane.showMessageDialog(rootPane, "Ban chua chon phong");
            } else {
                PhongModel phong = dsPhong.get(tableDanhSachPhong.getSelectedRow());
                XemBan f = new XemBan(id, phong);
                f.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                f.setLocationRelativeTo(null);
                f.setResizable(false);
                f.setVisible(true);
                this.dispose();
            }
        } catch (IOException ex) {
            Logger.getLogger(XemPhong.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        XemBan f;
        try {
            f = new XemBan(id, null);
            f.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            f.setLocationRelativeTo(null);
            f.setResizable(false);
            f.setVisible(true);
            this.dispose();
        } catch (IOException ex) {
            Logger.getLogger(XemPhong.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Sua;
    private javax.swing.JButton btn_Them;
    private javax.swing.JButton btn_Xoa;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tableDanhSachPhong;
    private javax.swing.JButton trove;
    // End of variables declaration//GEN-END:variables
}
