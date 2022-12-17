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
public class PhongModel {
    private String maPhong;
    private String tenPhong;

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public String getTenPhong() {
        return tenPhong;
    }

    public void setTenPhong(String tenPhong) {
        this.tenPhong = tenPhong;
    }

    public PhongModel() {
        this.maPhong = "";
        this.tenPhong = "";
    }
    
    public PhongModel(String tenPhong){
        this.tenPhong = tenPhong;
    }
    
    public PhongModel(String maPhong, String tenPhong) {
        this.maPhong = maPhong;
        this.tenPhong = tenPhong;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.maPhong);
        hash = 89 * hash + Objects.hashCode(this.tenPhong);
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
        final PhongModel other = (PhongModel) obj;
        if (Objects.equals(this.maPhong, other.maPhong)) {
            return true;
        }
        return Objects.equals(this.tenPhong, other.tenPhong);
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
        final PhongModel other = (PhongModel) obj;
        if (!Objects.equals(this.maPhong, other.maPhong)) {
            return false;
        }
        return Objects.equals(this.tenPhong, other.tenPhong);
    }



    
    
}
