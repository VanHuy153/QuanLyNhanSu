/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Objects;

/**
 *
 * @author admin
 */
public class Luong_NhanSuModel {
    private NhanSuModel nhanSu;
    private LuongModel luong;

    public NhanSuModel getNhanSu() {
        return nhanSu;
    }

    public void setNhanSu(NhanSuModel nhanSu) {
        this.nhanSu = nhanSu;
    }

    public LuongModel getLuong() {
        return luong;
    }

    public void setLuong(LuongModel luong) {
        this.luong = luong;
    }

    public Luong_NhanSuModel(NhanSuModel nhanSu, LuongModel luong) {
        this.nhanSu = nhanSu;
        this.luong = luong;
    }
    
    public Luong_NhanSuModel(NhanSuModel nhanSu){
        this.nhanSu = nhanSu;
    }
    public Luong_NhanSuModel(LuongModel luong){
        this.luong = luong;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Luong_NhanSuModel other = (Luong_NhanSuModel) obj;
        return Objects.equals(this.nhanSu, other.nhanSu);
    }
    
    
}
