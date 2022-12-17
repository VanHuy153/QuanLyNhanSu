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
public class Ban_NhanSuModel {
    private NhanSuModel nhanSu;
    private BanModel ban;
    private String chucVu;

    public NhanSuModel getNhanSu() {
        return nhanSu;
    }

    public void setNhanSu(NhanSuModel nhanSu) {
        this.nhanSu = nhanSu;
    }

    public BanModel getBan() {
        return ban;
    }

    public void setBan(BanModel ban) {
        this.ban = ban;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public Ban_NhanSuModel(NhanSuModel nhanSu, BanModel ban, String chucVu) {
        this.nhanSu = nhanSu;
        this.ban = ban;
        this.chucVu = chucVu;
    }
    
    public Ban_NhanSuModel(NhanSuModel nhanSu){
        this.nhanSu = nhanSu;
    }
    public Ban_NhanSuModel(BanModel ban){
        this.ban = ban;
    }
    public Ban_NhanSuModel(NhanSuModel nhanSu, BanModel ban){
        this.nhanSu = nhanSu;                
        this.ban = ban;
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
        final Ban_NhanSuModel other = (Ban_NhanSuModel) obj;
        if (!Objects.equals(this.nhanSu, other.nhanSu)) {
            return false;
        }
        return Objects.equals(this.ban, other.ban);
    }
    
}
