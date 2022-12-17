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
import model.LuongModel;
import model.Luong_NhanSuModel;

/**
 *
 * @author admin
 */
public class Luong_NhanSuController {

    public static ArrayList ReadToFile() throws FileNotFoundException, IOException {
        ArrayList<Luong_NhanSuModel> list = new ArrayList<>();
        ArrayList<LuongModel> dsLuong = LuongController.danh_sach_L();
        ArrayList<NhanSuModel> dsNhanSu = NhanSuController.ReadToFile();
        String url = "CSDL/luong_nhansu.txt";
        // Đọc dữ liệu từ File với Scanner
        FileInputStream fileInputStream = new FileInputStream(url);
        Scanner scanner = new Scanner(fileInputStream);
        try {
            NhanSuModel nhanSu;
            LuongModel luong;
            while (scanner.hasNextLine()) {
                String s = scanner.nextLine();
                String[] phong = s.split(";");
                if (phong.length == 2) {
                    nhanSu = NhanSuController.TimNhanSuTheoMa(dsNhanSu, phong[0]);
                    luong = LuongController.TimLuongTheoMaNS(dsLuong, phong[1]);
                    Luong_NhanSuModel a = new Luong_NhanSuModel(nhanSu, luong);
                    list.add(a);
                }
                else {
                    System.out.println(new java.io.File( "." ).getCanonicalPath() + "L?i d? li?u: " + s);
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

    public static void WriteToFile(ArrayList<Luong_NhanSuModel> list) throws FileNotFoundException, IOException {
        String url = "CSDL/luong_nhansu.txt";
        // Đọc dữ liệu từ File với Scanner
        try {
            FileWriter fw = new FileWriter(url);
            BufferedWriter bw = new BufferedWriter(fw);
            for (Luong_NhanSuModel o : list) {
                bw.write(o.getNhanSu().getMaNS() + ";" + o.getLuong().getLoaiNS());
                bw.newLine();
            }
            bw.close();
            fw.close();
        } catch (IOException ex) {
        }
    }

    public static Luong_NhanSuModel TimChucVu(ArrayList<Luong_NhanSuModel> list, NhanSuModel nhanSu, LuongModel luong) throws Exception {
        Luong_NhanSuModel timNhanSu = new Luong_NhanSuModel(nhanSu, luong);
        if (!list.contains(timNhanSu)) {
            throw new Exception("Không tìm thấy phòng có mã: " + nhanSu);
        }
        return list.get(list.indexOf(timNhanSu));
    }

    public static ArrayList<Luong_NhanSuModel> TimNhanSuTheoLuong(ArrayList<Luong_NhanSuModel> dsNhanSu, LuongModel thuocLuong) {
        ArrayList<Luong_NhanSuModel> dsNhanSuTheoLuong = new ArrayList<>();
        for (Luong_NhanSuModel item : dsNhanSu) {
            if (item.getLuong().equals(thuocLuong)) {
                dsNhanSuTheoLuong.add(item);
            }
        }
        return dsNhanSuTheoLuong;
    }

    public static ArrayList<Luong_NhanSuModel> TimLuongTheoNhanSu(ArrayList<Luong_NhanSuModel> dsNhanSu, NhanSuModel nhanSuModel) {
        ArrayList<Luong_NhanSuModel> dsLuongTheoNhanSu = new ArrayList<>();
        for (Luong_NhanSuModel item : dsNhanSu) {
            if (item.getNhanSu().equals(nhanSuModel)) {
                dsLuongTheoNhanSu.add(item);
            }
        }
        return dsLuongTheoNhanSu;
    }

    public static void SuaLuong_NhanSuTheoLuong(LuongModel luongSua, LuongModel luongMoi) throws IOException {
        ArrayList<Luong_NhanSuModel> list = Luong_NhanSuController.ReadToFile();
        for (Luong_NhanSuModel bx : list) {
            if (bx.getLuong().equals(luongSua)) {
                bx.setLuong(luongMoi);
            }
        }
        Luong_NhanSuController.WriteToFile(list);
    }
}
