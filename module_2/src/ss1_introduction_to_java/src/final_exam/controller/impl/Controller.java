package final_exam.controller.impl;

import final_exam.controller.IController;
import ss_case_study.controllers.*;

import java.util.Scanner;

public class Controller implements IController {
    public static void displayMainMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("----- Main Menu -----");
            System.out.println("1. Employee Management" +
                    "\n" + "2. Customer Management" +
                    "\n" + "3. Facility Management" +
                    "\n" + "4. Booking Management" +
                    "\n" + "5. Promotion Management" +
                    "\n" + "6. Exit");
            int choose = -1;
            boolean chooseFlag = true;
            do {
                chooseFlag = false;
                try {
                    choose = Integer.parseInt(scanner.nextLine());
                    if (choose > 6 || choose < 0) {
                        chooseFlag = true;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    chooseFlag = true;
                }
            } while (chooseFlag);
            switch (choose) {
                case 1:
                    System.out.println("code chuc nang");
                    break;
                case 2:
                    System.out.println("code chuc nang");
                    break;
                case 3:
                    System.out.println("code chuc nang");
                    break;
                case 4:
                    System.out.println("code chuc nang");
                    break;
                case 5:
                    System.out.println("code chuc nang");
                    break;
                case 6:
                    flag = false;
                    break;
                default:
                    System.out.println("ban da nhap ngoai pham vi - vui long nhap lai");
            }
        } while (flag);
    }
}
