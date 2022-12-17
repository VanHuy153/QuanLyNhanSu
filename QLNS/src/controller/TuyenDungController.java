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
import model.TuyenDungModel;

/**
 *
 * @author ngtha
 */
public class TuyenDungController {

    public static ArrayList ReadToFileTD() throws FileNotFoundException, IOException {
        ArrayList<TuyenDungModel> listtd = new ArrayList<>();
        String url = "CSDL/tuyendung.txt";
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
                if (ns.length == 13) {
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
                    listtd.add(a);
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
        return listtd;
    }

    public static void WriteToFile(ArrayList<TuyenDungModel> list) throws FileNotFoundException, IOException {
        String url = "CSDL/tuyendung.txt";
        // Đọc dữ liệu từ File với Scanner
        try {
            FileWriter fw = new FileWriter(url);
            BufferedWriter bw = new BufferedWriter(fw);
            for (TuyenDungModel o : list) {
                bw.write(o.toString());
                bw.newLine();
            }
            bw.close();
            fw.close();
        } catch (IOException ex) {
        }
    }

    public static NhanSuModel TimNhanSuTheoMa(ArrayList<NhanSuModel> list, String id) throws IOException {
        TuyenDungModel timNhanSu = new TuyenDungModel(id);
        if (!list.contains(timNhanSu)) {
            throw new IOException("Không tìm th?y phòng có mã: " + id);
        }
        return list.get(list.indexOf(timNhanSu));
    }
}
