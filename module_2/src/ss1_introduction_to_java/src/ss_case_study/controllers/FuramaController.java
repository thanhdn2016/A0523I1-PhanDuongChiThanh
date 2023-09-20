package ss_case_study.controllers;

import java.util.Scanner;

public class FuramaController {
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
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    EmployeeController.displayEmployeeMenu();
                    break;
                case 2:
                    CustomerController.displayCustomerMenu();
                    break;
                case 3:
                    FacilityController.displayFacilityMenu();
                    break;
                case 4:
                    BookingController.displayBookingMenu();
                    break;
                case 5:
                    PromotionController.displayPromotionMenu();
                default:
                    flag = false;
            }
        } while (flag);
    }
}
