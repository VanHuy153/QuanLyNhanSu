package model;

import java.util.Objects;

/**
 *
 * @author Iroha
 */
public class NhanSuModel {
    private String maNS, hoTen, ngaySinh, queQuan, CCCD, soDT, danToc,
            maPB, chucVu, trinhDo, chuyenNganh, ngayTG, hanHD;
    private boolean gioiTinh, loaiNS;

    public NhanSuModel() {
    }

    public NhanSuModel(String maNS, String hoTen, String ngaySinh, boolean gioiTinh, String queQuan, String CCCD, String soDT, String danToc,
            String maPB, String chucVu, String trinhDo, String chuyenNganh, boolean loaiNS, String ngayTG, String hanHD) {
        this.maNS = maNS;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.queQuan = queQuan;
        this.CCCD = CCCD;
        this.soDT = soDT;
        this.danToc = danToc;
        this.maPB = maPB;
        this.chucVu = chucVu;
        this.trinhDo = trinhDo;
        this.chuyenNganh = chuyenNganh;
        this.loaiNS = loaiNS;
        this.ngayTG = ngayTG;
        this.hanHD = hanHD;
    }

    public NhanSuModel(String maNS) {
        this.maNS=maNS;
    }

    public String getNgayTG() {
        return ngayTG;
    }

    public String getMaNS() {
        return maNS;
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

    public String getMaPB() {
        return maPB;
    }

    public String getChucVu() {
        return chucVu;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setNgayTG(String ngayTG) {
        this.ngayTG = ngayTG;
    }

    public void setMaNS(String maNS) {
        this.maNS = maNS;
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

    public void setMaPB(String maPB) {
        this.maPB = maPB;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
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

    public String getHanHD() {
        return hanHD;
    }

    public void setHanHD(String hanHD) {
        this.hanHD = hanHD;
    }

    public boolean isLoaiNS() {
        return loaiNS;
    }

    public void setLoaiNS(boolean loaiNS) {
        this.loaiNS = loaiNS;
    }

    
    @Override
    public String toString(){
        
        return maNS + ";" + hoTen + ";" + ngaySinh + ";" + gioiTinh + ";" + queQuan + ";" + CCCD + ";" + soDT + ";" + danToc + ";" +
            maPB + ";" + chucVu + ";" + trinhDo + ";" + chuyenNganh + ";" + loaiNS + ";" + ngayTG + ";" + hanHD;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.maNS);
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
        final NhanSuModel other = (NhanSuModel) obj;
        return Objects.equals(this.maNS, other.maNS);
    }
    
}
