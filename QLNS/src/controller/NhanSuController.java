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

/**
 *
 * @author ngtha
 */
public class NhanSuController {

    public static ArrayList ReadToFile() throws FileNotFoundException, IOException {
        ArrayList<NhanSuModel> list = new ArrayList<>();
        String url = "CSDL/nhansu.txt";
        // Đọc dữ liệu từ File với Scanner
        FileInputStream fileInputStream = new FileInputStream(url);
        Scanner scanner = new Scanner(fileInputStream);
        try {
            String maNS, hoTen, ngaySinh, queQuan, CCCD, soDT, danToc,
                    maPB, chucVu, trinhDo, chuyenNganh, ngayTG, hanHD;
            boolean gioiTinh, loaiNS;
            while (scanner.hasNextLine()) {
                String s = scanner.nextLine();
                String[] ns = s.split(";");
                if (ns.length == 15) {
                    maNS = ns[0];
                    hoTen = ns[1];
                    ngaySinh = ns[2];
                    gioiTinh = Boolean.parseBoolean(ns[3]);
                    queQuan = ns[4];
                    CCCD = ns[5];
                    soDT = ns[6];
                    danToc = ns[7];
                    maPB = ns[8];
                    chucVu = ns[9];
                    trinhDo = ns[10];
                    chuyenNganh = ns[11];
                    loaiNS = Boolean.parseBoolean(ns[12]);
                    ngayTG = ns[13];
                    hanHD = ns[14];
                    NhanSuModel a = new NhanSuModel(maNS, hoTen, ngaySinh, gioiTinh, queQuan, CCCD, soDT, danToc,
                            maPB, chucVu, trinhDo, chuyenNganh, loaiNS, ngayTG, hanHD);
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

    public static void WriteToFile(ArrayList<NhanSuModel> list) throws FileNotFoundException, IOException {
        String url = "CSDL/nhansu.txt";
        // Đọc dữ liệu từ File với Scanner
        try {
            FileWriter fw = new FileWriter(url);
            BufferedWriter bw = new BufferedWriter(fw);
            for (NhanSuModel o : list) {
                bw.write(o.toString());
                bw.newLine();
            }
            bw.close();
            fw.close();
        } catch (IOException ex) {
        }
    }

    public static NhanSuModel TimNhanSuTheoMa(ArrayList<NhanSuModel> list, String id) throws IOException {
        NhanSuModel timNhanSu = new NhanSuModel(id);
        if (!list.contains(timNhanSu)) {
            return null;
        }
        return list.get(list.indexOf(timNhanSu));
    }
}
