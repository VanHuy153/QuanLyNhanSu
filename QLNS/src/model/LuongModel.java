/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Objects;

/**
 *
 * @author .K
 */
public class LuongModel {
    private String loaiNS;
    private Double mLCS;
    private Double HSL;
    private Double phuCap;
    private Double baohiem;

    public LuongModel() {
    }

    
    public LuongModel(String loaiNS) {
        this.loaiNS = loaiNS;
    }

    public LuongModel(String loaiVC, Double mLCS, Double HSL, Double phuCap, Double baohiem) {
        this.loaiNS = loaiVC;
        this.mLCS = mLCS;
        this.HSL = HSL;
        this.phuCap = phuCap;
        this.baohiem = baohiem;
    }


    public String getLoaiNS() {
        return loaiNS;
    }

    public Double getHSL() {
        return HSL;
    }

    public Double getPhuCap() {
        return phuCap;
    }

    public Double getBaohiem() {
        return baohiem;
    }

    public void setLoaiNS(String loaiVC) {
        this.loaiNS= loaiVC;
    }

    public void setHSL(Double HSL) {
        this.HSL = HSL;
    }

    public void setPhuCap(Double phuCap) {
        this.phuCap = phuCap;
    }

    public void setBaohiem(Double baohiem) {
        this.baohiem = baohiem;
    }

    public Double getmLCS() {
        return mLCS;
    }

    public void setmLCS(Double mLCS) {
        this.mLCS = mLCS;
    }
    public double TinhLuong(){
        double tinhLuong;
        tinhLuong = (this.mLCS * this.HSL + this.phuCap) - this.baohiem;
        return tinhLuong;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + Objects.hashCode(this.loaiNS);
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
        final LuongModel other = (LuongModel) obj;
        return Objects.equals(this.loaiNS, other.loaiNS);
    }
    
}
