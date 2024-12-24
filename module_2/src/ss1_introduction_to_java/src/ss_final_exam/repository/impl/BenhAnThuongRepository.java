package ss_final_exam.repository.impl;

import ss12_java_collection_framework.Product;
import ss_final_exam.model.BenhAnThuong;
import ss_final_exam.repository.IRepository;
import ss_final_exam.util.ReadAndWrite;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class BenhAnThuongRepository implements IRepository {
    List<BenhAnThuong> benhAnThuongList = getListBenhAnThuong();
    List<String> stringList = new ArrayList<>();
    int soThuTu;
    public final String PATH_FILE = "C:/Users/cudo2/IdeaProjects/A0523I1-PhanDuongChiThanh/module_2/src/ss1_introduction_to_java/src/ss_final_exam/data/medical_records.csv";
    public List<BenhAnThuong> getListBenhAnThuong() {
        List<BenhAnThuong> benhAnThuongList = new ArrayList<>();
        List<String> stringList = ReadAndWrite.readCSVFile(PATH_FILE);
        String[] array = null;
        for (String s : stringList) {
            array = s.split(", ");
           BenhAnThuong bat = new BenhAnThuong(Integer.parseInt(array[0]), array[1], array[2], array[3],array[4],array[5],array[6],Integer.parseInt(array[7]));
            benhAnThuongList.add(bat);
            soThuTu = Integer.parseInt(array[0]);
        }
        return benhAnThuongList;
    }
public void addMedicalRecord(String maBenhAn, String maBenhNhan,String tenBenhNhan, String ngayNhapVien, String ngayRaVien, String lyDoNhapVien, int phiNamVien) {
        benhAnThuongList.add(new BenhAnThuong(++soThuTu,maBenhAn,maBenhNhan,tenBenhNhan,ngayNhapVien,ngayRaVien,lyDoNhapVien,phiNamVien));
    for (BenhAnThuong bat: benhAnThuongList) {
        stringList.add(bat.getInfoToCSV());
    }
    ReadAndWrite.writeToCSV(PATH_FILE,stringList,false);
}
public void deleteByBACode(String benhAnCode){
    for (BenhAnThuong bat: benhAnThuongList) {
        if (bat.getMaBenhAn().equalsIgnoreCase(benhAnCode)) {
            for (int i = 0; i < benhAnThuongList.size(); i++) {
                if (Objects.equals(benhAnThuongList.get(i).getMaBenhAn(), bat.getMaBenhAn())) {
                    benhAnThuongList.remove(i);
                    System.out.println("Da xoa!");
                    stringList.clear();
                    for (BenhAnThuong benhAnThuong: benhAnThuongList) {
                        stringList.add(benhAnThuong.getInfoToCSV());
                    }
                    ReadAndWrite.writeToCSV(PATH_FILE,stringList,false);
                    break;
                }
            }
            break;
        }
    }
}
public List<BenhAnThuong> displayMedicalRecord(){
    for (BenhAnThuong bat: getListBenhAnThuong()) {
        System.out.println(bat);
    }
    return getListBenhAnThuong();
}
}
