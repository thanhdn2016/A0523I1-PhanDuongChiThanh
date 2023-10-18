package ss_case_study.controllers;

import java.util.Scanner;

public class FacilityController {
    public static void displayFacilityMenu() {
        Scanner scanner = new Scanner(System.in);
        int choose;
        boolean flag = true;
        do {
            System.out.println("1 Display list facility" +
                    "\n2 Add new facility" +
                    "\n3 Display list facility maintenance" +
                    "\n4 Return main menu");
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    System.out.println("code chuc nang hien thi facility");
                    break;
                case 2:
                    System.out.println("code chuc nang them moi");
                    break;
                case 3:
                    System.out.println("Code chuc nang Display list facility maintenance");
                    break;
                default:
                    flag = false;
            }
        } while (flag);
    }
}
