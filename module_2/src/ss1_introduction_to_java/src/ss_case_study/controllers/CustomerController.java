package ss_case_study.controllers;

import java.util.Scanner;

public class CustomerController {
    public static void displayCustomerMenu(){
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        int choose;
        do {
            System.out.println("1. Display list customers" +
                    "\n2. Add new customer" +
                    "\n3. Edit customer" +
                    "\n4. Return main menu");
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1: {
                    System.out.println("code chuc nang display list customers");
                    break;
                }
                case 2: {
                    System.out.println("code chuc nang them moi");
                    break;
                }
                case 3: {
                    System.out.println("code chuc nang chinh sua");
                    break;
                }
                default:
                    flag = false;
            }
        } while (flag);
    }
}
