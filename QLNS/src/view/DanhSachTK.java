/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.TaiKhoanController;
import controller.NhanSuController;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import javax.swing.table.DefaultTableModel;
import model.AccountModel;

/**
 *
 * @author .K
 */
public class DanhSachTK extends javax.swing.JFrame {

    /**
     * Creates new form DanhSachTK
     */
    ArrayList<AccountModel> danhsach = new ArrayList<>();
    DefaultTableModel model;
    java.awt.Frame bb;
    String id;

    public DanhSachTK(String id) throws IOException {
        this.id = id;
        initComponents();
        try {
            danhsach = TaiKhoanController.danh_sach_TK();
        } catch (IOException ex) {

        }
        model = (DefaultTableModel) DSTK.getModel();
        showresult();
    }
    int t = 1;

    public void showresult() {
        for (AccountModel s : danhsach) {

            model.addRow(new Object[]{
                t++, s.getUsername(), s.getChucvu(), s.getTen()
            });
        }
    }

    public DanhSachTK() {
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

        jLabel2 = new javax.swing.JLabel();
        btn_troVe = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        DSTK = new javax.swing.JTable();
        btn_sua = new javax.swing.JButton();
        btn_xoa = new javax.swing.JButton();
        btn_them = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Danh Sách Tài Khoản");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, -1, -1));

        btn_troVe.setText("Trở về");
        btn_troVe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_troVeActionPerformed(evt);
            }
        });
        getContentPane().add(btn_troVe, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 30, 90, -1));

        DSTK.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Tên TK", "Chức Vụ", "Họ Tên"
            }
        ));
        DSTK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DSTKMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(DSTK);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 140, 620, 220));

        btn_sua.setText("Sửa");
        btn_sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_suaActionPerformed(evt);
            }
        });
        getContentPane().add(btn_sua, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 380, 110, 34));

        btn_xoa.setText("Xoá");
        btn_xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xoaActionPerformed(evt);
            }
        });
        getContentPane().add(btn_xoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 380, 110, 34));

        btn_them.setText("Thêm");
        btn_them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_themActionPerformed(evt);
            }
        });
        getContentPane().add(btn_them, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, 110, 34));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/man ngang.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_troVeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_troVeActionPerformed
        // TODO add your handling code here:
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
    }//GEN-LAST:event_btn_troVeActionPerformed

    private void DSTKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DSTKMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_DSTKMouseClicked

    private void btn_suaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_suaActionPerformed
        try {
            int index = DSTK.getSelectedRow();
            if(index==-1){
                throw new IOException("Bạn chưa chọn tài khoản muốn sửa!");
            }
            String t= (String)model.getValueAt(index, 1);
            SuaTK f = new SuaTK(id,t);
            f.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            f.setLocationRelativeTo(null);
            f.setResizable(false);
            f.setVisible(true);
            this.dispose();
        } catch (IOException ex) { 
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Thao tác thất bại!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_suaActionPerformed

    private void btn_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoaActionPerformed
        try {
            int index = DSTK.getSelectedRow();
            if (index == -1) {
                throw new IOException("Bạn chưa chọn tài khoản muốn xoá!");
            }
            String t = (String) model.getValueAt(index, 1);
            AccountModel a = new AccountModel(t);
            a = danhsach.get(danhsach.indexOf(a));
            if (a.getChucvu().equals("Quản Trị Viên")) {
                throw new IOException("Bạn không thể xoá người này!");
            }
            if (JOptionPane.showConfirmDialog(null, "Bạn có chắc muốn xoá người này?", "Cảnh báo", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                danhsach.remove(index);
                try {
                    TaiKhoanController.WriteToFile(danhsach);
                    throw new Exception("Xoá thành công!");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, e.getMessage(), "Thông báo", JOptionPane.NO_OPTION);
                }
                try {
                    DanhSachTK f;
                    f = new DanhSachTK(id);
                    f.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                    f.setLocationRelativeTo(null);
                    f.setResizable(false);
                    f.setVisible(true);
                    this.dispose();
                } catch (IOException ex) {
                    java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Thao tác thất bại!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_xoaActionPerformed

    private void btn_themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_themActionPerformed
        try {
                    ThemTK f;
                    f = new ThemTK(id);
                    f.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                    f.setLocationRelativeTo(null);
                    f.setResizable(false);
                    f.setVisible(true);
                    this.dispose();
                } catch (IOException ex) {
                    java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }
    }//GEN-LAST:event_btn_themActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable DSTK;
    private javax.swing.JButton btn_sua;
    private javax.swing.JButton btn_them;
    private javax.swing.JButton btn_troVe;
    private javax.swing.JButton btn_xoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}