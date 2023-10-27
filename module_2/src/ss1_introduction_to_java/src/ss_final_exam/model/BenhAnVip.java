package ss_final_exam.model;

public class BenhAnVip extends BenhAn{
    String vipType,vipTime;

    public BenhAnVip(String vipType, String vipTime) {
        this.vipType = vipType;
        this.vipTime = vipTime;
    }

    public BenhAnVip(int soThuTu, String maBenhAn, String maBenhNhan,String tenBenhNhan, String ngayNhapVien, String ngayRaVien, String lyDoNhapVien, String vipType, String vipTime) {
        super(soThuTu, maBenhAn, maBenhNhan,tenBenhNhan, ngayNhapVien, ngayRaVien, lyDoNhapVien);
        this.vipType = vipType;
        this.vipTime = vipTime;
    }

    public String getVipType() {
        return vipType;
    }

    @Override
    public String toString() {
        return "BenhAnVip{" +
                "soThuTu =" + soThuTu +
                ", maBenhAn ='" + maBenhAn + '\'' +
                ", maBenhNhan ='" + maBenhNhan + '\'' +
                ", ngayNhapVien ='" + ngayNhapVien + '\'' +
                ", ngayRaVien ='" + ngayRaVien + '\'' +
                ", lyDoNhapVien ='" + lyDoNhapVien + '\'' +
                "vipType ='" + vipType + '\'' +
                ", vipTime ='" + vipTime + '\'' +
                '}';
    }

    @Override
    public String getInfoToCSV() {
        return super.getInfoToCSV()+", "+ getVipType() + ", " + getVipTime();
    }

    public void setVipType(String vipType) {
        this.vipType = vipType;
    }

    public String getVipTime() {
        return vipTime;
    }

    public void setVipTime(String vipTime) {
        this.vipTime = vipTime;
    }
}
