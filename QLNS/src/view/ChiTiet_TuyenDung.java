/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.NhanSuController;
import controller.TuyenDungController;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.TuyenDungModel;


/**
 *
 * @author vmass
 */
public class ChiTiet_TuyenDung extends javax.swing.JFrame {

    /**
     * Creates new form ChiTiet_TuyenDung
     */
    ArrayList<TuyenDungModel> danhsachtd = new ArrayList<>();
    String id;
    TuyenDungModel td;
    public ChiTiet_TuyenDung(String id, String MaTD) throws IOException {
        this.id =id;
        initComponents();
        danhsachtd = TuyenDung.ReadToFile();
        showresult(MaTD);
    }

    private ChiTiet_TuyenDung() {
        // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public void showresult(String maTD){
        TuyenDungModel s = new TuyenDungModel(maTD);
            if(danhsachtd.contains(s)){
                TuyenDungModel t1 = danhsachtd.get(danhsachtd.indexOf(s));
                this.td = t1;
                txt_mTD.setText(t1.getMaTD());//1
                txt_hoTen.setText(t1.getHoTen());//2
                txt_ngaySinh.setText(t1.getNgaySinh());//3
                if(td.isGioiTinh()){//4
                    txt_gioiTinh.setText("Nam");
                }else{
                    txt_gioiTinh.setText("Nữ");
                }
                txt_queQuan.setText(t1.getQueQuan());//5
                txt_cCCD.setText(t1.getCCCD());//6
                txt_soDT.setText(t1.getSoDT());//7
                txt_danToc.setText(t1.getDanToc());//8
                txt_viTriUngTuyen.setText(t1.getViTriTd());//9
                txt_trinhDo.setText(t1.getTrinhDo());//10
                txt_chuyenNganh.setText(t1.getChuyenNganh());//11
                txt_ngayNopDon.setText(t1.getNgayNopDon());//12
                txt_TrangThai.setText(t1.getTrangThai());//13
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

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_danToc = new javax.swing.JTextField();
        txt_soDT = new javax.swing.JTextField();
        txt_cCCD = new javax.swing.JTextField();
        txt_queQuan = new javax.swing.JTextField();
        txt_gioiTinh = new javax.swing.JTextField();
        txt_ngaySinh = new javax.swing.JTextField();
        txt_hoTen = new javax.swing.JTextField();
        txt_mTD = new javax.swing.JTextField();
        txt_trinhDo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txt_TrangThai = new javax.swing.JTextField();
        txt_chuyenNganh = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txt_ngayNopDon = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        btn_thoat = new javax.swing.JButton();
        txt_viTriUngTuyen = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Mã Tuyển Dụng");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 145, 97, -1));

        jLabel3.setText("Họ Tên");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 175, 97, -1));

