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
import model.BanModel;
import model.PhongModel;

/**
 *
 * @author admin
 */
public class BanController {

    public static ArrayList ReadToFile() throws FileNotFoundException, IOException {
        ArrayList<BanModel> list = new ArrayList<>();
        ArrayList<PhongModel> dsPhong = PhongController.ReadToFile();
        String url = "CSDL/ban.txt";
        // Đọc dữ liệu từ File với Scanner
        FileInputStream fileInputStream = new FileInputStream(url);
        Scanner scanner = new Scanner(fileInputStream);
        try {
            String maBan;
            String tenBan;
            PhongModel thuocPhong;
            while (scanner.hasNextLine()) {
                String s = scanner.nextLine();
                String[] phong = s.split(";");
                if (phong.length == 3) {
                    maBan = phong[0];
                    tenBan = phong[1];
                    thuocPhong = PhongController.TimPhongTheoMa(dsPhong, phong[2]);
                    BanModel a = new BanModel(maBan, tenBan, thuocPhong);
                    BanModel.class.getClass().getModule();
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

    public static void WriteToFile(ArrayList<BanModel> list) throws FileNotFoundException, IOException {
        String url = "CSDL/ban.txt";
        // Đọc dữ liệu từ File với Scanner
        try {
            FileWriter fw = new FileWriter(url);
            BufferedWriter bw = new BufferedWriter(fw);
            for (BanModel o : list) {
                bw.write(o.getMaBan() + ";" + o.getTenBan() + ";" + o.getThuocPhong().getMaPhong());
                bw.newLine();
            }
            bw.close();
            fw.close();
        } catch (IOException ex) {
        }
    }

    public static BanModel TimBanTheoMa(ArrayList<BanModel> list, String id) throws IOException {
        BanModel timBan = new BanModel(id, null, null);
        if (!list.contains(timBan)) {
            throw new IOException("Không tìm th?y phòng có mã: " + id);
        }
        return list.get(list.indexOf(timBan));
    }

    public static BanModel TimBanTheoTen(ArrayList<BanModel> list, String ten) throws IOException {
        BanModel timBan = new BanModel(null, ten, null);
        if (!list.contains(timBan)) {
            throw new IOException("Không tìm th?y phòng có tên: " + ten);
        }
        return list.get(list.indexOf(timBan));
    }

    public static ArrayList<BanModel> TimBanTheoPhong(ArrayList<BanModel> dsBan, PhongModel thuocPhong) {
        ArrayList<BanModel> dsBanTheoPhong = new ArrayList<>();
        for (BanModel ban : dsBan) {
            if (ban.getThuocPhong().equal(thuocPhong)) {
                dsBanTheoPhong.add(ban);
            }
        }
        return dsBanTheoPhong;
    }

    public static void SuaBanTheoPhong(PhongModel phongSua, PhongModel phongMoi) throws IOException {
        try {
            ArrayList<BanModel> list = BanController.ReadToFile();
            for (BanModel bx : list) {
                if (bx.getThuocPhong().equals(phongSua)) {
                    bx.setThuocPhong(phongMoi);
                }
            }
            BanController.WriteToFile(list);
        } catch (IOException e) {
            System.out.println("Loi a");
        }

    }
}
