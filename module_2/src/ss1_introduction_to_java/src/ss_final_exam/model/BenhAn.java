package ss_final_exam.model;

abstract class BenhAn {
    int soThuTu;
    String maBenhAn, maBenhNhan, ngayNhapVien, ngayRaVien, lyDoNhapVien,tenBenhNhan;

    @Override
    public String toString() {
        return "BenhAn{" +
                "soThuTu = " + soThuTu +
                ", maBenhAn = '" + maBenhAn + '\'' +
                ", maBenhNhan = '" + maBenhNhan + '\'' +
                ", ngayNhapVien = '" + ngayNhapVien + '\'' +
                ", ngayRaVien = '" + ngayRaVien + '\'' +
                ", lyDoNhapVien = '" + lyDoNhapVien + '\'' +
                '}';
    }

    public int getSoThuTu() {
        return soThuTu;
    }

    public void setSoThuTu(int soThuTu) {
        this.soThuTu = soThuTu;
    }

    public String getMaBenhAn() {
        return maBenhAn;
    }

    public void setMaBenhAn(String maBenhAn) {
        this.maBenhAn = maBenhAn;
    }

    public String getMaBenhNhan() {
        return maBenhNhan;
    }

    public void setMaBenhNhan(String maBenhNhan) {
        this.maBenhNhan = maBenhNhan;
    }

    public String getNgayNhapVien() {
        return ngayNhapVien;
    }

    public void setNgayNhapVien(String ngayNhapVien) {
        this.ngayNhapVien = ngayNhapVien;
    }

    public String getNgayRaVien() {
        return ngayRaVien;
    }

    public void setNgayRaVien(String ngayRaVien) {
        this.ngayRaVien = ngayRaVien;
    }

    public String getLyDoNhapVien() {
        return lyDoNhapVien;
    }

    public void setLyDoNhapVien(String lyDoNhapVien) {
        this.lyDoNhapVien = lyDoNhapVien;
    }

    public String getTenBenhNhan() {
        return tenBenhNhan;
    }

    public void setTenBenhNhan(String tenBenhNhan) {
        this.tenBenhNhan = tenBenhNhan;
    }

    public BenhAn() {
    }

    public BenhAn(int soThuTu, String maBenhAn, String maBenhNhan,String tenBenhNhan, String ngayNhapVien, String ngayRaVien, String lyDoNhapVien) {
        this.soThuTu = soThuTu;
        this.maBenhAn = maBenhAn;
        this.maBenhNhan = maBenhNhan;
        this.tenBenhNhan = tenBenhNhan;
        this.ngayNhapVien = ngayNhapVien;
        this.ngayRaVien = ngayRaVien;
        this.lyDoNhapVien = lyDoNhapVien;
    }
    public String getInfoToCSV(){
        return getSoThuTu() + ", " + getMaBenhAn() + ", " + getMaBenhNhan() + ", " +
                getTenBenhNhan() + ", "+ getNgayNhapVien() + ", " + getNgayRaVien() + ", " + getLyDoNhapVien();
    }
}
