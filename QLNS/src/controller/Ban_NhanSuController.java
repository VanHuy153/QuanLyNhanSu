/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import model.NhanSuModel;
import model.BanModel;
import model.Ban_NhanSuModel;

/**
 *
 * @author admin
 */
public class Ban_NhanSuController {

    public static ArrayList ReadToFile() throws FileNotFoundException, IOException {
        ArrayList<Ban_NhanSuModel> list = new ArrayList<>();
        ArrayList<BanModel> dsBan = BanController.ReadToFile();
        ArrayList<NhanSuModel> dsNhanSu = NhanSuController.ReadToFile();
        String url = "CSDL/ban_nhansu.txt";
        // Đọc dữ liệu từ File với Scanner
        FileInputStream fileInputStream = new FileInputStream(url);
        Scanner scanner = new Scanner(fileInputStream);
        try {
            NhanSuModel nhanSu;
            BanModel ban;
            String chucVu;
            while (scanner.hasNextLine()) {
                String s = scanner.nextLine();
                String[] phong = s.split(";");
                if (phong.length == 3) {
                    nhanSu = NhanSuController.TimNhanSuTheoMa(dsNhanSu, phong[0]);
                    ban = BanController.TimBanTheoMa(dsBan, phong[1]);
                    chucVu = phong[2];
                    Ban_NhanSuModel a = new Ban_NhanSuModel(nhanSu, ban, chucVu);
                    list.add(a);
                } else {
                    System.out.println(url + " === L?i d? li?u === " + s);
                }
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

    public static void WriteToFile(ArrayList<Ban_NhanSuModel> list) throws FileNotFoundException, IOException {
        String url = "CSDL/ban_nhansu.txt";
        // Đọc dữ liệu từ File với Scanner
        try {
            FileWriter fw = new FileWriter(url);
            BufferedWriter bw = new BufferedWriter(fw);
            for (Ban_NhanSuModel o : list) {
                bw.write(o.getNhanSu().getMaNS() + ";" + o.getBan().getMaBan() + ";" + o.getChucVu());
                bw.newLine();
            }
            bw.close();
            fw.close();
        } catch (IOException ex) {
        }
    }

    public static Ban_NhanSuModel TimChucVu(ArrayList<Ban_NhanSuModel> list, NhanSuModel nhanSu, BanModel ban) throws Exception {
        Ban_NhanSuModel timNhanSu = new Ban_NhanSuModel(nhanSu, ban);
        if (!list.contains(timNhanSu)) {
            throw new Exception("Không tìm th?y phòng có mã: " + nhanSu);
        }
        return list.get(list.indexOf(timNhanSu));
    }

    public static ArrayList<Ban_NhanSuModel> TimNhanSuTheoBan(ArrayList<Ban_NhanSuModel> dsNhanSu, BanModel thuocBan) {
        ArrayList<Ban_NhanSuModel> dsNhanSuTheoBan = new ArrayList<>();
        for (Ban_NhanSuModel item : dsNhanSu) {
            if (item.getBan().equal(thuocBan)) {
                dsNhanSuTheoBan.add(item);
            }
        }
        return dsNhanSuTheoBan;
    }

    public static ArrayList<Ban_NhanSuModel> TimBanTheoNhanSu(ArrayList<Ban_NhanSuModel> dsNhanSu, NhanSuModel nhanSuModel) {
        ArrayList<Ban_NhanSuModel> dsBanTheoNhanSu = new ArrayList<>();
        for (Ban_NhanSuModel item : dsNhanSu) {
            if (item.getNhanSu().equals(nhanSuModel)) {
                dsBanTheoNhanSu.add(item);
            }
        }
        return dsBanTheoNhanSu;
    }

    public static void SuaBan_NhanSuTheoBan(BanModel banSua, BanModel banMoi) throws IOException {
        ArrayList<Ban_NhanSuModel> list = Ban_NhanSuController.ReadToFile();
        for (Ban_NhanSuModel bx : list) {
            if (bx.getBan().equals(banSua)) {
                bx.setBan(banMoi);
            }
        }
        Ban_NhanSuController.WriteToFile(list);
    }
}
