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
import java.util.logging.Level;
import model.AccountModel;
import view.Login;

/**
 *
 * @author .K
 */
public class TaiKhoanController {
    public static ArrayList danh_sach_TK() throws FileNotFoundException, IOException{
        ArrayList<AccountModel> list = new ArrayList<>();
        String url = "CSDL/account.txt";
        // Đọc dữ liệu từ File với Scanner
        FileInputStream fileInputStream = new FileInputStream(url);
        Scanner scanner = new Scanner(fileInputStream);
        try {
            while (scanner.hasNextLine()) {
                String s = scanner.nextLine();
                String[] acc = s.split(";");
                if (acc.length == 4) {
                    AccountModel a = new AccountModel();
                    a.setUsername(acc[0]);
                    a.setPassword(acc[1]);
                    a.setTen(acc[2]);
                    a.setChucvu(acc[3]);
                    list.add(a);
                }
                else {
                    System.out.println(url + " === Lỗi dữ liệu === " + s);
                }
                
                
            }
        } finally {
            try {
                scanner.close();
                fileInputStream.close();
            } catch (IOException ex) {
                 java.util.logging.Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return list;
    }
    public static void WriteToFile(ArrayList<AccountModel> list) throws FileNotFoundException, IOException{
        String url = "CSDL/account.txt";
        // Đọc dữ liệu từ File với Scanner
        try {
            FileWriter fw = new FileWriter(url);
            BufferedWriter bw = new BufferedWriter(fw);
            for(AccountModel o: list){
                bw.write(o.getUsername() + ";" + o.getPassword() + ";" + o.getTen() + ";" + o.getChucvu());
                bw.newLine();
            }
            bw.close();
            fw.close();
        } catch (IOException ex) {
        }
    }
}