        jLabel5.setText("Ngày Sinh");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 205, 97, -1));

        jLabel7.setText("Giới Tính");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 235, 97, -1));

        jLabel6.setText("Quê Quán");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 265, 97, -1));

        jLabel4.setText("Số CCCD");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 295, 97, -1));

        jLabel16.setText("Số Điện Thoại");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 325, 97, -1));

        jLabel8.setText("Dân Tộc");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 145, 97, -1));

        txt_danToc.setBackground(new java.awt.Color(250, 250, 250));
        txt_danToc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt_danToc.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt_danToc.setEnabled(false);
        txt_danToc.setMinimumSize(new java.awt.Dimension(64, 22));
        txt_danToc.setPreferredSize(new java.awt.Dimension(64, 22));
        getContentPane().add(txt_danToc, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 140, 99, -1));

        txt_soDT.setBackground(new java.awt.Color(250, 250, 250));
        txt_soDT.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt_soDT.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt_soDT.setEnabled(false);
        txt_soDT.setMinimumSize(new java.awt.Dimension(64, 22));
        txt_soDT.setPreferredSize(new java.awt.Dimension(64, 22));
        getContentPane().add(txt_soDT, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 99, -1));

        txt_cCCD.setBackground(new java.awt.Color(250, 250, 250));
        txt_cCCD.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt_cCCD.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt_cCCD.setEnabled(false);
        txt_cCCD.setMinimumSize(new java.awt.Dimension(64, 22));
        txt_cCCD.setPreferredSize(new java.awt.Dimension(64, 22));
        getContentPane().add(txt_cCCD, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 99, -1));

        txt_queQuan.setBackground(new java.awt.Color(250, 250, 250));
        txt_queQuan.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt_queQuan.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt_queQuan.setEnabled(false);
        txt_queQuan.setMinimumSize(new java.awt.Dimension(64, 22));
        txt_queQuan.setPreferredSize(new java.awt.Dimension(64, 22));
        getContentPane().add(txt_queQuan, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 99, -1));

        txt_gioiTinh.setBackground(new java.awt.Color(250, 250, 250));
        txt_gioiTinh.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt_gioiTinh.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt_gioiTinh.setEnabled(false);
        txt_gioiTinh.setMinimumSize(new java.awt.Dimension(64, 22));
        txt_gioiTinh.setPreferredSize(new java.awt.Dimension(64, 22));
        txt_gioiTinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_gioiTinhActionPerformed(evt);
            }
        });
        getContentPane().add(txt_gioiTinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 99, -1));

        txt_ngaySinh.setBackground(new java.awt.Color(250, 250, 250));
        txt_ngaySinh.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt_ngaySinh.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt_ngaySinh.setEnabled(false);
        txt_ngaySinh.setMinimumSize(new java.awt.Dimension(64, 22));
        txt_ngaySinh.setPreferredSize(new java.awt.Dimension(64, 22));
        getContentPane().add(txt_ngaySinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 99, -1));

        txt_hoTen.setBackground(new java.awt.Color(250, 250, 250));
        txt_hoTen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt_hoTen.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt_hoTen.setEnabled(false);
        txt_hoTen.setMinimumSize(new java.awt.Dimension(64, 22));
        txt_hoTen.setPreferredSize(new java.awt.Dimension(64, 22));
        getContentPane().add(txt_hoTen, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 99, -1));

        txt_mTD.setBackground(new java.awt.Color(250, 250, 250));
        txt_mTD.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt_mTD.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt_mTD.setEnabled(false);
        txt_mTD.setMinimumSize(new java.awt.Dimension(64, 22));
        txt_mTD.setPreferredSize(new java.awt.Dimension(64, 22));
        getContentPane().add(txt_mTD, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 99, -1));

        txt_trinhDo.setBackground(new java.awt.Color(250, 250, 250));
        txt_trinhDo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt_trinhDo.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt_trinhDo.setEnabled(false);
        txt_trinhDo.setMinimumSize(new java.awt.Dimension(64, 22));
        txt_trinhDo.setPreferredSize(new java.awt.Dimension(64, 22));
        getContentPane().add(txt_trinhDo, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 170, 99, -1));

        jLabel9.setText("Vị Trí Ứng Tuyển");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 235, 97, -1));

        jLabel10.setText("Trình Độ");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 175, 97, -1));

        jLabel11.setText("Trạng Thái");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 295, 97, -1));

        txt_TrangThai.setBackground(new java.awt.Color(250, 250, 250));
        txt_TrangThai.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt_TrangThai.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt_TrangThai.setEnabled(false);
        txt_TrangThai.setMinimumSize(new java.awt.Dimension(64, 22));
        txt_TrangThai.setPreferredSize(new java.awt.Dimension(64, 22));
        getContentPane().add(txt_TrangThai, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 290, 99, -1));

        txt_chuyenNganh.setBackground(new java.awt.Color(250, 250, 250));
        txt_chuyenNganh.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt_chuyenNganh.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt_chuyenNganh.setEnabled(false);
        txt_chuyenNganh.setMinimumSize(new java.awt.Dimension(64, 22));
        txt_chuyenNganh.setPreferredSize(new java.awt.Dimension(64, 22));
        getContentPane().add(txt_chuyenNganh, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 200, 99, -1));

        jLabel14.setText("Chuyên Ngành");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 205, 97, -1));

        txt_ngayNopDon.setBackground(new java.awt.Color(250, 250, 250));
        txt_ngayNopDon.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt_ngayNopDon.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt_ngayNopDon.setEnabled(false);
        txt_ngayNopDon.setMinimumSize(new java.awt.Dimension(64, 22));
        txt_ngayNopDon.setPreferredSize(new java.awt.Dimension(64, 22));
        getContentPane().add(txt_ngayNopDon, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 260, 99, -1));

        jLabel12.setText("Ngày Nộp Đơn");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 265, 97, -1));

        btn_thoat.setText("Thoát");
        btn_thoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_thoatActionPerformed(evt);
            }
        });
        getContentPane().add(btn_thoat, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 390, -1, -1));

        txt_viTriUngTuyen.setBackground(new java.awt.Color(250, 250, 250));
        txt_viTriUngTuyen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt_viTriUngTuyen.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt_viTriUngTuyen.setEnabled(false);
        txt_viTriUngTuyen.setMinimumSize(new java.awt.Dimension(64, 22));
        txt_viTriUngTuyen.setPreferredSize(new java.awt.Dimension(64, 22));
        getContentPane().add(txt_viTriUngTuyen, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 230, 99, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/man ngang.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_gioiTinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_gioiTinhActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_gioiTinhActionPerformed

    private void btn_thoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_thoatActionPerformed
        TuyenDung f;
        try {
            f = new TuyenDung(id);
            f.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            f.setLocationRelativeTo(null);
            f.setResizable(false);
            f.setVisible(true);
            this.dispose();
        } catch (IOException ex) {
            Logger.getLogger(ChiTietNhanSu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_thoatActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_thoat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txt_TrangThai;
    private javax.swing.JTextField txt_cCCD;
    private javax.swing.JTextField txt_chuyenNganh;
    private javax.swing.JTextField txt_danToc;
    private javax.swing.JTextField txt_gioiTinh;
    private javax.swing.JTextField txt_hoTen;
    private javax.swing.JTextField txt_mTD;
    private javax.swing.JTextField txt_ngayNopDon;
    private javax.swing.JTextField txt_ngaySinh;
    private javax.swing.JTextField txt_queQuan;
    private javax.swing.JTextField txt_soDT;
    private javax.swing.JTextField txt_trinhDo;
    private javax.swing.JTextField txt_viTriUngTuyen;
    // End of variables declaration//GEN-END:variables
}