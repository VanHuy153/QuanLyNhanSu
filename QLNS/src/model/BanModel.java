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
public class BanModel {
    private String maBan;
    private String tenBan;
    private PhongModel thuocPhong;

    public String getMaBan() {
        return maBan;
    }

    public void setMaBan(String maBan) {
        this.maBan = maBan;
    }

    public String getTenBan() {
        return tenBan;
    }

    public void setTenBan(String tenBan) {
        this.tenBan = tenBan;
    }

    public PhongModel getThuocPhong() {
        return thuocPhong;
    }

    public void setThuocPhong(PhongModel thuocPhong) {
        this.thuocPhong = thuocPhong;
    }
    
    public BanModel(String maBan, String tenBan, PhongModel thuocPhong) {
        this.maBan = maBan;
        this.tenBan = tenBan;
        this.thuocPhong = thuocPhong;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.maBan);
        hash = 83 * hash + Objects.hashCode(this.tenBan);
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
        final BanModel other = (BanModel) obj;
        if (Objects.equals(this.maBan, other.maBan)) {
            return true;
        }
        return Objects.equals(this.tenBan, other.tenBan);
    }
    
    public boolean equal(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final BanModel other = (BanModel) obj;
        if (!Objects.equals(this.maBan, other.maBan)) {
            return false;
        }
        return Objects.equals(this.tenBan, other.tenBan);
    }
    

}
