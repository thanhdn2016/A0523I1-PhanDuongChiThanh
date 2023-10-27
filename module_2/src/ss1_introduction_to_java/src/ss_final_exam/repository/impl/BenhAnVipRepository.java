package ss_final_exam.repository.impl;

import ss_final_exam.model.BenhAnThuong;
import ss_final_exam.model.BenhAnVip;
import ss_final_exam.util.ReadAndWrite;

import java.util.ArrayList;
import java.util.List;

public class BenhAnVipRepository {
    int index;
    public final String PATH_FILE_VIP = "/Users/thanh/Desktop/codegym/A0523I1-PhanDuongChiThanh/module_2/src/ss1_introduction_to_java/src/ss_final_exam/data/medical_records_vip.csv";
    public List<BenhAnVip> getListBenhAnVip() {
        List<BenhAnVip> benhAnVipList = new ArrayList<>();
        List<String> stringList = ReadAndWrite.readCSVFile(PATH_FILE_VIP);
        String[] array = null;
        for (String s : stringList) {
            array = s.split(", ");
            BenhAnVip benhAnVip = new BenhAnVip(Integer.parseInt(array[0]), array[1], array[2], array[3],array[4],array[5],array[6],array[7],array[8]);
            benhAnVipList.add(benhAnVip);
            index = Integer.parseInt(array[0]);
        }
        return benhAnVipList;
    }

}
