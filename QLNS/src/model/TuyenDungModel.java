package model;

import java.util.Objects;

/**
 *
 * @author Iroha
 */
public class TuyenDungModel {
    private String maTD, hoTen, ngaySinh, queQuan, CCCD, soDT, danToc, trinhDo, chuyenNganh, viTriTd, ngayNopDon, TrangThai;
    private boolean gioiTinh;

    public TuyenDungModel() {
    }

    public TuyenDungModel(String maTD, String hoTen, String ngaySinh, boolean gioiTinh, String queQuan, String CCCD, String soDT, String danToc,
            String viTriTd, String trinhDo, String chuyenNganh, String ngayNopDon, String TrangThai) {
        this.maTD = maTD;//1
        this.hoTen = hoTen;//2
        this.ngaySinh = ngaySinh;//3
        this.gioiTinh = gioiTinh;//4
        this.queQuan = queQuan;//5
        this.CCCD = CCCD;//6
        this.soDT = soDT;//7
        this.danToc = danToc;//8
        this.viTriTd = viTriTd;//9
        this.trinhDo = trinhDo;//10
        this.chuyenNganh = chuyenNganh;//11
        this.ngayNopDon = ngayNopDon;//12
        this.TrangThai = TrangThai;//13
    }

    public TuyenDungModel(String maTD){
        this.maTD = maTD;
    }
    public String getViTriTd() {
        return viTriTd;
    }

    public void setViTriTd(String viTriTd) {
        this.viTriTd = viTriTd;
    }

    public String getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(String TrangThai) {
        this.TrangThai = TrangThai;
    }

    public String getNgayNopDon() {
        return ngayNopDon;
    }

    public String getMaTD() {
        return maTD;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public String getDanToc() {
        return danToc;
    }

    public String getSoDT() {
        return soDT;
    }

    public String getTrinhDo() {
        return trinhDo;
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setNgayNopDon(String ngayNopDon) {
        this.ngayNopDon = ngayNopDon;
    }

    public void setMaTD(String maTD) {
        this.maTD = maTD;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public void setDanToc(String danToc) {
        this.danToc = danToc;
    }

    public void setSoDT(String soDT) {
        this.soDT = soDT;
    }

    public void setTrinhDo(String trinhDo) {
        this.trinhDo = trinhDo;
    }

    public void setChuyenNganh(String ChuyenNganh) {
        this.chuyenNganh = ChuyenNganh;
    }
    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getCCCD() {
        return CCCD;
    }

    public void setCCCD(String CCCD) {
        this.CCCD = CCCD;
    }
    
    @Override
    public String toString(){
        
        return maTD + ";" + hoTen + ";" + ngaySinh + ";" + gioiTinh + ";" + queQuan + ";" + CCCD + ";" + soDT + ";" + danToc + ";" + viTriTd + ";" + trinhDo + ";" + chuyenNganh + ";" + ngayNopDon+";"+TrangThai;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.maTD);
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
        final TuyenDungModel other = (TuyenDungModel) obj;
        return Objects.equals(this.maTD, other.maTD);
    }
    
}
