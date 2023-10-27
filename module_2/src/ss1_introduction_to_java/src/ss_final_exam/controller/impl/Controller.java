package ss_final_exam.controller.impl;

import ss_final_exam.controller.IController;
import ss_final_exam.repository.impl.BenhAnThuongRepository;
import ss_final_exam.service.impl.BenhAnThuongService;

import java.util.Scanner;

public class Controller implements IController {
    @Override
    public void displayMainMenu() {
        Scanner scanner = new Scanner(System.in);
        BenhAnThuongService benhAnThuongService = new BenhAnThuongService();
        BenhAnThuongRepository benhAnThuongRepository = new BenhAnThuongRepository();
        boolean flag = true;
        do {
            System.out.println("----- Chuong Trinh Quan Ly Benh An -----");
            System.out.println("Chon chuc nang theo so(de tiep tuc)");
            System.out.println("1. Them Moi" +
                    "\n" + "2. Xoa" +
                    "\n" + "3. Xem danh sach cac benh an" +
                    "\n" + "4. Thoat");
            int choose = -1;
            boolean chooseFlag = true;
            do {
                chooseFlag = false;
                try {
                    choose = Integer.parseInt(scanner.nextLine());
                    if (choose > 4 || choose < 0) {
                        chooseFlag = true;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    chooseFlag = true;
                }
            } while (chooseFlag);
            switch (choose) {
                case 1:
                    benhAnThuongService.add();
                    break;
                case 2:
                    benhAnThuongService.delete();
                    break;
                case 3:
                    benhAnThuongRepository.displayMedicalRecord();
                    break;
                case 4:
                    flag = false;
                    break;
                default:
                    System.out.println("ban da nhap ngoai pham vi - vui long nhap lai");
            }
        } while (flag);
    }
}
