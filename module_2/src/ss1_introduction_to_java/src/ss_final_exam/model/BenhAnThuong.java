package ss_final_exam.model;

public class BenhAnThuong extends BenhAn{
int phiNamVien;

    public BenhAnThuong(int phiNamVien) {
        this.phiNamVien = phiNamVien;
    }

    public BenhAnThuong(int soThuTu, String maBenhAn, String maBenhNhan,String tenBenhNhan, String ngayNhapVien, String ngayRaVien, String lyDoNhapVien, int phiNamVien) {
        super(soThuTu, maBenhAn, maBenhNhan,tenBenhNhan, ngayNhapVien, ngayRaVien, lyDoNhapVien);
        this.phiNamVien = phiNamVien;
    }

    public int getPhiNamVien() {
        return phiNamVien;
    }

    public void setPhiNamVien(int phiNamVien) {
        this.phiNamVien = phiNamVien;
    }

    @Override
    public String toString() {
        return "BenhAnThuong{" +
                "soThuTu = " + soThuTu +
                ", maBenhAn = '" + maBenhAn + '\'' +
                ", maBenhNhan = '" + maBenhNhan + '\'' +
                ", Ten Benh Nhan = '" + tenBenhNhan + '\'' +
                ", ngayNhapVien = '" + ngayNhapVien + '\'' +
                ", ngayRaVien = '" + ngayRaVien + '\'' +
                ", lyDoNhapVien = '" + lyDoNhapVien + '\'' +
                ", phiNamVien = " + phiNamVien +
                '}';
    }

    @Override
    public String getInfoToCSV() {
        return super.getInfoToCSV() + ", " +getPhiNamVien();
    }
}
