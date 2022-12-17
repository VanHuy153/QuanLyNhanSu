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
import javax.swing.JOptionPane;
import model.LuongModel;

/**
 *
 * @author .K
 */
public class LuongController {

    public static ArrayList danh_sach_L() throws FileNotFoundException, IOException {
        ArrayList<LuongModel> list = new ArrayList<>();
        String url = "CSDL/luong.txt";
        // Đọc dữ liệu từ File với Scanner
        FileInputStream fileInputStream = new FileInputStream(url);
        Scanner scanner = new Scanner(fileInputStream);
        try {
            while (scanner.hasNextLine()) {
                LuongModel a = new LuongModel();
                String s = scanner.nextLine();
                String[] luong = s.split(";");
                if (luong.length == 5) {
                    a.setLoaiNS(luong[0]);
                    a.setmLCS(Double.parseDouble(luong[1]));
                    a.setHSL(Double.parseDouble(luong[2]));
                    a.setPhuCap(Double.parseDouble(luong[3]));
                    a.setBaohiem(Double.parseDouble(luong[4]));
                    list.add(a);
                }
                else {
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

    public static void WriteToFile(ArrayList<LuongModel> list) throws FileNotFoundException, IOException {
        String url = "CSDL/luong.txt";
        // Đọc dữ liệu từ File với Scanner
        try {
            FileWriter fw = new FileWriter(url);
            BufferedWriter bw = new BufferedWriter(fw);
            for (LuongModel o : list) {
                bw.write(o.getLoaiNS() + ";" + o.getmLCS().toString() + ";" + o.getHSL().toString() + ";" + o.getPhuCap().toString() + ";" + o.getBaohiem().toString());
                bw.newLine();
            }
            bw.close();
            fw.close();
        } catch (IOException ex) {
        }
    }

    public static LuongModel TimLuongTheoMaNS(ArrayList<LuongModel> list, String maNS) throws IOException {
        LuongModel timLuong = new LuongModel(maNS);
        if (!list.contains(timLuong)) {
            return null;
        }
        return list.get(list.indexOf(timLuong));
    }
}
