package ss_case_study.controllers;

import java.util.Scanner;

public class BookingController {
    public static void displayBookingMenu() {
        boolean flag = true;
        int choose;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("1. Add new booking" +
                    "\n2. Display list booking" +
                    "\n3. Create new contracts" +
                    "\n4. Display list contracts" +
                    "\n5. Edit contracts" +
                    "\n6. Return main menu");
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    System.out.println("code chuc nang them moi");
                    break;
                case 2:
                    System.out.println("Code chuc nang hien thi");
                    break;
                case 3:
                    System.out.println("code chuc nang Create new contracts");
                    break;
                case 4:
                    System.out.println("code Display list contracts");
                    break;
                case 5:
                    System.out.println("code chuc nang chinh sua");
                    break;
                default:
                    flag = false;
            }
        } while (flag);
    }
}
