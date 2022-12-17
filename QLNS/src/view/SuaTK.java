/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.TaiKhoanController;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.AccountModel;

/**
 *
 * @author .K
 */
public final class SuaTK extends javax.swing.JFrame {

    /**
     * Creates new form SuaTK
     */
    ArrayList<AccountModel> listAc = new ArrayList<>();
    String id;

    public SuaTK(String id,String matk) throws IOException {
        this.id = id;
        listAc = TaiKhoanController.danh_sach_TK();
        initComponents();
        showresult(matk);
    }
    public void showresult(String maNS) {
        AccountModel a = new AccountModel(maNS);
        a = listAc.get(listAc.indexOf(a));
        txt_tenTK.setText(a.getUsername());
        txt_ten.setText(a.getTen());
        txt_chucVu.setText(a.getChucvu());
        txt_matKhau.setText(a.getPassword());
        txt_xacNhan.setText(a.getPassword());
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
        jLabel4 = new javax.swing.JLabel();
        txt_chucVu = new javax.swing.JTextField();
        txt_ten = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_matKhau = new javax.swing.JPasswordField();
        txt_xacNhan = new javax.swing.JPasswordField();
        btn_suaMK = new javax.swing.JButton();
        btn_troVe = new javax.swing.JButton();
        layout = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Tên Tài Khoản");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 91, 26));

        txt_tenTK.setEditable(false);
        getContentPane().add(txt_tenTK, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 180, 26));

        jLabel4.setText("Chức Vụ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 91, 26));
        getContentPane().add(txt_chucVu, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 180, 26));
        getContentPane().add(txt_ten, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 180, 26));

        jLabel3.setText("Họ Tên");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 91, 26));

        jLabel5.setText("Mật Khẩu");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 91, 26));

        jLabel6.setText("Xác Nhận Mật Khẩu");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 120, 26));
        getContentPane().add(txt_matKhau, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 180, 26));
        getContentPane().add(txt_xacNhan, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 180, 26));

        btn_suaMK.setText("Lưu");
        btn_suaMK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_suaMKActionPerformed(evt);
            }
        });
        getContentPane().add(btn_suaMK, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, 160, -1));

        btn_troVe.setText("Trở Về");
        btn_troVe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_troVeActionPerformed(evt);
            }
        });
        getContentPane().add(btn_troVe, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 360, 160, -1));

        layout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/man ngang.png"))); // NOI18N
        getContentPane().add(layout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_suaMKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_suaMKActionPerformed
        try {
            if (txt_tenTK.getText().equals("")) {
                txt_tenTK.requestFocus();
                throw new Exception("Tên tài khoản không được để trống!");
            }
            if (txt_ten.getText().equals("")) {
                txt_ten.requestFocus();
                throw new Exception("Họ tên không được để trống!");
            }
            if (txt_chucVu.getText().equals("")) {
                txt_chucVu.requestFocus();
                throw new Exception("Chức vụ không được để trống!");
            }
            if (txt_matKhau.getText().equals("")) {
                txt_chucVu.requestFocus();
                throw new Exception("Mật khẩu không được để trống!");
            }
            if (txt_xacNhan.getText().equals("")) {
                txt_chucVu.requestFocus();
                throw new Exception("Xác nhận mật không được để trống!");
            }
            AccountModel a = new AccountModel(txt_tenTK.getText());
            a = listAc.get(listAc.indexOf(a));
            if (a.getChucvu().equals("Quản Trị Viên")) {
                throw new IOException("Bạn không thể sửa người này!");
            }
            String mkm = txt_matKhau.getText();
            String mkxc = txt_xacNhan.getText();
            String pattern = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=\\S+$).{8,}";
            if (mkm.equals(mkxc)) {
                if (mkm.matches(pattern)) {
                    a.setTen(txt_ten.getText());
                    a.setPassword(mkm);
                    a.setChucvu(txt_chucVu.getText());
                    try {
                        TaiKhoanController.WriteToFile(listAc);
                        throw new Exception("Sửa thông tin tài khoản thành công");
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(this, ex.getMessage(), "Thông báo", JOptionPane.NO_OPTION);
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
                } else {
                    txt_matKhau.requestFocus();
                    throw new Exception("Mật khẩu không đúng định dạng: bao gồm số, chữ hoa, chữ thường, tối thiểu 8 ký tự");
                }
            } else {
                txt_xacNhan.requestFocus();
                throw new Exception("Mật khẩu không trùng nhau");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Thêm thất bại!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_suaMKActionPerformed

    private void btn_troVeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_troVeActionPerformed
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
    }//GEN-LAST:event_btn_troVeActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_suaMK;
    private javax.swing.JButton btn_troVe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel layout;
    private javax.swing.JTextField txt_chucVu;
    private javax.swing.JPasswordField txt_matKhau;
    private javax.swing.JTextField txt_ten;
    private javax.swing.JTextField txt_tenTK;
    private javax.swing.JPasswordField txt_xacNhan;
    // End of variables declaration//GEN-END:variables
}
