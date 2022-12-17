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
import model.PhongModel;

/**
 *
 * @author .K
 */
public class PhongController {
    public static ArrayList ReadToFile() throws FileNotFoundException, IOException{
        ArrayList<PhongModel> list = new ArrayList<>();
        String url = "CSDL/phong.txt";
        // Đọc dữ liệu từ File với Scanner
        FileInputStream fileInputStream = new FileInputStream(url);
        Scanner scanner = new Scanner(fileInputStream);
        try {
            String maPhong;
            String tenPhong;
            while (scanner.hasNextLine()) {
                String s = scanner.nextLine();
                String[] phong = s.split(";");
                if (phong.length == 2) {
                    maPhong = phong[0];
                    tenPhong = phong[1];
                    PhongModel a = new PhongModel(maPhong, tenPhong);
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
    public static void WriteToFile(ArrayList<PhongModel> list) throws FileNotFoundException, IOException{
        String url = "CSDL/phong.txt";
        // Đọc dữ liệu từ File với Scanner
        try {
            FileWriter fw = new FileWriter(url);
            BufferedWriter bw = new BufferedWriter(fw);
            for(PhongModel o: list){
                bw.write(o.getMaPhong() + ";" + o.getTenPhong());
                bw.newLine();
            }
            bw.close();
            fw.close();
        } catch (IOException ex) {
        }
    }
    public static PhongModel TimPhongTheoMa(ArrayList<PhongModel> list, String id) throws IOException{
        PhongModel timPhong = new PhongModel(id, null);
        if(!list.contains(timPhong)){
            throw new IOException("Không tìm th?y phòng có mã: " + id);
        }
        return list.get(list.indexOf(timPhong));
    }
    public static PhongModel TimPhongTheoTen(ArrayList<PhongModel> list, String ten) throws IOException{
        PhongModel timPhong = new PhongModel(null, ten);
        if(!list.contains(timPhong)){
            throw new IOException("Không tìm th?y phòng có tên: " + ten);
        }
        return list.get(list.indexOf(timPhong));
    }
}
