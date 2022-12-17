/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;


import controller.NhanSuController;
import controller.TuyenDungController;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import javax.swing.table.DefaultTableModel;
import model.NhanSuModel;
import model.TuyenDungModel;

/**
 *
 * @author vmass
 */

public class TuyenDung extends javax.swing.JFrame {

    static ArrayList<TuyenDungModel> ReadToFile() throws FileNotFoundException, IOException {
        ArrayList<TuyenDungModel> list = new ArrayList<>();
        String url = "TuyenDung.txt";
        // Đọc dữ liệu từ File với Scanner
        FileInputStream fileInputStream = new FileInputStream(url);
        Scanner scanner = new Scanner(fileInputStream);
        try {
            String maTD, hoTen, ngaySinh, queQuan, CCCD, soDT, danToc,
            viTriTd, trinhDo, chuyenNganh, ngayNopDon, TrangThai;
            boolean gioiTinh;
            while (scanner.hasNextLine()) {
                String s = scanner.nextLine();
                String[] ns = s.split(";");
                maTD = ns[0];
                hoTen = ns[1];
                ngaySinh = ns[2];
                gioiTinh = Boolean.parseBoolean(ns[3]);
                queQuan = ns[4];
                CCCD = ns[5];
                soDT = ns[6];
                danToc = ns[7];
                viTriTd = ns[8];
                trinhDo = ns[9];
                chuyenNganh = ns[10];
                ngayNopDon = ns[11];
                TrangThai = ns[12];
                TuyenDungModel a = new TuyenDungModel(maTD, hoTen, ngaySinh, gioiTinh, queQuan, CCCD, soDT, danToc,
                viTriTd, trinhDo, chuyenNganh, ngayNopDon, TrangThai);
                list.add(a);
            }
        } finally {
            try {
                scanner.close();
                fileInputStream.close();
            } catch (IOException ex) {
            }
        }
        return list;
    }

    /**
     * Creates new form TuyenDung
     */
    ArrayList<TuyenDungModel> danhsachtd = new ArrayList<>();
    DefaultTableModel model;
    java.awt.Frame bb;
    String id;
    
    public TuyenDung(String id) throws IOException {
        this.id = id;
        initComponents();
        try{
        danhsachtd = TuyenDungController.ReadToFileTD();
        }catch(IOException ex){
        }
        model = (DefaultTableModel) tb_TuyenDung.getModel();
        showresult();
    }
    int t = 1;
    public void showresult(){
        for(TuyenDungModel s:danhsachtd){
            model.addRow(new Object[]{t++, s.getMaTD(), s.getHoTen(), s.getViTriTd(), s.getTrangThai()});
        }
    }
    TuyenDung() {
        // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_TuyenDung = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Xóa");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_xoaActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 380, -1, -1));

        jButton2.setText("Sửa");
        jButton2.setToolTipText("");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_suaActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 380, -1, -1));

        tb_TuyenDung.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Ma TD", "Họ tên", "Vị trí", "Trạng Thái"
            }
        ));
        jScrollPane1.setViewportView(tb_TuyenDung);
        tb_TuyenDung.getAccessibleContext().setAccessibleDescription("");

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 590, 220));

        jButton3.setText("Thoát");
        jButton3.setToolTipText("");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_exitActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 380, -1, -1));

        jButton4.setText("Thêm");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_themActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, -1, -1));

        jButton5.setText("Chi tiết");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_ChiTietActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/man ngang.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_xoaActionPerformed
        // TODO add your handling code here:                                        
        try {
            int index = tb_TuyenDung.getSelectedRow();
            if(index==-1){
                throw new IOException("Bạn chưa chọn nhân sự muốn xoá!");
            }
            if(JOptionPane.showConfirmDialog (null, "Bạn có chắc muốn xoá người này?","Cảnh báo",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION){
            danhsachtd.remove(index);
            TuyenDungController.WriteToFile(danhsachtd);
            TuyenDung f = new TuyenDung(id);
            f.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            f.setLocationRelativeTo(null);
            f.setResizable(false);
            f.setVisible(true);
            this.dispose();
            }
        } catch (IOException ex) { 
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Thao tác thất bại!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_bt_xoaActionPerformed

    private void bt_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_exitActionPerformed
        try {
            // TODO add your handling code here:
            Main f;
            f = new Main(id);
            f.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            f.setLocationRelativeTo(null);
            f.setResizable(false);
            f.setVisible(true);
            this.dispose();
        } catch (IOException ex) {
            Logger.getLogger(TuyenDung.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bt_exitActionPerformed

    private void bt_ChiTietActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_ChiTietActionPerformed
        // TODO add your handling code here:
        try {
            int index = tb_TuyenDung.getSelectedRow();
            if(index==-1){
                throw new IOException("Bạn chưa chọn ung vien muốn xem!");
            }
            String t= (String)model.getValueAt(index, 1);
            ChiTiet_TuyenDung f = new ChiTiet_TuyenDung(id,t);
            f.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            f.setLocationRelativeTo(null);
            f.setResizable(false);
            f.setVisible(true);
            this.dispose();
        } catch (IOException ex) { 
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Thao tác thất bại!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_bt_ChiTietActionPerformed

    private void bt_themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_themActionPerformed
        // TODO add your handling code here:
        Them_Ung_Vien f = new Them_Ung_Vien(id);
        f.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setResizable(false);
        f.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bt_themActionPerformed

    private void bt_suaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_suaActionPerformed
        // TODO add your handling code here:
        try {
            int index = tb_TuyenDung.getSelectedRow();
            if(index==-1){
                throw new IOException("Bạn chưa chọn nhân sự muốn sửa!");
            }
            String t= (String)model.getValueAt(index, 1);
            SuaThongTinUngVien f = new SuaThongTinUngVien(id,t);
            f.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            f.setLocationRelativeTo(null);
            f.setResizable(false);
            f.setVisible(true);
            this.dispose();
        } catch (IOException ex) { 
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Thao tác thất bại!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_bt_suaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb_TuyenDung;
    // End of variables declaration//GEN-END:variables
}
