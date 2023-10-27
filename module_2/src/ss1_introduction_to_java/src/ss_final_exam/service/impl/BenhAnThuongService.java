package ss_final_exam.service.impl;

import ss_final_exam.repository.impl.BenhAnThuongRepository;
import ss_final_exam.service.IService;

import java.util.Scanner;

public class BenhAnThuongService implements IService {
    Scanner scanner = new Scanner(System.in);
    BenhAnThuongRepository benhAnThuongRepository = new BenhAnThuongRepository();

    public void add() {
        String benhAnCode,benhNhanCode;
        int phiNamVien = -1;
        boolean flagBenhAn = true;
        do {
            flagBenhAn = false;
            System.out.println("moi ban nhap ma benh an");
            benhAnCode = scanner.nextLine();
            if (!checkBenhAnCode(benhAnCode)) {
                flagBenhAn = true;
            }
        } while (flagBenhAn);
        boolean flagBenhNhan = true;
        do {
            flagBenhNhan = false;
            System.out.println("moi ban nhap ma benh nhan");
            benhNhanCode = scanner.nextLine();
            if (!checkBenhNhanCode(benhNhanCode)) {
                flagBenhNhan = true;
            }
        } while (flagBenhNhan);
        System.out.println("Nhap vao ho ten benh nhan");
        String name = scanner.nextLine();
        name = String.valueOf(capitalizedName(name));
        System.out.println("Nhap ngay vao vien");
        boolean flagDayIn;
        String dayIn,dayOut;
        do {
            flagDayIn = false;
            System.out.println("Moi ban nhap ngay vao vien cua benh nhan:");
            dayIn = scanner.nextLine();
            if (!checkDayIn(dayIn)) {
                flagDayIn = true;
            }
        } while (flagDayIn);
        boolean flagDayOut;
        do {
            flagDayOut = false;
            System.out.println("Moi ban nhap ngay ra vien cua benh nhan:");
            dayOut = scanner.nextLine();
            if (!checkDayOut(dayIn,dayOut)) {
                flagDayOut = true;
                System.out.println("Ban nhap khong hop le (ngay ra phai lon hon ngay vao)");
            }
        } while (flagDayOut);

        System.out.println("Moi ban nhap ly do nhap vien");
        String lyDo = scanner.nextLine();
        System.out.println("Moi ban nhap phi nam vien");
        try {
            phiNamVien = Integer.parseInt(scanner.nextLine());
        }
        catch (Exception e){
            e.printStackTrace();
            System.out.println("Moi ban nhap lai");
        }
        benhAnThuongRepository.addMedicalRecord(benhAnCode,benhNhanCode,name,dayIn,dayOut,lyDo,phiNamVien);
    }
public void delete(){
        try {
            System.out.println("Nhap vao ma benh an ban muon xoa");
            String deleteBACode = scanner.nextLine();
            boolean flag;
            String confirm;
            do {
                flag = true;
                System.out.println("Ban co chac chan muon xoa? (Y/N)");
                confirm = scanner.nextLine();
                switch (confirm) {
                    case "Y":
                        benhAnThuongRepository.deleteByBACode(deleteBACode);
                        flag = false;
                        break;
                    case "N":
                        flag = false;
                        break;
                    default:
                        flag = true;
                }
            } while (flag);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Vui long nhap lai");
        }
}
    public boolean checkBenhAnCode(String benhAnCode) {
        String regex = "^(BA)\\-\\d{3}$";
        if (benhAnCode.matches(regex)) {
            return true;
        } else {
            System.out.println("Ban da nhap sai dinh dang Ma Benh An!");
            System.out.println("vi du cho Ma Benh An la: BA-XXX (x = 0-9)");
            return false;
        }
    }

    public boolean checkBenhNhanCode(String benhNhanCode) {
        String regex = "^(BN)\\-\\d{3}$";
        if (benhNhanCode.matches(regex)) {
            return true;
        } else {
            System.out.println("Ban da nhap sai dinh dang Ma Benh Nhan!");
            System.out.println("vi du cho Ma Benh Nhan la: BN-XXX (x = 0-9)");
            return false;
        }
    }

    public StringBuilder capitalizedName(String name) {
        name = name.toLowerCase();
        String[] arr = name.split("\\s+");
        StringBuilder capitalized = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            String str1 = arr[i].substring(0, 1).toUpperCase();
            String str2 = arr[i].substring(1).toLowerCase();
            String str3 = str1 + str2;
            capitalized.append(str3).append(" ");
        }
        return capitalized;
    }

    public boolean checkDayIn(String dayIn) {
        String[] arr = dayIn.split("/");
        if (arr.length == 3) {
            try {
                int day = Integer.parseInt(arr[0]);
                int month = Integer.parseInt(arr[1]);
                int year = Integer.parseInt(arr[2]);
                if (day >= 1 && day <= 31 && month >= 1 && month <= 12 && year == 2023) {
                    return true;
                } else {
                    System.out.println("Nhap khong hop le. Vui long nhap lai theo dinh dang dd/mm/yyyy.");
                    return false;
                }
            } catch (NumberFormatException e) {
                System.out.println("Nhap khong hop le. Vui long nhap lai theo dinh dang dd/mm/yyyy.");
                return false;
            }
        } else {
            System.out.println("Nhap khong hop le. Vui long nhap lai theo dinh dang dd/mm/yyyy.");
            return false;
        }
    }

    public boolean checkDayOut(String dayCome, String dayLeave) {
        String[] arrIn = dayCome.split("/");
        String[] arrOut = dayLeave.split("/");
        if (arrOut.length == 3) {
            try {
                int dayOut = Integer.parseInt(arrOut[0]);
                int monthOut = Integer.parseInt(arrOut[1]);
                int yearOut = Integer.parseInt(arrOut[2]);
                int dayIn = Integer.parseInt(arrIn[0]);
                int monthIn = Integer.parseInt(arrIn[1]);
                int yearIn = Integer.parseInt(arrIn[2]);
                if (dayOut >= 1 && dayOut <= 31 && monthOut >= 1 && monthOut <= 12 && yearOut == 2023){
                    return (monthOut > monthIn) || (dayOut > dayIn && monthOut == monthIn) || (yearOut > yearIn);
                } else{
                    System.out.println("Nhap khong hop le. Vui long nhap lai theo dinh dang dd/mm/yyyy.");
                    return false;
                }
            } catch (NumberFormatException e) {
                System.out.println("Nhap khong hop le. Vui long nhap lai theo dinh dang dd/mm/yyyy.");
                return false;
            }
        } else {
            System.out.println("Nhap khong hop le. Vui long nhap lai theo dinh dang dd/mm/yyyy.");
            return false;
        }
    }
}
